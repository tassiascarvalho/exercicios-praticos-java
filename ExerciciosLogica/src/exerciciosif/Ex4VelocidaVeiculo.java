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
public class Ex4VelocidaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer velocidade;
        
        System.out.println("Informe a velocidade do veiculo");
        velocidade = ler.nextInt();
        
        if (velocidade>110){
                System.out.println("Multa de R$50.00");
        }else{
            System.out.println("Bom motorista");
        }
    }
    
}
