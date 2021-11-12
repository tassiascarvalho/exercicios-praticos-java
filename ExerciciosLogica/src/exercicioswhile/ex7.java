/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioswhile;

/**
 *
 * @author Tassia
 */
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7 - Nosso amigo Bart Simpson fica sempre de castigo, onde ele precisa
        // escrever 1000 vezes no quadro uma determinada frase. Ele precisa da
        // sua ajuda para fazer um programa em Java que escreva 1000 vezes a frase
        // no quadro: "Eu devo fazer os exercícios de LP e ir bem nas Atividades

        Integer cont = 1;

        while (cont <= 1000) {
            System.out.println(cont + " - Eu devo fazer os exercícios de LP e ir bem nas Atividades");
            cont++;
        }
    }

}
