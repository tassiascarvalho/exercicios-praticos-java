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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome1, nome2, nome3;
       
        System.out.println("Primero Nome");
        nome1 = ler.next();
        System.out.println("Segundo Nome");
        nome2 = ler.next();
        System.out.println("Teceiro Nome");
        nome3 = ler.next();
        
               
        System.out.println("Ordem inversa:" + nome3 + ", " + nome2 +", " + nome1);
    }
}
