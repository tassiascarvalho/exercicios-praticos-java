/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciossimples;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class RajusteSalarial {

    /**
     * @param args the command line arguments
     * Sabendo que um funcionário terá um reajuste 
     * salarial de 20%, faça um algoritmo que leia 
     * o nome e o salário atual do funcionário e 
     * calcule qual será o valor do seu reajuste.
     */
    public static void main(String[] args) {
        Scanner ler  = new Scanner (System.in);
        String nomevendedor;
        Integer codpeca;
        Double comissao;
        
        System.out.println("Informe o vendedor");
        nomevendedor = ler.next();
        
        System.out.println("Informe o código da peça");
        codpeca = ler.nextInt();
        
        System.out.println("Informe o valor da peca");
        Double vlrpeca = ler.nextDouble();
        
        System.out.println("Informe a quantd vendida");
        Integer qtdvendida= ler.nextInt();
        
        comissao = (qtdvendida * vlrpeca) *0.05;
        
        System.out.println("O vendedor "+nomevendedor+ " irá receber R$" +comissao+ "comissão");       
        
        
    }
    
}
