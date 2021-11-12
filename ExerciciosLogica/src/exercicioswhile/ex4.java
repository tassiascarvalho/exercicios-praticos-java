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
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4.Faça um programa que gera e escreve os
        // números ímpares dos números lidos entre 100 e 200.

        Integer contadora = 100;

        while (contadora <= 200) {
            if (contadora % 2 != 0) {
                System.out.println(contadora);
            }
            contadora++;
        }
    }

}
