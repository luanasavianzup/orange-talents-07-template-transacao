package br.com.zup.luanasavian.transacoes.kafka;

import br.com.zup.luanasavian.transacoes.model.Transacao;
import br.com.zup.luanasavian.transacoes.repository.TransacaoRepository;
import br.com.zup.luanasavian.transacoes.request.TransacaoRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class TransacaoListener {
    Logger log = LoggerFactory.getLogger(TransacaoListener.class);
    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    @Transactional
    public void ouvir(TransacaoRequest request) {
        Transacao transacao = request.toModel();
        transacaoRepository.save(transacao);
        log.info("Transação {} salva com sucesso", request.getId());
    }
}
