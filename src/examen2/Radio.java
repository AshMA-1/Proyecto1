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
public class Radio {

    int apagar = 0;
    int encender = 1;
    int press;

    public Radio() {

    }

    public Radio(int press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Radio{" + "apagar=" + apagar + ", encender=" + encender + ", press=" + press + '}';
    }

    public void funcionalidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué desea hacer en la radio? Elija una opción: \n0)apagar \n1)encender ");
        press = entrada.nextInt();

        switch (press) {
            case 0:
                System.out.println("Apagar Radio");
                break;

            case 1:
                System.out.println("Encender Radio\n");
                break;
        }
    }

    public int getApagar() {
        return apagar;
    }

    public int getEncender() {
        return encender;
    }

    public int getPress() {
        return press;
    }

    public void setApagar(int apagar) {
        this.apagar = apagar;
    }

    public void setEncender(int encender) {
        this.encender = encender;
    }

    public void setPress(int press) {
        this.press = press;
    }

}
