
import java.util.Scanner;

public class exe6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer A, B;
    
    System.out.println("Informe um número inteiro: ");
    A = ler.nextInt();
    
    System.out.println("Informe outro número inteiro: ");
    B = ler.nextInt();
    
    if (A < B){
         System.out.println("O primeiro número digitado é o menor.");
    }
    else{
         System.out.println("O segundo número digitado é o menor.");
    } 
}
}