/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosswitch;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex10DivisilPor3 {

    /**
     * @param args the command line arguments
     * 10.Crie um programa que verifica se um número inteiro informado
     * pelo usuário é divisível por 3.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer num, resto;
        
        System.out.println("Informe um número");
        num = ler.nextInt();
        
        resto= num%3;
        
        switch(resto){
            case 0: 
                System.out.println("é divisil por 3");
                break;
            default: 
                System.out.println("não é divisil");
                break;          
        }
    }
    
}
