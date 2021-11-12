/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class ExemplosFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7 - Ler 2 valores, calcular e escrever a soma dos inteiros existentes
        // entre os 2 valores lidos (incluindo os valores lidos na soma).
        // Considere que o segundo valor lido será sempre maior que
        // o primeiro valor lido.

        Scanner ler = new Scanner(System.in);
        Integer n1, n2, vtotal = 0;

        System.out.println("Informe o número inicial");
        n1 = ler.nextInt();// 10
        System.out.println("Informe o número final");
        n2 = ler.nextInt();// 20

        if (n2 > n1) {
            for (int i = n1; i <= n2; i++) {// o for é somente para percorrer o intervalo
                System.out.println("vtotal:" + vtotal + "+" + i + "=" + (vtotal + i));
                vtotal = vtotal + i;
            }
        } else {
            System.out.println("Informe um intevalor valido");
        }
    }

}
