/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciossimples;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class InversaoValores {

    /**
     * @param args the command line arguments
     * 7.Ler dois valores inteiros para as variáveis A e B,
     * efetuar a troca dos valores de modo que a variável A 
     * passe a possuir o valor da variável B, e a variável B 
     * passe a possuir o valor da variável A. Apresentar os 
     * valores trocados.
     */
    public static void main(String[] args) {
        Integer A, B;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe de A");
        A = ler.nextInt();        
        System.out.println("Informe de B");
        B = ler.nextInt();
        
        Integer C;
        
        C = A;
        
        A = B;
        
        B = C;
        
        System.out.println("A =" +A);
        System.out.println("B =" +B);
        
    }
    
}
