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
public class Compugrama5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int n, m;
        boolean numeroCorrecto = false;

        do {
            System.out.print("Ingrese cantidad filas (número impar): ");
            n = teclado.nextInt();
            System.out.print("Ingrese cantidad columnas (número impar): ");
            m = teclado.nextInt();

            if (n % 2 != 0 && m % 2 != 0) {
                numeroCorrecto = true;
            } else {
                System.out.println("Error. Debe ingresar dos números impares");
            }
            System.out.println();

        } while (!numeroCorrecto);

        char matriz[][] = new char[n][m];

        int mitad = matriz[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {

                matriz[i][j] = ' ';

                System.out.print(matriz[i][j] + " * ");
            }
            System.out.println(" * ");
        }
    }

}
