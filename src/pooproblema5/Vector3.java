/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema5;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Vector3 {

    Scanner insertar;
    int[] vectores;

    public void imprimir() {
        Vector1 vc = new Vector1();
        vc.cargar();

        Vector2 vo = new Vector2();

        System.out.println("Vectores ordenados de menor a mayor");
        for (int num = 0; num < vectores.length; num++) {
            System.out.println(vectores[num]);
        }
    }
}
