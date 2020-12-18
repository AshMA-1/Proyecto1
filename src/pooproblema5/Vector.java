package pooproblema5;

import java.util.Scanner;

public class Vector {

    private Scanner insertar;
    private int[] vectores;

    public Vector() {

    }

    public Vector(Scanner insertar, int[] vectores) {
        this.insertar = insertar;
        this.vectores = vectores;
    }

    @Override
    public String toString() {
        return "Vector1{" + "insertar=" + insertar + ", vectores=" + vectores + '}';
    }

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

    public Scanner getInsertar() {
        return insertar;
    }

    public int[] getVectores() {
        return vectores;
    }

    public void setInsertar(Scanner insertar) {
        this.insertar = insertar;
    }

    public void setVectores(int[] vectores) {
        this.vectores = vectores;
    }

}
