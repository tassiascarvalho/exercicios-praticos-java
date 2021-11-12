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
public class Prova1a {

    /**
     * @param args the command line arguments A série de Fibonacci é formada pela
     *             sequência: 0,1,1,2,3,5,8,13,21,34,... onde cada termo do 3º, é
     *             formado pela soma dos seus dois antecessores. Escreva até o 15º
     *             termo. Obs: Escolher o laço de repetição.
     */
    public static void main(String[] args) {
        Integer termo1 = 0, termo2 = 1, x = 1;

        while (x <= 15) {
            // descobre o primeiro numero da soma
            termo1 = termo1 + termo2;
            // descobre o segundo numero da soma
            termo2 = termo1 - termo2;
            System.out.println(termo1);
            x++;
        }
    }
}
