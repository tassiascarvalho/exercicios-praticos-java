
import java.util.Scanner;

public class exe12 {

    /**
    Faça um programa que calcule a média de um aluno da Etec de Fernandópolis
    e exiba na tela se ele foi “Aprovado”, “Reprovado” ou ficou de “Recuperação”.
    O programa deve ler a nota de 4 bimestres e calcular a média para tomada de decisão.
     0 –  <4 : REPROVADO
     >=4 – <7 : RECUPERAÇÃO
     >=7 – 10 : APROVADO

     * @author ferbe
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1, n2, n3, n4, nota, media;
        
        System.out.println("Informe sua 1° nota: ");
        n1 = ler.nextFloat();
        
         System.out.println("Informe sua 2° nota: ");
        n2 = ler.nextFloat();
        
         System.out.println("Informe sua 3° nota: ");
        n3 = ler.nextFloat();
        
         System.out.println("Informe sua 4° nota: ");
        n4 = ler.nextFloat();
        
        media = ((n1 + n2 + n3 + n4)/4);
        
        System.out.println(" Nota -> " +media);
        
        if (media == 0 && media <4){
            System.out.println(" Situação: REPROVADO! ");
        }
        else if (media >= 4 && media <7) {
            System.out.println(" Situação: RECUPERAÇÃO! ");
        }
        else if (media >=7 && media <=10) {
        System.out.println(" Situação: APROVADO! ");
    }
    }
    
}
