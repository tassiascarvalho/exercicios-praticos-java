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
public class Ex2DivisaoTurma {

     /**
     * @param args the command line arguments
     * Desenvolva um software para receber a 
     * quantidade de alunos de uma sala de aula,
     * analisar se deverá acontecer divisão de turma, 
     * para que haja divisão de turma, é necessário 
     * pelo menos 30 alunos
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer numero;
        
        System.out.println("Informe o número");
        numero = ler.nextInt();
        
        if (numero>=100){
                System.out.println("O número é Maior ou Igual");
        }else{
            System.out.println("O número é Menor");
        }
        
        
    }
    
}
