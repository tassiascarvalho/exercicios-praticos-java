/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosif;

import java.util.Scanner;

/**
 *
 * @author Meus Documentos
 */
public class NumMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Declaração das variaveis
        double  n2, n3;

        //Entrada de dados
        System.out.println("Primeira Nota");
        double n1 = ler.nextDouble();
        System.out.println("Segundo Nota");
        n2 = ler.nextDouble();
        System.out.println("Terceiro Nota");
        n3 = ler.nextDouble();
        
        System.out.println("Deseja média aritmetica ou ponderada");
        System.out.println("Informe A para aritimetca ou B para ponderada");
        String op = ler.next();
        double media;
        
        if("A".equals(op)){
            media = (n1+n2+n3)/3;
            System.out.println("A Média foi: "+media);
        }else if("B".equals(op)){
            media = (n1*3+n2*3+n3*4)/10;
            System.out.println("A média foi: " + media);
        }else{
            System.out.println("Informe uma opção válida");
        }
        
     

    }
}
