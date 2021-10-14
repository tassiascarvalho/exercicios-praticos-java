
import java.util.Scanner;


public class exe7 {

    /**
      Faça um programa que some dois números naturais (Maiores que zero).
     * Porém, caso o usuário digite um número negativo, seu programa deve 
     * convertê-lo para positivo automaticamente e realizar a soma.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         Integer num1, num2, nnum1, nnum2, nnum3,nnum4, resul1, resul2, resul3, resul4;
         
         System.out.println("Informe um número positivo: ");
         num1 = ler.nextInt();
        
         System.out.println("Informe outro número positivo: ");
         num2 = ler.nextInt();
         
         if (num1 < 0) {
            nnum1 = num1 * -1;
           resul1 = num2 + nnum1;
           System.out.println("O valor da soma dos dois números é " +resul1);           
         }
         else if (num2 < 0){
             nnum2 = num2 * -1;
             resul2 = num1 + nnum2;
             System.out.println("O valor da soma dos dois números é " +resul2);
         }
         else if (num1 < 0 && num2 < 0){
             nnum3 = num1 * -1;                       // tentei converter dois números negativos mas não consegui fazer dar certo :( :(
             nnum4 = num2 * -1;                         
             resul3 = nnum3 + nnum4;
             System.out.println("O valor da soma dos dois números é " +resul3);
         }        
         else {
             resul4 = num1 + num2;
              System.out.println("O valor da soma dos dois números é " +resul4);
         }
    }
    
}
