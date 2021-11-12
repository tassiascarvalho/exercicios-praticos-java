/*
    1.	Desenvolva um software para receber um número, você deverá analisar se 
   o número informado é Maior ou menor do que 100. Caso seja, maior retornar um 
   msg," O número informado é maior do que 100", caso contrário "O número 
   informado é menor do que 100". (NUMERO>100)
 */
package exerciciosif;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex1NumMaiorQue100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer numero;

        System.out.println("Informe o número");
        numero = ler.nextInt();

        if (numero >= 100) {
            System.out.println("O número é Maior ou Igual");
        } else {
            System.out.println("O número é Menor");
        }
    }

}
