package br.com.zup.luanasavian.transacoes.response;

import br.com.zup.luanasavian.transacoes.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {
    private String id;
    private BigDecimal valor;
    private EstabelecimentoResponse estabelecimento;
    private CartaoResponse cartao;
    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacaoResponse() {
    }

    public TransacaoResponse(Transacao transacao) {
        this.id = transacao.getTransacaoId();
        this.valor = transacao.getValor();
        this.estabelecimento = new EstabelecimentoResponse(transacao.getEstabelecimento());
        this.cartao = new CartaoResponse(transacao.getCartao());
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
