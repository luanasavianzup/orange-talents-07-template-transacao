package br.com.zup.luanasavian.transacoes.repository;

import br.com.zup.luanasavian.transacoes.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findLast10ByCartao(String cartaoId);
}
