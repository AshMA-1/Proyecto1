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
public class Alumno {
    //propiedades o atributos
    double[] puntosObtenidos;
    String[] estudiante;

    //metodos y funcionalidades 
    public void inicializar(double puntosObtenidos[], String estudiante[], Scanner operar) {
        // TODO code application logic here
        for (int i = 0; i < puntosObtenidos.length; i++) {
            System.out.print("Ingrese el nombre del alumno: ");
            estudiante[i] = operar.next();
        }

    }

}
