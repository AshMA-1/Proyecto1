/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Tester {

    public static void main(String a[]) {

        EquipoSonidoControlador controlador = new EquipoSonidoControlador();
        controlador.iniciar();

        Scanner entrada = new Scanner(System.in);

        Radio r = new Radio();
        r.funcionalidad();

        Vista es = new Vista();
        es.insertarMusica();
        es.nivelVolumen();
        es.ordenar();

        Parlante p = new Parlante();
        p.parlantes(0, true);

        Reloj re = new Reloj();
    }

}

