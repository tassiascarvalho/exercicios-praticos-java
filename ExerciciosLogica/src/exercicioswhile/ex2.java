/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioswhile;

/**
 *
 * @author Tassia
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2. Escreva um programa que exiba os números de 100 a 1 na
        // tela em ordem decrescente.

        Integer x = 100;// Inicialização
        // Variavel Contadora, controladora

        while (x >= 1) {// Condição
            System.out.println(x); // Corpo
            x--; // iteração
        }
    }

}
