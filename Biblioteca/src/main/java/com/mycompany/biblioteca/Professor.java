/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author 55199
 */
public class Professor extends Pessoa{
    private String titulacao;
    private String dataContratacao;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Professor(String titulacao, String dataContratacao, String nome, String data) {
        super(nome, data);
        this.titulacao = titulacao;
        this.dataContratacao = dataContratacao;
    }
}
