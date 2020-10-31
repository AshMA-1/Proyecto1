/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
//hacer primer ajuste
/**
 *
 * @author ashle
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

        int a;
        int b;
        int total = 0;

        Scanner insertado = new Scanner(System.in);

        System.out.print("Favor ingrese primer número");
        a = insertado.nextInt();
        System.out.print("Favor ingrese segundo número");
        b = insertado.nextInt();

        if (a != b) {
            total = a + b;
            System.out.println("El resultado de la suma es: " + total);
        }
        if (a != b) {
            total = a - b;
            System.out.println("El resultado de la resta es: " + total);
        }
        if (a != b) {
            total = a * b;
            System.out.println("El resultado de la multiplicación es: " + total);
        }
        if (a != b) {
            total = a / b;
            System.out.println("El resultado de la división es: " + total);
        }
    }
}
