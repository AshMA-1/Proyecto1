/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

import java.util.Scanner;

public class Tester {

    public static void main(String args[]) {

        SistemaNotas sistema = new SistemaNotas();
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

            Alumno alum = new Alumno();

            System.out.println("Digite la nota obtenida:");
            int nota = s.nextInt();
            System.out.println("Digite puntos totales:");
            int puntosTotales = s.nextInt();
            System.out.println("Digite puntos obtenidos:");
            int puntosObtenidos = s.nextInt();

            Examen e = new Examen(alum, nota, puntosTotales,
                    puntosObtenidos, null);

            PadreFamiliar padres = new PadreFamiliar();
            System.out.println("Digite el género:");
            String genero = s.next();
            System.out.println("Digite su nombre completo:");
            String nombreFamiliar = s.next();
            System.out.println("Digite su edad");
            String edad = s.next();

            sistema.agregarEx(e);

            sistema.mostrarExamenes();
        }

    }
}
