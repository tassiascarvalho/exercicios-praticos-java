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
public class Ex7ValorPagoPlanoSaudeSwitch {

    /**
     * @param args the command line arguments
     * 7)Criar um programa para identificar o valor a ser pago por um plano de saúde
     * dada a idade do conveniado considerando que todos pagam R$ 100 mais um adicional 
     * conforme a seguinte tabela: 
        1) crianças com menos de 10 anos pagam R$80; 
        2) conveniados com idade entre 10 e 30 anos pagam R$50;
        3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e
        4) conveniados com mais de 60 anos pagam R$130.

     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Integer idade;
        Double valorPago;
        String mes;
        
        System.out.println("Informe o Mês");
        mes = ler.next();
        
        switch(mes){
             
        }    
    }
    
}
