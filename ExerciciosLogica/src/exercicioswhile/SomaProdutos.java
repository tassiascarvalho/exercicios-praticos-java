/*
 * Crie um carrinho de compras, onde o usuario 
irá informar a descrição do produto e o preço, 
para finalizar a compra na descrição o usuário 
deverá informar a palavra "FIM", deverá ser 
exibido na tela o preço total da compra.
 */
package exercicioswhile;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class SomaProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String  descricao = "P";
        Double preco, totalcompra;
        
        while(!"FIM".equals(descricao)){
                System.out.println("Informe a descrição");
                descricao = ler.next();
                System.out.println("Informe o valor");
                preco = ler.nextDouble();
        }
    }
    
}
