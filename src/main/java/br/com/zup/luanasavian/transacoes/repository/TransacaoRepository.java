package br.com.zup.luanasavian.transacoes.repository;

import br.com.zup.luanasavian.transacoes.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao,Long> {
}
