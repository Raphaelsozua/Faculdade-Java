/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author 55199
 */
public class Livro {
    private String nome;
    private String editora;
    private String isbn;
    private Pessoa pessoa;

    public Livro(String nome, String editora, String isbn) {
        this.nome = nome;
        this.editora = editora;
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public void devolverLivro(){
        setPessoa(null);
    }
    
    public void comQuemEsta(){
        if(pessoa != null)
            System.out.println("o livro "+ nome + " esta com " +pessoa.getNome());
        else
            System.out.println("o livro "+ nome + " esta disponivel para retirada.");
       }
    public void mostrar(){
        System.out.println("nome: "+nome);
        System.out.println("editora: "+editora);
        System.out.println("ISSN: "+isbn);
    }
}
