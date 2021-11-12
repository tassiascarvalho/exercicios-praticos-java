/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioswhile;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class SomaNumeros {

    /**
     * @param args the command line arguments 1. Escreva um programa que exiba os
     *             números de 1 a 100 na tela em ordem crescente.
     * 
     *             Todo laço de repeticição precisa obrigatoriamente de uma
     *             variavel contadora
     */
    public static void main(String[] args) {
        /*
         * 8 - Escrever um programa que leia um conjunto de números positivos, e exiba
         * se o número lido é par ou ímpar. Exiba ao final a soma total dos números
         * pares lidos e também a soma dos números ímpares lidos. Suporemos que o
         * número de elementos deste conjunto não é conhecido, e que um número
         * negativo será utilizado para sinalizar o fim dos dados.
         */
        Scanner ler = new Scanner(System.in);
        Integer total = 0;
        System.out.println("Informe o primeiro numero");
        Integer numero = ler.nextInt();

        while (numero >= 0) {
            System.out.println("Informe o número");
            numero = ler.nextInt();
            total = total + numero;
        }
        System.out.println("O total é :" + total);
    }

}
