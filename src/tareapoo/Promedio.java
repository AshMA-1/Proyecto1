/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

/**
 *
 * @author ashle
 */
public class Promedio {

    public void caclularPromedio(double calificaciones[]) {
        double prom = 0, suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        System.out.println("Su promedio es: " + prom);
    }

    public void evaluarEstudiante(String estado) {
        double prom = 0;
        if (prom < 3) {
            estado = "Usted perdió el año";
        } else {
            if (prom < 4) {
                estado = "Usted debe hacer convocatoria";
            } else {
                estado = "Usted ganó el nivel";
            }
            System.out.println(estado);
        }

    }

    public void mostrarMensaje(double prom) {
        System.out.println("Su promedio es: " + prom);
    }

}
