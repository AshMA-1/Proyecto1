/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author ashle
 */
import java.util.Scanner;

public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, int IR) {
        // TODO code application logic here
        int salario = 0;
        int[] arreglo = new int[5];
        Scanner ent = new Scanner(System.in);
        
        
        arreglo[0] = 200000;
        arreglo[1] = 400000;
        arreglo[2] = 600000;
        arreglo[3] = 800000;
        arreglo[4] = 800000;
        
        for (int i = 0; i < 6; i++) {

            System.out.println("Ingrese su salario: "+ i);
            arreglo[i] = ent.nextInt();
            salario += arreglo[i];

        }
        for (int i = 0; i < 6; i++) {

            System.out.println("En la posicion " + (i + 1) + " se guardo: " + arreglo[i]);
        }
        
         if(salario < 200000){
            System.out.println("El monto que debe pagar es el 0%: "+arreglo[0]);
            }else if (200000 < 4000000){
    }        
   }         
   }


