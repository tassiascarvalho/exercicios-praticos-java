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
public class SomaProdutoFim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nproduto = "n";
        Double vproduto = 0.0;
        Double totalp = 0.0;

        while (!"FIM".equals(nproduto)) {
            System.out.println("Informe a descrição do produto");
            nproduto = ler.next();
            System.out.println("Informe o valor");
            vproduto = ler.nextDouble();

            totalp = vproduto + totalp;
        }
        ler.close();
    }

}
