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
        int num = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dígito: " + num);
        num = entrada.nextInt();

        int i;
        int[] factorial = null;
        factorial[0] = 1;
        for (i = 1; i <= num; i++) {
            factorial[i] = i * factorial[i - 1];
            System.out.println("El factorial es " + factorial);
        }
        System.out.println("El factorial es " + factorial);
    }
}
