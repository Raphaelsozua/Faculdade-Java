/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author 55199
 */
public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private Telefone telefone;
    private Arraylist livros;

    public Pessoa(String nome, String data) {
        this.nome = nome;
        this.dataDeNascimento = data;
        
        telefone = new Telefone();
        livros = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

     public void setTelefone(String ddd, String num) {
        telefone.setDdd(ddd);
        telefone.setNumero(num);
    }
    public String getTelefone() {
        return "("+telefone.getDdd()+ ")"+ telefone.getNumero();
    }

  public void addLivro(Livro livro){
      if(livro != null){
          livros.add(livros);
      }
  }
  public void listarLivrosRetirados(){
      if (livros != null && livros.size() >0 ){
          Livro livro;
          System.out.println("Livros retirados por: " + nome);
          
          for (int aux=0; aux <livros.size(); aux++){
              livro = (Livro)livros.get(aux);
              System.out.println("LIVRO -" +(aux+1)+ " : ");
              livro.mostrar();
          }
         
      }else
          System.out.println(nome+" não tem livro(s) retirado (s)");
  }
  public void devolverLivro(Livro livroDevolvido){
      if (livros != null && livros.size()>0){
      Livro livro;
      
      for(int aux = 0; aux < livros.size(); aux++){
          livro = (Livro) livros.get(aux);
          
          if(livro.getIsbn().equals(livroDevolvido.getIsbn())){
              livros.remove(aux);
              livroDevolvido.devolverLivro();
          }
      }
  }
  }
   public void retirarLivro(Livro livro){
       if(livro != null){
           addLivro(livro);
           livro.setPessoa(this);
       }
   }
      
  }
    
    

