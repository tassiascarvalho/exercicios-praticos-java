/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosifencadeado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex9NumeroSecreto {

    /**
     * @param args the command line arguments Faça um programa onde o usuário
     *             tente adivinhar o número que você guardou na gaveta chamada
     *             “secreto”. Dê dicas ao usuário sobre se o número chutado
     *             foi muito ALTO ou muito BAIXO.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Integer numero, secreto;
        // Ele gerar um número automaticamente
        Random gerar = new Random();
        secreto = gerar.nextInt(10);

        System.out.println("---Descubra o número---");
        System.out.println("Informe o número");
        numero = ler.nextInt();

        if (numero > secreto) {
            System.out.println("Chutou Alto");
        } else if (numero < secreto) {
            System.out.println("Chutou Baixo");
        } else {
            System.out.println("Acertou!");
        }

        System.out.println("O número secreto é: " + secreto);

    }

}
