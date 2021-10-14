import java.util.Scanner;

public class exe2 {

    /**
     * @author beltrani 
     Calcular a multa: Leia a velocidade de um carro: 
     Informe "50 reais de multa" se estiver acima de 110. 
     Caso contrário jogar uma mensagem de "Bom motorista".
     * @param args
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Integer velocidade;
       
       System.out.println("Informe sua velocidade: ");
       velocidade = ler.nextInt();
       
       if (velocidade > 110){
           System.out.println("Você recebeu uma multa de 50 reais!!");
       }
       else {
      System.out.println("Você é um bom motorista! ");
    }
}
}