/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosfor;

/**
 *
 * @author Tassia
 */
public class TodasTabuadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8 - Escreva um algoritmo que imprima a tabuada (de 1 a 10)
        // para os números de 1 a 10.
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.println(x + "*" + y + "=" + (x * y));
            }
        }
    }
}
