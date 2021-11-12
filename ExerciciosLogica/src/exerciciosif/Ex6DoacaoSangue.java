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
public class Ex6DoacaoSangue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        Double peso;
        Integer idade;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome:");
        nome = ler.next();

        System.out.println("Informe o peso:");
        peso = ler.nextDouble();

        System.out.println("Informe a idade:");
        idade = ler.nextInt();

        if (peso >= 50 && idade >= 16) {
            System.out.println(nome + " - Pode Doar");
        } else {
            System.out.println(nome + " - Não pode doar");
        }

    }

}
