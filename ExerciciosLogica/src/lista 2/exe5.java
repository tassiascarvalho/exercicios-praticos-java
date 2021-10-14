
import java.util.Scanner;

/**
Faça um programa que valide a nota digitada pelo usuário,
* ou seja, verifique se a nota está entre 0 e 10.
 */
public class exe5 {

    /**
     * @author ferbe
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      Integer nota;
      
      System.out.println("Informe sua nota para validação: ");
      nota = ler.nextInt();
      
      if (nota >= 0 && nota <= 10){
      System.out.println("Nota válida!");
    }
    else {
    System.out.println("Nota inválida!");
}
}
}