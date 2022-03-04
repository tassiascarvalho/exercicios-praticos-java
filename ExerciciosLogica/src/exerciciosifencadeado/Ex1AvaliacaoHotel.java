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
public class Ex1AvaliacaoHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer qtdEstrelas;

        System.out.println("Informe A Avaliação do Hotel de 1-5");
        qtdEstrelas = ler.nextInt();

        if (qtdEstrelas == 1) {
            System.out.println("Pessimo");
        } else if (qtdEstrelas == 2) {
            System.out.println("Ruim");
        } else if (qtdEstrelas == 3) {
            System.out.println("Médio");
        } else if (qtdEstrelas == 4) {
            System.out.println("Bom");
        } else if (qtdEstrelas == 5) {
            System.out.println("Ótimo");
        } else {
            System.out.println("Avaliação inválida");
        }
        ler.close();
    }

}
