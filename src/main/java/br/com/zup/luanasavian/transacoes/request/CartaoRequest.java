package br.com.zup.luanasavian.transacoes.request;

import br.com.zup.luanasavian.transacoes.model.Cartao;

public class CartaoRequest {
    private String id;
    private String email;

    @Deprecated
    public CartaoRequest(){}

    public CartaoRequest(String id, String email) {
        this.id = id;
        this.email = email;
    }
    public Cartao toModel(){
        return new Cartao(id,email);
    }
}
