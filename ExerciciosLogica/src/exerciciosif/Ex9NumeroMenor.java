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
public class Ex9NumeroMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer num1, num2, num3;

        System.out.println("Informe o 1º Numero");
        num1 = ler.nextInt();
        System.out.println("Informe o 2º Numero");
        num2 = ler.nextInt();
        System.out.println("Informe o 3º Numero");
        num3 = ler.nextInt();
        
        if ((num1 < num2) && (num1 < num3)) {
            System.out.println(num1 + " O num1 é o menor");
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println(num2 + " O num2 é o menor");
        } else if ((num3 < num1) && (num3 < num2)) {
            System.out.println(num3 + " O num3 é o menor");
        }
    }
}