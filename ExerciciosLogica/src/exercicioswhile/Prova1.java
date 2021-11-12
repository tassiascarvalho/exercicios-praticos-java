/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioswhile;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Prova1 {

    /**
     * @param args the command line arguments Desenvolva um software para o seguinte
     *             contexto: em uma eleição presidencial existem três candidatos.
     *             Os votos são informados através de códigos. Os dados
     *             utilizados para a contagem dos votos obedecem à seguinte
     *             codificação: 1 – Kiko 2 – Chaves 3 - Chiquinha 4 - Voto
     *             nulo 5 - Voto em branco 15 - Encerrar a votação.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer voto = 0, totalvkiko = 0, totalvchaves = 0, totalvchiquinha = 0, totalvnulo = 0, totalvbranco = 0;
        System.out.println("Informe o candidato seguindo os critérios abaixo:");
        System.out.println("1 - Kiko");
        System.out.println("2 - Chaves");
        System.out.println("3 - Chiquinha");
        System.out.println("4 - Voto nulo");
        System.out.println("5 - Voto em branco");
        System.out.println("DIGITE 15 para encerrar a votação");

        while (voto != 15) {
            System.out.println("Informe o voto");
            voto = ler.nextInt();

            switch (voto) {
            case 1:
                totalvkiko++;
                break;
            case 2:
                totalvchaves++;
                break;
            case 3:
                totalvchiquinha++;
                break;
            case 4:
                totalvnulo++;
                break;
            case 5:
                totalvbranco++;
                break;
            default:
                System.out.println("Canditato Inválido");
            }
        }

        System.out.println("Total de Votos Kiko: " + totalvkiko);
        System.out.println("Total de Votos Chaves: " + totalvchaves);
        System.out.println("Total de Votos Chiquinha: " + totalvchiquinha);
        System.out.println("Total de Votos Nulo: " + totalvnulo);
        System.out.println("Total de Votos Brancos: " + totalvbranco);
    }
}
