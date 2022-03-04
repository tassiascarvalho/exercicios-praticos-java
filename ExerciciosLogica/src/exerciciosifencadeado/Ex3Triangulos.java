/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosifencadeado;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex3Triangulos {

    /**
     * @param args the command line arguments 3.Faça um programa que verifique se
     *             os três lados digitados pelo usuário podem formar um
     *             triângulo. Em caso positivo, classifique o triângulo em
     *             “Equilátero”, “Escaleno” ou “Isósceles”.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Integer lado1, lado2, lado3;

        System.out.println("-------Triângulos--------");
        System.out.println("Informe o primeiro lado");
        lado1 = ler.nextInt();
        System.out.println("Informe o segundo lado");
        lado2 = ler.nextInt();
        System.out.println("Informe o terceiro lado");
        lado3 = ler.nextInt();
        System.out.println("-------------------------");

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            System.out.println("Escaleno");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Isósceles");
        }
        ler.close();
    }

}
