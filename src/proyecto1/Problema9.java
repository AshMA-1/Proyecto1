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
public class Problema9 {

    /**
     * @param  the command line arguments
     */
    public static void Inicializar(double Calificaciones[], String Alumnos[], Scanner Entrada) {
        // TODO code application logic here
        for (int i = 0; i < Calificaciones.length; i++) {
            System.out.print("Ingrese el nombre del alumno: ");
            Alumnos[i] = Entrada.next();
            System.out.print("Ingrese la calificación: ");
            Calificaciones[i] = Entrada.nextDouble();
        }

    }
    
    public static double Promedio(double Calificaciones[]) {
        double prom, suma = 0;
        for (int i = 0; i < Calificaciones.length; i++) {
            suma += Calificaciones[i];
        }
        prom = suma / Calificaciones.length;
        return prom;
    }
    
    public static void Imprimir(double Calificaciones[], String Alumnos[], double Promedio) {
        System.out.printf("%-30s %-30s%n%n", "Alumnos", "Calififcacion");
        for (int i = 0; i < Calificaciones.length; i++) {
            System.out.printf("%-30s %-30f%n", Alumnos[i], Calificaciones[i]);
        }
        System.out.println("\nEl promedio grupal es: " + Promedio);
    }

    public static void Mayor(double Calificaciones[], String Alumnos[]) {
        double Mayor = 0;
        String Alumno = null;
        for (int i = 0; i < Calificaciones.length; i++) {
            if (Calificaciones[i] > Mayor) {
                Mayor = Calificaciones[i];
                Alumno = Alumnos[i];
            }
        }
        System.out.print("La calificación más alta es: " + Mayor);
    }
    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        double Calificaciones[];
        String Alumnos[];
        int n;
        double Promedio;

        System.out.print("Ingrese la cantidad de alumnos: ");
        n = Entrada.nextInt();

        Calificaciones = new double[n];
        Alumnos = new String[n];

        Inicializar(Calificaciones, Alumnos, Entrada);
        Promedio = Promedio(Calificaciones);
        Imprimir(Calificaciones, Alumnos, Promedio);

    }
}
