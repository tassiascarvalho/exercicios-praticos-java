/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciossimples;

import java.util.Scanner;



/**
 *
 * @author Meus Documentos
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("*************************");
        System.out.println("Multiplicação");
        System.out.println("*************************");
        System.out.println("Digite o primeiro número:");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = ler.nextInt();
        
        int r = n1*n2;       
                       
        System.out.println("O total da multiplicação é: " +r+".");
        
    }
}
