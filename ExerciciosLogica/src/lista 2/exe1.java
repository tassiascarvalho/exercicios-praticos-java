
import java.util.Scanner;

public class Exe1 {
    
/* @author beltrani
  Desenvolva um software para receber um número, verificar se 
    o número informado é positivo ou negativo (numero>=0).
  
 */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Integer num;
       
        System.out.println("Informe um número para saber se ele é positivo ou negativo:");
        num = ler.nextInt();
        
        if (num < 0){
            System.out.println("O número é negativo.");
        }
        else {
             System.out.println("O número é positivo.");
        }

    }  
}
