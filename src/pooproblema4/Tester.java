/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema4;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Tester {

    public static void main(String args[]) {
        Scanner insertar = new Scanner(System.in);
        System.out.println("Digite la cantidad de elementos");
        int tam = insertar.nextInt();

        int[] arreglo = new int[tam];
        //insertar elementos de arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Digite posición del número " + i + " del arreglo");
            arreglo[i] = insertar.nextInt();

        }

        int numBuscado = tam;
        int inferior = 0;
        int centro;
        int superior = tam - 1;

        while (inferior <= superior) {
            centro = (superior + inferior) / 2;
            if (arreglo[centro] == numBuscado) {
                System.out.println("Numero está en la posición: " + centro);

            } else if (numBuscado < arreglo[centro]) {
                superior = centro - 1;
            } else {
                inferior = centro + 1;
            }

        }
        BusquedaBinaria bb = new BusquedaBinaria();
        bb.Mostrar();
        bb.Secuencia();

    }

}
