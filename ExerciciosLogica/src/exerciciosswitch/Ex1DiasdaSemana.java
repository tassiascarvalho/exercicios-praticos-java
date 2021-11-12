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
public class Ex1DiasdaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Faça a leitura de um número de 1 a 7, e idenfique a qual dia da semana 
        // esse número corresponde, considere domingo sendo 1.
        
        Scanner ler = new Scanner(System.in);
        
        Integer dia;
        
        System.out.println("------Dias da semana-----");
        System.out.println("Informe um número do dia da semana");
        dia = ler.nextInt();
        
        switch(dia){
            case 1: System.out.println("Domingo");break;
            case 2: System.out.println("Segunda");break;
            case 3: System.out.println("Terça");break;
            case 4: System.out.println("Quarta");break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sabado");break;
            default:
                    System.out.println("Informe um número válido");
        }
        
    }
    
}
