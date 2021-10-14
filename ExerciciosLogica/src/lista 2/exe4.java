
import java.util.Scanner;


/**
 Está acontecendo uma campanha de doação de sangue na cidade de Fernandópolis, 
 * mas existem algumas restrições para doação, onde o peso deve ser maior ou
 * igual a 50 e ter pelo menos 16 anos de idade. Desenvolva um software para receber o nome,
 * o peso e a idade de uma pessoa, como resultado exiba uma mensagem informando se 
 * "pode doar", ou se "não pode doar"
 * @author beltrani

 */
public class exe4 {

    /*
     * @param args 
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Integer idade;
       float peso;
       
       System.out.println(" **** Coleta de informações para doação de sangue ****");
       System.out.println("Informe sua idade: ");
       idade = ler.nextInt();
          
       System.out.println("Informe seu peso: ");
       peso = ler.nextFloat();
       
       if (idade >= 16 && peso >=50){
           System.out.println("Você está apto para doar sangue!");
       }
       else {
           System.out.println("Você não está apto para doar sangue.");
       }
    }
    
}
