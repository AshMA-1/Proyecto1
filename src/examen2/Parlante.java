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
public class Parlante {

    int opcion;
    int press;
    boolean parlante;

    public Parlante() {
        this.opcion = opcion;
        this.press = press;
        this.parlante = parlante;
    }

    public boolean parlantes(int opcion, boolean parlante) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nElija una opción en los parlantes: \n1)Habilitar \n2)Deshabilitar \n");
        press = entrada.nextInt();

        switch (press) {
            case 1:
                System.out.println("Parlante se encuentra en modo " + true + ": Habilitado");
                break;

            case 2:
                System.out.println("Parlante se encuentra en modo " + false + ": Deshabilitado");
                break;
        }
        return false;

    }

    public int getOpcion() {
        return opcion;
    }

    public int getPress() {
        return press;
    }

    public boolean isParlante() {
        return parlante;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public void setPress(int press) {
        this.press = press;
    }

    public void setParlante(boolean parlante) {
        this.parlante = parlante;
    }

}
