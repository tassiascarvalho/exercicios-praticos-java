/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosdowhile;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class MediadeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer idade,  qtdalunos = 0;
        Double media, totalidade = 0.0;

        do {
            System.out.println("Informe a idade:");
            idade = ler.nextInt();
            if (idade != 0) {
                totalidade = totalidade + idade;
                qtdalunos++;
            }
        } while (idade != 0);

        media = totalidade / qtdalunos;

        System.out.println("média de idade: " + media);

    }

}
