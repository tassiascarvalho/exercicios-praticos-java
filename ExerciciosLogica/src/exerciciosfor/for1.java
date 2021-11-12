package exerciciosfor;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tassia
 */
public class for1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = 1, num1 = 0, num2 = 1, novo;
        while (num <= 15) {
            novo = num1 + num2;
            System.out.println(novo);
            num1 = num2;
            num2 = novo;
            num++;
        }
    }
}