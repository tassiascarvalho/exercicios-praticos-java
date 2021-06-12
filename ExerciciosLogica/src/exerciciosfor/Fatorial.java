/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Meus Documentos
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        Scanner l = new Scanner(System.in);
        
        
        int fat = 1;
        int n, i;
        System.out.print("Digite um número: ");
        n = l.nextInt();
        
        for(i = 1; i <= n; i++){
        
        fat *= i;
            
        }
        System.out.printf("A fatorial de "+ n +" é: "+fat);
        
    }
}
