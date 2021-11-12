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
public class ordemcrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Escreva um programa que leia 3 números 
        //inteiros e imprima na tela os valores em ordem decrescente.

        Scanner ler = new Scanner(System.in);
        Integer n1, n2, n3;

        System.out.println("Informe o primeiro número");
        n1 = ler.nextInt();
        System.out.println("Informe o segundo número");
        n2 = ler.nextInt();
        System.out.println("Informe o terceiro número");
        n3 = ler.nextInt();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + "," + n2 + "," + n3);
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n1 + "," + n3 + "," + n2);
        }

    }

}
