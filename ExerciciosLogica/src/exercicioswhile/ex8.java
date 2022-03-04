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
public class ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8 - Escrever um programa que leia um conjunto de números
        // positivos, e exiba se o número lido é par ou ímpar. Exiba ao final
        // a soma total dos números pares lidos e também a soma dos números
        // ímpares lidos. Suporemos que o número de elementos deste conjunto
        // não é conhecido, e que um número negativo será utilizado para
        // sinalizar o fim dos dados.

        Scanner ler = new Scanner(System.in);
        Integer numimpar = 0, numpar = 0, numero = 0;

        System.out.println("informe um numero negativo no final da operação para encerrar ela.");

        while (numero >= 0) {
            System.out.println("Digite um numero");
            numero = ler.nextInt();
            if (numero >= 0) {

                if (numero % 2 == 0) {
                    numpar = numpar + numero;
                    System.out.println("esse numero é par");
                } else {
                    numimpar = numimpar + numero;
                    System.out.println("esse numero é impar");
                }

            }
            System.out.println("Somatoria de numeros pares: " + numpar);
            System.out.println("Somatoria de numeros impar: " + numimpar);
            ler.close();
        }

    }

}
