
import java.util.Scanner;

/*
Desenvolva um software para calcular o reajuste salarial. 
Por padrão, o aumento será de 15%. Entretanto, deve ser aplicada uma regra diferente
para cada faixa salarial.
Regras:
para 1.500,00 >= salarioAtual < 1.750,00: aumento igual a 12%
para 1.750,00 >= salarioAtual < 2.000,00: aumento igual a 10%
para 2.000,00 >= salarioAtual < 3.000,00: aumento igual a 7%
para acima de 3.000,00: aumento igual a 5%.

  @author beltrani
 */
public class exe9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        double sal, salarioFinal, aumento;
        
        System.out.println("Informe seu salário: ");
        sal = ler.nextDouble();
        
        if (sal >= 1500 && sal < 1750){
           aumento = 0.12 * sal;
           salarioFinal = sal + aumento;
            System.out.println("Salário sem aumento: R$ " +sal);
            System.out.println("Seu salário desse mês é de R$ " +salarioFinal);
    }
        else if (sal >= 1750 && sal < 2000){
           aumento = 0.10 * sal;
           salarioFinal = sal + aumento;
            System.out.println("Salário sem aumento: R$ " +sal);
            System.out.println("Seu salário desse mês é de R$ " +salarioFinal);
    }
        else if (sal >= 2000 && sal < 3000){
            aumento = 0.07 * sal;
            salarioFinal = sal + aumento;
            System.out.println("Salário sem aumento: R$ " +sal);
            System.out.println("Seu salário com aumento é de R$ " +salarioFinal);
    }
        else if (sal > 3000) {
            aumento = 0.05 * sal;
            salarioFinal = sal + aumento;
             System.out.println("Salário sem aumento: R$ " +sal);
            System.out.println("Seu salário desse mês é de R$ " +salarioFinal);
    }
        else {
            System.out.println("Você não tem direito à um aumento.");
        }
}
}