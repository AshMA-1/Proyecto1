/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

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
        Scanner entrada = new Scanner(System.in);
        EquipoSonido es = new EquipoSonido();
        es.insertarMusica();
        es.ordenar();
        
        Radio r = new Radio();
        r.funcionalidad();
    }

}
