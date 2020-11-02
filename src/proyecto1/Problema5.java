/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Problema5 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double num=3.0, valor;
        int valorPI=0;
        
        System.out.println("Desea estimar el valor de PI:\n 1) 1\n 2) 0");

        valorPI = entrada.nextInt();
        
        
        switch (valorPI) {
            case 1:
                valor = 4-(4/num);
                //CUADRADO
                System.out.println("El valor de PI es: " + valor);
                break;
             
         }
     
     }
     }

