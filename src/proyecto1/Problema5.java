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

        double pi = 0.0;
        int num = 1;

        System.out.print("Digite la cantidad que desea estimar: ");
        int cantidadNumeros = entrada.nextInt();

        for (int i = 1; i <= cantidadNumeros; i++) {
            double cantidad = 0.0;
            if (i % 2 == 0) {
                cantidad = (double) -4 / num;
            } else {
                cantidad = (double) 4 / num;
            }
            num = num + 2;
            pi = pi + cantidad;
        }
        System.out.println(pi);
    }
}
