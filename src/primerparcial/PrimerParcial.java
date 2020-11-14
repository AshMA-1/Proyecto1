/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class PrimerParcial {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    public static void Inicializar(double edad[], String sobreNombre[], String apellidos[], String sexo[], String tipoSangre[], Scanner Entrada) {
        // TODO code application logic here
        for (int i = 0; i < edad.length; i++) {

            System.out.print("Ingrese el nombre del paciente: ");
            sobreNombre[i] = Entrada.next();
            System.out.print("Ingrese el apellido del paciente: ");
            apellidos[i] = Entrada.next();
            System.out.print("Ingrese el gènero del paciente: ");
            sexo[i] = Entrada.next();
            System.out.print("Ingrese el tipo de Sangre del paciente: ");
            tipoSangre[i] = Entrada.next();
            System.out.print("Ingrese la edad: ");
            edad[i] = Entrada.nextDouble();

        }
    }

    public static double Riesgo(double edad[]) {
        double num = 0.9, prom;
        for (int i = 0; i < edad.length; i++) {

        }

        prom = num * edad.length;
        return prom;
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        double edad[];
        String sobreNombre[];
        String apellidos[];
        String sexo[];
        String tipoSangre[];
        int n;

        System.out.print("Ingrese la cantidad de pacientes: ");
        n = Entrada.nextInt();

        edad = new double[n];
        sobreNombre = new String[n];

        edad = new double[n];
        apellidos = new String[n];

        edad = new double[n];
        sexo = new String[n];

        edad = new double[n];
        tipoSangre = new String[n];

        Inicializar(edad, sobreNombre, apellidos, sexo, tipoSangre, Entrada);
        Riesgo(edad);

    }
}
