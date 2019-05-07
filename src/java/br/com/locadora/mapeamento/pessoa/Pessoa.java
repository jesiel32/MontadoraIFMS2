/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.mapeamento.pessoa;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author 05094805193
 */
//veja abaixo como mapear pelo hibernate usando @MappedSuperClass só serve para mapear as classes pai
@MappedSuperclass
//após isso começamos a mapear os atributos
public abstract class Pessoa {

    @Id
    @GeneratedValue //comando usado para fazer autoincremento ao cadastrar cada pessoa.
    private long id;
    
    @Column(length = 100, nullable = false)   //neste comando estou dizendo que ele tem 100 caracters para ser digitado e não pode ficar em branco
    private String nome;
    
    @Column(nullable = false)
    private Integer idade;
    
    @Column(length = 15, nullable = false)
    private String cpfCNPJ;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

      public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
