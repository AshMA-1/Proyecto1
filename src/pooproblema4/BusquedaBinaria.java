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
public class BusquedaBinaria {

    Scanner insertar = new Scanner(System.in);

    int tam = insertar.nextInt();
    int[] arreglo = new int[tam];

    public BusquedaBinaria() {
    }

    @Override
    public String toString() {
        return "BusquedaBinaria{" + "insertar=" + insertar + ", tam=" + tam + ", arreglo=" + arreglo + ", numBuscado=" + numBuscado + '}';
    }

    //mostrar arreglo
    public void Mostrar() {
        System.out.println("Contenido");
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("arreglo[" + j + "] = " + arreglo[j]);
        }
    }
    int numBuscado = tam;

    public void Secuencia() {
        for (int s = 0; s < arreglo.length; s++) {
            if (arreglo[s] == numBuscado) {
                System.out.println("Numero está en la posición: " + s);
            }

        }

    }

    public Scanner getInsertar() {
        return insertar;
    }

    public int getTam() {
        return tam;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public int getNumBuscado() {
        return numBuscado;
    }

    public void setInsertar(Scanner insertar) {
        this.insertar = insertar;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setNumBuscado(int numBuscado) {
        this.numBuscado = numBuscado;
    }

}
