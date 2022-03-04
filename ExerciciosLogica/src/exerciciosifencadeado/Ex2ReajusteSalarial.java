/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosifencadeado;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Ex2ReajusteSalarial {

       /**
        * @param args the command line arguments 2.Desenvolva um software para calcular
        *             o reajuste salarial. Por padrão, o aumento será de 15%.
        *             Entretanto, deve ser aplicada uma regra diferente para cada faixa
        *             salarial. Regras: para 1.500,00 >= salarioAtual < 1.750,00:
        *             aumento igual a 12% para 1.750,00 >= salarioAtual < 2.000,00:
        *             aumento igual a 10% para 2.000,00 >= salarioAtual < 3.000,00:
        *             aumento igual a 7% para acima de 3.000,00: aumento igual a 5%.
        */
       public static void main(String[] args) {
              Scanner ler = new Scanner(System.in);
              Double salario, reajuste;
              System.out.println("-----------------------------");
              System.out.println("---Informe o salario atual---");
              salario = ler.nextDouble();
              System.out.println("-----------------------------");

              if (salario < 1500) {
                     reajuste = salario * 0.15;
              } else if (salario >= 1500 && salario < 1750) {
                     reajuste = salario * 0.12;
              } else if (salario >= 1750 && salario < 2000) {
                     reajuste = salario * 0.10;
              } else if (salario >= 2000 && salario < 3000) {
                     reajuste = salario * 0.07;
              } else {
                     reajuste = salario * 0.05;
              }

              System.out.println("Valor Atual: " + salario);
              System.out.println("Valor Reajuste: " + reajuste);
              System.out.println("Valor Novo Salario: " + (salario + reajuste));
              ler.close();
       }

}
