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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Double salario, reajuste, novosal;
        String nome;
       
        System.out.println("Reajuste Salarial");
        System.out.println("Nome:");
        nome = ler.next();
        System.out.println("Salario Atual:");
        salario = ler.nextDouble();
        
        reajuste = salario * 20/100;   
        novosal = salario + reajuste;
                       
        
        System.out.println("O reajuste sera de: " + reajuste);
        System.out.println("O novo salário de " + nome + " será: " + novosal);
    }
}
