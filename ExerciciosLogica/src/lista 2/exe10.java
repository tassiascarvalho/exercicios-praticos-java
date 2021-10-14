
import java.util.Scanner;


public class exe10 {

    /*
    3.	Faça um programa que verifique se os três lados digitados pelo usuário podem formar um triângulo.
    Em caso positivo, classifique o triângulo em “Equilátero”, “Escaleno” ou “Isósceles”.
       @author beltrani
      @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);      
         int lado1, lado2, lado3;
        
        System.out.println("Formação de triângulos - Equilátero - Escaleno - Isósceles - ");
        System.out.println("Informe o 1° lado:");
        lado1 = ler.nextInt();
        
        System.out.println("Informe o 2° lado:");
        lado2 = ler.nextInt();
        
        System.out.println("Informe o 3° lado:");
        lado3 = ler.nextInt();
        
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("- Triângulo Equilátero -");
        }
        else if (lado1 != lado2 && lado1 != lado3){
             System.out.println("- Triângulo Escaleno -");
        }
        else if (lado1 == lado2 && lado1 != lado3){
             System.out.println("- Triângulo Isósceles -");
        }
        else if (lado1 != lado2 && lado1 == lado3){
             System.out.println("- Triângulo Isósceles -");
        }
    }

    }
    

