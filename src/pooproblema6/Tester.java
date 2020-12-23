/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema6;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Tester {

    public static void main(String[] args) {
        SistemaNotasControlador c = new SistemaNotasControlador();

        Scanner s = new Scanner(System.in);

        while (true) {
            /*
            Alumno a = new Alumno();
            System.out.println("Digite el nombre del alumno:");
            a.setNombre(s.next());
            System.out.println("Digite el nombre del alumno:");
            a.setApellido(s.next());
            System.out.println("Digite el carne:");
            a.setCarne(s.nextInt());
             */

            System.out.println("Digite el nombre del alumno:");
            String x = s.next();
            System.out.println("Digite el apellido del alumno:");
            String y = s.next();
            System.out.println("Digite el carne:");
            int z = s.nextInt();

            System.out.println("Digite la nota obtenida:");
            int nota = s.nextInt();
            System.out.println("Digite puntos totales:");
            int puntosTotales = s.nextInt();
            System.out.println("Digite puntos obtenidos:");
            int puntosObtenidos = s.nextInt();

            SistemaNotasReporte sr = new SistemaNotasReporte();
            System.out.println(sr);

            SistemaNotasInterfaz padres = new SistemaNotasInterfaz();
            System.out.println("Digite el género:");
            String genero = s.next();
            System.out.println("Digite su nombre completo:");
            String nombreFamiliar = s.next();
            System.out.println("Digite su edad");
            String edad = s.next();

            SistemaNotasInterfaz si = new SistemaNotasInterfaz();
            System.out.println(si);

        }
    }
}
