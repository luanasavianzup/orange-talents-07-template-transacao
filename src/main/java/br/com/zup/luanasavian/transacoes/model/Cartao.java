package br.com.zup.luanasavian.transacoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String cartaoId;
    @NotBlank
    @Email
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String cartaoId, String email) {
        this.cartaoId = cartaoId;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getCartaoId() {
        return cartaoId;
    }

    public String getEmail() {
        return email;
    }
}
