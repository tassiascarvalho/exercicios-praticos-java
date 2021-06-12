/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciossimples;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Exercicio6CalcularEnergia {

    /**
     * @param args the command line arguments
     * - Sabe-se que o Kw de energia custa 1/5 do 
     * salário mínimo. Faça um algoritmo que receba
     * o valor do salário mínimo e a quantidade de kw 
     * gasto por uma residência. Calcule e mostre:
        a) O valor a ser pago por essa residencial;

     */
    public static void main(String[] args) {        
        Double salMin, qtdKW, vlrPago;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informar o valor atual do salário mínimo");
        salMin = ler.nextDouble();
        
        System.out.println("Informar a qtd de KW gasta pela residência");
        qtdKW = ler.nextDouble();
        
        vlrPago= (salMin/5) * qtdKW;
        
        System.out.println("O valor a ser pago é R$" + vlrPago);
        
    }
    
}
