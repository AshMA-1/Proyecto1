package pooproblema5;

import java.util.Scanner;

public class Vector1 {

    private Scanner insertar;
    private int[] vectores;

    public void cargar() {
        insertar = new Scanner(System.in);
        vectores = new int[5];
        for (int num = 0; num < vectores.length; num++) {
            System.out.print("Ingrese el valor " + num + ": ");
            vectores[num] = insertar.nextInt();
        }
    }

    public void ordenar() {
        for (int i = 0; i < 4; i++) {
            for (int num = 0; num < 4 - i; num++) {
                if (vectores[num] > vectores[num + 1]) {
                    int aux;
                    aux = vectores[num];
                    vectores[num] = vectores[num + 1];
                    vectores[num + 1] = aux;
                }
            }
        }
    }

    public void imprimir() {
        System.out.println("Vectores ordenados de menor a mayor");
        for (int num = 0; num < vectores.length; num++) {
            System.out.println(vectores[num]);
        }
    }

}
