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
public class Compugrama4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();

        if (n >= 0 && n <= 50) {
            //Linea superior
            for (int i = 0; i < n; i++) {
                System.out.print("  *  ");
            }
            System.out.println();

            //centro de la forma
            for (int i = 1; i < n; i++) {
                System.out.print("  *  ");
                for (int j = 2; j < n + 1; j++) {
                    System.out.print("     ");
                }
                System.out.println("    ");
            }

            //Linea inferior
            for (int i = 0; i < n; i++) {
                System.out.print("  *  ");
            }
        } else {
            System.out.println("Error. El dato a ingresar de "
                    + "estar entre 0 y 50");
        }
    }

}
