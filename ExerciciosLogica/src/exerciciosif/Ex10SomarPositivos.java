/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosif;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex10SomarPositivos {

    /**
     * @param args the command line arguments
     * 9.Faça um programa que some dois números naturais (Maiores que zero). 
     * Porém, caso o usuário digite um número negativo, seu programa deve 
     * convertê-lo para positivo automaticamente e realizar a soma.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Integer numero1, numero2, soma;
        
        System.out.println("Soma de Números Naturais");
        System.out.println("Informe o primeiro número");
        numero1 = ler.nextInt();
        System.out.println("Informe o segundo número");
        numero2 = ler.nextInt();
        System.out.println("-------------------------");
        
        if(numero1<0){
            numero1 = numero1 * -1;
        }
        
        if(numero2<0){
            numero2 = numero2 * -1;
        }
        
        soma = numero1+numero2;
        
        System.out.println("A soma total é: "+soma);
        
    }
    
}
