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
public class ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 9 - Escreva um programa que calcule e exiba a média da nota
        // dos alunos de uma turma em uma prova. O número de alunos é
        // desconhecido. Os dados de um aluno são: número de matrícula e
        // a sua nota na prova em questão.

        Scanner ler = new Scanner(System.in);

        Double matricula, media = 0.0, mediatotal = 0.0;
        Integer qaluno, x;

        System.out.println("informe a quantidade de alunos");
        qaluno = ler.nextInt();// inicializa
        x = qaluno;// variavel temporaria
        while (qaluno > 0) {
            System.out.println("numero da matricula");
            matricula = ler.nextDouble();
            System.out.println("digite sua nota");
            media = ler.nextDouble();
            qaluno = qaluno - 1;// iteração

            mediatotal = mediatotal + media;// somatoria

        }
        System.out.println("media dos alunos da sala é " + mediatotal / x);
        ler.close();
    }

}
