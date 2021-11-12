/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosif;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex5Intervalo1A50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer numero;
        
        System.out.println("Informe o numero");
        numero = ler.nextInt();
        
        if (numero>=1 && numero<=50){
                System.out.println("Esta no intervalo");
        }else{
            System.out.println("Esta fora do intervalo");
        }
    }
    
}
