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
public class sintaxe {

    /**
     * @param args the command line arguments 9 - Escreva um programa que A série
     *             de Fibonacci é formada pela sequência: 1,1,2,3,5,8,13,21,34,...
     *             onde cada termo do 3º, é formado pela soma dos seus dois
     *             antecessores. Escreva até o 15º termo. Obs: Escolher o laço de
     *             repetição.
     */
    public static void main(String[] args) {
        Integer num = 1, primeiro = 0, segundo = 1, atual;
        System.out.println("1");
        while (num <= 15) {
            atual = primeiro + segundo;
            System.out.println(atual);
            primeiro = segundo;
            segundo = atual;
            num++;
        }
    }
}
