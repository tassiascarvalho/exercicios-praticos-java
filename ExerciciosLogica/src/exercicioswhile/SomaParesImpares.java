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
public class SomaParesImpares {

    /**
     * @param args the command line arguments
     * Escrever um programa que leia um conjunto 
     * de números positivos(0), e exiba se o
     * número lido é par ou ímpar(numero%2 == 0 é par)
     * Exiba ao final a soma total(acumulativa) dos 
     * números pares lidos e também a soma dos números
     * ímpares lidos. Suporemos que o número de 
     * elementos deste conjunto não é conhecido, 
     * e que um número negativo será utilizado para 
     * sinalizar o fim dos dados.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer numero=0, totalpares=0, totalimpares=0;
        
        while (numero>=0){
            System.out.println("Informe o número:");
            numero = ler.nextInt();
            
            if(numero%2 ==0){
                System.out.println("Par");
                //Variavel acumulativa.
                totalpares= totalpares+ numero;
            }else    {
                System.out.println("Impar");
                totalimpares = totalimpares + numero;
            }
        
         }
         System.out.println("Total par:"+ totalpares);
         System.out.println("Total impares:" +totalimpares);
        
    }
    
}
