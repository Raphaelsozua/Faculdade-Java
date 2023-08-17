
package com.mycompany.biblioteca;

/**
 *
 * @author 55199
 */
public class Aluno extends Pessoa{
    private String ra;
    private String curso;

    public Aluno(String ra, String curso, String nome, String data) {
        super(nome, data);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    
}
