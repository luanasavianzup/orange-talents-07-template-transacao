package br.com.zup.luanasavian.transacoes.response;

import br.com.zup.luanasavian.transacoes.model.Cartao;

public class CartaoResponse {
    private String id;
    private String email;

    @Deprecated
    public CartaoResponse() {
    }

    public CartaoResponse(Cartao cartao) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
