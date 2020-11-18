/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

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
        double[] calificaciones = null;
        String estado = null;
        double puntosObtenidos[] = null;
        String estudiante[] = null;
        double prom = 0;
        double suma = 0;

        Scanner Entrada = new Scanner(System.in);

        Scanner operar = new Scanner(System.in);

        Promedio calcular = new Promedio();

        Alumno persona = new Alumno();

        System.out.println("Digite su nota");
        double nota = Entrada.nextDouble();

        calcular.caclularPromedio(calificaciones);
        calcular.evaluarEstudiante(estado);
        persona.inicializar(puntosObtenidos, estudiante, operar);
    }

}
