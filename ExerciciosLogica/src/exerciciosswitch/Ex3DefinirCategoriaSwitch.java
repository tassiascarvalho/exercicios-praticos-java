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
public class Ex3DefinirCategoriaSwitch {

    /**
     * @param args the command line arguments
     * Faça um programa que receba a idade de uma pessoa e mostre na saída 
     * em qual categoria ela se encontra:
        10-14 infantil
        15-17 juvenil
        18-25 adulto
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer idade;
        
        System.out.println("Informe a idade");
        idade = ler.nextInt();
        
        switch(idade){
            case 10: case 11: case 12: case 13: case 14: 
                System.out.println("Infantil");
                break;           
            case 15: case 16: case 17: 
                System.out.println("Juvenil");
                break;           
            case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: 
                System.out.println("Adulto");
                break;           
            default:
                System.out.println("Informe uma idade válida");
                break; 
        }
    }
    
}
