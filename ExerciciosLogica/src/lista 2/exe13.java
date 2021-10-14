
import java.util.Scanner;

public class exe13 {

    /**
     Faça um programa que leia um número digitado pelo usuário e diga se o número é POSITIVO, NEGATIVO ou NULO.
     @author beltrani
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer num;
        
        System.out.println("Informe um número para saber se ele é POSITIVO, NEGATIVO ou NULO.");
        System.out.println("Digite um número inteiro: ");
        num = ler.nextInt();
        
        if (num > 0){
            System.out.println(" Número POSITIVO.");
        }
        else if (num < 0){
            System.out.println(" Número NEGATIVO.");
        }
        else {
            System.out.println(" Número NULO.");
        }
    }
    
}
