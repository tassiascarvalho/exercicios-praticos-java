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
public class Exercicio5samsung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada dados
        Scanner ler = new Scanner(System.in);
        
        Double valorproduto, valordesc, valorfinal;
                
        System.out.println("Informe a Descrição do produto");
        String descricao = ler.next();
        System.out.println("Informe o valor do produto");
        valorproduto = ler.nextDouble();
        
        valordesc = valorproduto  * 0.4;
        
             
        valorfinal = valorproduto - valordesc;
        System.out.println("Produto: " + descricao);
        System.out.println("Valor do Produto:  " + valorproduto);
        System.out.println("Valor do Desconto:  " + valordesc);
        System.out.println("Valor do Final:  " + valorfinal );
    }
    
}
