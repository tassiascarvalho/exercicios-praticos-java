package exe1;

import java.util.Scanner;

/*         IF ENCADEADO
Desenvolva um software para classificar um hotel de acordo com a quantidade de estrelas:
1 estrela  - Péssimo
2 estrelas - Ruim
3 estrelas - Médio
4 estrelas - Bom 
5 estrelas – Ótimo
 @author ferbe
 */
public class exe8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Integer num;
       
       System.out.println("Informe de 1 a 5 para classificar um hotel: ");
       num = ler.nextInt();
      
       if (num == 1) {
            System.out.println("Classificado como PÉSSIMO.");
       }
       else if (num == 2){
           System.out.println("Classificado como RUIM.");
       }
       else if (num == 3){
           System.out.println("Classificado como MÉDIO.");
       }
       else if (num == 4){
           System.out.println("Classificado como BOM.");
       }
       else if (num == 5){
           System.out.println("Classificado como ÓTIMO.");
       }
       else {
           System.out.println("Comando inválido.");
       }
    }
    
}
