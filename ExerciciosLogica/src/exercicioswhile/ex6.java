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
public class ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6 - Faça um programa para imprimir uma tabuada do 3.

        Integer i = 0;

        while (i <= 10) {
            System.out.println("3x" + i + "=" + (3 * i));
            i++;
        }
    }
}
