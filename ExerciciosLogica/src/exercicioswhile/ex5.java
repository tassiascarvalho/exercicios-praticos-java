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
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5 - Faça um programa que conte de 1 até 100 e a cada
        // múltiplo de 10 exiba uma mensagem: "Múltiplo de 10".

        Integer contadora = 100;

        while (contadora <= 100) {
            System.out.println(contadora);
            if (contadora % 10 == 0) {
                System.out.println("É multiplo de 10");
            }
            contadora++;
        }
    }

}
