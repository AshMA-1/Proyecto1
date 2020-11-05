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

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        float a = 0;

        System.out.print("Digite la cantidad que desea estimar: ");
        int cantidadNumeros = entrada.nextInt();

        for (int i = 0; 1 <= cantidadNumeros; i++) {
            if (i % 2 == 0) {
                a = a - (4 / ((4) - 1));
            } else {
                a = a + (4 / ((i++ * 2) - 1));
            }
            System.out.println("PI es el valor estimado de: " + a);
        }

    }
}
