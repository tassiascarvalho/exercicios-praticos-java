/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosswitch;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex8Calculadora {

    /**
     * @param args the command line arguments
     * 8.Faça uma calculadora para as operações de 
     * Soma e Subtração 
     * (receber apenas dois números e a operação).
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer numero1, numero2, result=0;
        String operacao;
        System.out.println("**************************");
        System.out.println("Informe o primeiro número");
        numero1= ler.nextInt();
        System.out.println("Informe o segundo número");
        numero2= ler.nextInt();
        System.out.println("Qual operação deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operacao = ler.next();
        
        switch (operacao) {
            case "Soma": 
                result= numero1+numero2;
                break;
            case "Subtração":
                result= numero1-numero2;
                break; 
            case "Multiplicação":
                result= numero1-numero2;
                break;
            case "Divisão":
                result= numero1-numero2;
                break;
            default:
                System.out.println("Informe uma operação válida");
                break;
        }
        System.out.println("O resultado é: "+ result);
        
    }
    
}
