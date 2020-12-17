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
public class Vector2 {

    Scanner insertar;
    int[] vectores;

    public void ordenar() {
        
        Vector3 vi = new Vector3();
        vi.imprimir();
       
        
        for (int i = 0; i < 4; i++) {
            for (int num = 0; num < 4 - i; num++) {
                if (vectores[num] > vectores[num + 1]) {
                    int aux;
                    aux = vectores[num];
                    vectores[num] = vectores[num + 1];
                    vectores[num + 1] = aux;
                    Vector2 iv = new Vector2();
                }
            }
        }
    }
}
