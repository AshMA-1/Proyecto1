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

            System.out.print("Nombre del paciente: ");
            sobreNombre[i] = Entrada.next();
            System.out.print("Apellidos del paciente: ");
            apellidos[i] = Entrada.next();
            System.out.print("Gènero del paciente: ");
            sexo[i] = Entrada.next();
            System.out.print("Tipo de Sangre del paciente: ");
            tipoSangre[i] = Entrada.next();
            System.out.print("Edad del paciente: ");
            edad[i] = Entrada.nextDouble();

            if (edad.length >= 60) {
                System.out.println("El paciente es de riego");
            } else {
                System.out.println("El paciente puede ser de riego");
            }
        }
    }

    public static double Riesgo(double edad[]) {
        double num = 0.9, prom = 0;
        for (int i = 0; i < edad.length; i++) {
            prom = (edad.length * num);
            System.out.println("El riego es de: " + prom);
        }
        return prom;

    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        double edad[];
        String sobreNombre[];
        String apellidos[];
        String sexo[];
        String tipoSangre[];
        double prom[];
        int n;

        System.out.print("\nIngrese la cantidad de pacientes: ");
        n = Entrada.nextInt();

        edad = new double[n];
        sobreNombre = new String[n];

        edad = new double[n];
        apellidos = new String[n];

        edad = new double[n];
        sexo = new String[n];

        edad = new double[n];
        tipoSangre = new String[n];

        edad = new double[n];
        prom = new double[n];

        Inicializar(edad, sobreNombre, apellidos, sexo, tipoSangre, Entrada);
        Riesgo(edad);

    }
}

