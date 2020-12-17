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
public class Tester {

    public static void main(String args[]) {
        Scanner insertar;
        int[] vectores;

        Vector1 vp = new Vector1();
        vp.cargar();
        vp.ordenar();
        vp.imprimir();

        Vector1 vc = new Vector1();
        vc.cargar();

        Vector2 vo = new Vector2();
        vo.ordenar();

        Vector3 vi = new Vector3();
        vi.imprimir();

    }
}
