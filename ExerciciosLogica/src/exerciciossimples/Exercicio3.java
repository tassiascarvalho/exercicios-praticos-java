/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciossimples;

import java.util.Scanner;

/**
 *
 * @author Meus Documentos
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Double nota1, nota2, nota3, nota4, media;
       
        System.out.println("Nome Aluno");
        String nome = ler.next();
        System.out.println("Nota 1º Bimestre");
        nota1 = ler.nextDouble();
        System.out.println("Nota 2º Bimestre");
        nota2 = ler.nextDouble();
        System.out.println("Nota 3º Bimestre");
        nota3 = ler.nextDouble();
        System.out.println("Nota 4º Bimestre");
        nota4 = ler.nextDouble();
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        
               
        System.out.println("A media de nota do(a)  "+nome+" foi " + media);
    }
}
