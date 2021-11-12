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
public class ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 10 - Crie um carrinho de compras, onde o usuario irá informar a
        // descrição do produto e o preço, para finalizar a compra na descrição
        // o usuário deverá informar a palavra "FIM", deverá ser exibido
        // na tela o preço total da compra.

        Scanner ler = new Scanner(System.in);

        String desc = "F";
        Double preco = 0.0, totalp = 0.0;

        while (!desc.equals("Fim")) {// para expressões com String
            System.out.println("Informe a Descrição do Produto");
            desc = ler.next();

            if (!desc.equals("Fim")) {
                System.out.println("Informe o valor do produto");
                preco = ler.nextDouble();

                totalp = totalp + preco;
            }
        }

        System.out.println("O preço a ser pago é: R$" + totalp);

    }

}