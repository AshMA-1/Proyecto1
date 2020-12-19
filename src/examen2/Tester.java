/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        EquipoSonido es = new EquipoSonido();
        es.insertarMusica();
        int cantidad = 0;
        int[] arreglo = new int[cantidad];
        //insertar elementos de arreglo
        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Códigos " + i + "musica");
            arreglo[i] = entrada.nextInt();
        }
        es.almacenarAudios();
    }

}
