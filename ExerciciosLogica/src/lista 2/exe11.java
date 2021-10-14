
import java.util.Scanner;

public class exe11 {

    /**
     Faça um programa que leia três números e diga ao usuário qual foi o MAIOR e o MENOR número digitado.
     * @author beltrani
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int num1, num2, num3, menor, maior;
       
       System.out.println("Informe 3 números para achar o MAIOR e o MENOR: ");
       System.out.println("n° 1 -> ");
       num1 = ler.nextInt();
       
       System.out.println("n° 2 -> ");
       num2 = ler.nextInt();
       
       System.out.println("n° 3 -> ");
       num3 = ler.nextInt();
       
       menor = 0;
       maior = 0;
       
   if((num1 < num2) && (num1 < num3))
        menor = num1;

    else if((num2 < num1)&&(num2 < num3))
        menor = num2;

    else if((num3 < num1)&&(num3 < num2))
        menor = num3;

    if((num1 > num2) && (num1 > num3))
        maior = num1;

    else if((num2 > num1)&&(num2 > num3))
        maior = num2;

    else if((num3 > num1)&&(num3 > num2))
        maior = num3;
    
    System.out.println(" Maior: " + maior + " Menor:" + menor);
}
}

