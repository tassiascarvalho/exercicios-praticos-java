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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Double cotacao, dolar, r;
               
        System.out.println("Conversão");
        System.out.println("Informe a cotação do dólar:");
        cotacao = ler.nextDouble();
        System.out.println("Digite o valor em dolar:");
        dolar = ler.nextDouble();
        
        r = dolar*cotacao;       
                       
        System.out.println("O valor em real é: " +r);
    }
}
