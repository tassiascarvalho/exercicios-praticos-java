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
public class numeromaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um programa que receba três num inteiros 
        //e diga qual deles é o maior e qual o menor.
        Scanner ler = new Scanner(System.in);
        Integer num1, num2, num3;
        
        System.out.println("Informe o 1º Numero");
        num1 = ler.nextInt();
        System.out.println("Informe o 2º Numero");
        num2 = ler.nextInt();
        System.out.println("Informe o 3º Numero");
        num3 = ler.nextInt();
        //o numero 1 é o maior
        if ((num1>num2) && (num1>num3))
                System.out.println("O num1 é o maior");
        else if((num2>num1) && (num2 > num3))
                System.out.println("O num2 é o maior");
        else if((num3>num1) && (num3>num2))
                System.out.println("O num3 é o maior");        
      }
    
}
