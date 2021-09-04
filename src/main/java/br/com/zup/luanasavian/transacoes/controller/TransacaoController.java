package br.com.zup.luanasavian.transacoes.controller;

import br.com.zup.luanasavian.transacoes.model.Transacao;
import br.com.zup.luanasavian.transacoes.repository.TransacaoRepository;
import br.com.zup.luanasavian.transacoes.response.TransacaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/cartoes/{id}")
    public ResponseEntity<?> get(@PathVariable String cartaoId){
        List<Transacao> transacoes = transacaoRepository.findLast10ByCartao(cartaoId);

        if(transacoes.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(transacoes.stream().map(TransacaoResponse::new).collect(Collectors.toList()));
    }
}
