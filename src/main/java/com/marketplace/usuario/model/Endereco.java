package com.marketplace.usuario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco extends EntidadeBase{

    private static final long serialVersionUID = 9079471849790496198L;

    private String logradouro;

    private String complemento;

    private String bairro;

    private String localidade;

    private String uf;

    private String unidade;

    private String ibge;

    private String gia;

    private Boolean ativo = Boolean.TRUE;

    @ManyToOne
    private Usuario usuario;

    public void setAtivo(Boolean ativo) {
        if (ativo == null)
            this.ativo = false;
        else
            this.ativo = ativo;
    }
}
