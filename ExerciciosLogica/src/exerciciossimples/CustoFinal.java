/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciossimples;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class CustoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double CustoFabrica, PorcentagemDistribuido, Imposto, CustoFinal;
        System.out.println("Informe o Custo de Fábrica: ");
        CustoFabrica = ler.nextDouble();
        PorcentagemDistribuido = CustoFabrica * 0.28;
        Imposto = CustoFabrica * 0.45;
        CustoFinal = CustoFabrica + PorcentagemDistribuido + Imposto;
        // Tudo em uma única linha
        // Cfinal = CF + (CF*0.28) + (CF*0.45);
        System.out.println("Custo Final é: " + CustoFinal);
    }

}
