
import java.util.Scanner;

public class exe3 {

    /**
      @author beltrani
     Desenvolva um software para verificar se o número digitado pertence ao intervalo de 1..50. 
             (NUM>=1 && NUM<=50)
      @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer num;

        System.out.println("Informe um número para verificar se ele está no intervalo de 1 a 50: ");
        num = ler.nextInt();
        
        if (num >= 1 && num <= 50){
            System.out.println("O número está entre esse intervalo.");
        }
        else {
             System.out.println("O número não está entre esse intervalo.");
        }
    }
    
}
