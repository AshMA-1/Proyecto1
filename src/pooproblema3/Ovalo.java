/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Andres
 */
public class Ovalo {

    int posX;
    int posY;
    int ancho;
    int alto;

    public void Imprimir() {
        Random obt = new Random();
        int numero;

        for (int i = 0; i < 4; i++) {
            numero = obt.nextInt(50);
            System.out.println(numero);

        }

    }

    public void paint() {

    }

    @Override
    public String toString() {
        return "Ovalo{" + "posX=" + posX + ", posY=" + posY + ", ancho=" + ancho + ", alto=" + alto + '}';
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

}
