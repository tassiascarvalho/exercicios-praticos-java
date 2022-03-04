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
public class forex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for (<declara variável>; <condição de controle>; <incrementa a variável>)
        // {
        // ...comandos...é um laço contado
        // }
        Scanner ler = new Scanner(System.in);
        Integer ini, qtd;
        System.out.println("Informe o numero inicial");
        ini = ler.nextInt();
        System.out.println("Informe a quantidade de repetições");
        qtd = ler.nextInt();

        for (int x = ini; x <= qtd; x++) {
            System.out.println(x);

        }
        ler.close();
    }

}
