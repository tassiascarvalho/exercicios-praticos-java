/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Tassia
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
       
        for(int x=1; x<=10;x++){                
                for(int y=1;y<=10;y++){
                               System.out.println(x+"*"+y+"="+x*y); 
                }
        }
        
    }
    
}
