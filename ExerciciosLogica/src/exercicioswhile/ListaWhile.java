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
public class ListaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Escreva um programa que exiba os números de 1 a 100
        // na tela em ordem crescente.

        // Laço de repetição - Inicialização, condição, corpo, iteranção;

        Integer x = 1;// Inicialização
        // Variavel Contadora, controladora

        while (x <= 100) {// Condição
            System.out.println(x); // Corpo
            x++; // iteração
        }

    }

}
