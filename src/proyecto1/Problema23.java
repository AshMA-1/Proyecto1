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
public class Problema23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el dígito: ");
        int num = entrada.nextInt();

        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }

    public static double factorial(int suma) {
        double cantidad = 1;
        for (int i = 2; i <= suma; i++) {
            cantidad *= i;
        }
        return cantidad;
    }
}
