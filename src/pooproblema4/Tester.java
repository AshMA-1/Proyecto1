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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros = {1, 4, 8, 45, 200};
        int inicio = 0;
        int fin = numeros.length - 1;
        int buscadorNum = 200;
        int posicion = 0;
        int resultado = 0;

        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;
        }
        if (numeros[posicion] == buscadorNum) {
            resultado = posicion;
        } else if (numeros[posicion] < buscadorNum) {
            inicio = posicion + 1;
        } else {
            fin = posicion - 1;
        }
        System.out.println("Elija un número" + s);
        System.out.println("El numero" + buscadorNum + "fue encontrado en \nnumeros[" + resultado);

    }
    //return 0;
}
