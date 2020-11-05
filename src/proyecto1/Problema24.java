/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Problema24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tabla[];
        int mayor;
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el total de números");
        num = entrada.nextInt();
        tabla = new int[num];
        for (int i = 0; i < num; i++) {
      
            tabla[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dígito " + (i + 1)));
            if (num > num) {
                System.out.println("El numero mayor es :" + tabla[i]);
            } else {
                System.out.println("El numero mayor es :" + tabla[i]);
            }

        }
    }
}
