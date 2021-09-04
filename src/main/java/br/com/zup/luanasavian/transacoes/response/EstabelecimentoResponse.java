package br.com.zup.luanasavian.transacoes.response;

import br.com.zup.luanasavian.transacoes.model.Estabelecimento;

public class EstabelecimentoResponse {
    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoResponse() {
    }

    public EstabelecimentoResponse(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
        this.endereco = estabelecimento.getEndereco();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}
