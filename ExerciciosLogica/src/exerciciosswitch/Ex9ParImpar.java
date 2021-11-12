/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosswitch;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Integer num1,  resultado;
        System.out.println("Informe o número");
        num1 = ler.nextInt();

        resultado = num1 % 2;

        switch (resultado) {
            case 0:
                System.out.println("É par");
                break;
            default:
                System.out.println("É impar");
                break;
        }


    }

}
