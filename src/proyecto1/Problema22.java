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
public class Problema22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, x;

        double elementos, numeros = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuántos dígitos va a ingresar?: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite el número " + i);
            x = entrada.nextInt();
            numeros = numeros + x;
        }
        elementos = numeros / n;

        System.out.println("El Promedio es:" + elementos);
    }
}
    

