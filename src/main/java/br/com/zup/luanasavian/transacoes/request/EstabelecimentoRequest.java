package br.com.zup.luanasavian.transacoes.request;

import br.com.zup.luanasavian.transacoes.model.Estabelecimento;

public class EstabelecimentoRequest {
    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoRequest(){}

    public EstabelecimentoRequest(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }
    public Estabelecimento toModel(){
        return new Estabelecimento(nome,cidade,endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
