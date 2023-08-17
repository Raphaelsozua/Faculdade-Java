/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._8;

/**
 *
 * @author 55199
 */
public class TestaFuncionario {

    public static void main(String[] args) {

        App.valeRefeicaoDiario = 15;

        App f1 = new App();
        
        f1.nome = "beça";
        f1.salario = 1000.00;
        
        App f2 = new App();
        
        f2.nome = "thiago";
        f2.salario = 3800.00;
        
        System.out.println("Funcionario: "+ f1.nome +
                " salario: "+ f1.salario+
                " Vale Refeicao: "+ App.valeRefeicaoDiario);
        
        System.out.println("Funcionario: "+ f2.nome +
                " Salario: "+f2.salario +
                " Vale Refeicao: "+App.valeRefeicaoDiario);

    }
}
