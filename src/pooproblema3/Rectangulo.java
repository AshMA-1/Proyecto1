/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema3;

import java.util.Random;

/**
 *
 * @author ashle
 */
public class Rectangulo {

    int base, altura, medidaX, medidaY;

    public void Mostrar() {
        Random obt = new Random();
        int numero;

        for (int i = 0; i < 4; i++) {
            numero = obt.nextInt(50);
            System.out.println(numero);

        }

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", medidaX=" + medidaX + ", medidaY=" + medidaY + '}';
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getMedidaX() {
        return medidaX;
    }

    public int getMedidaY() {
        return medidaY;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setMedidaX(int medidaX) {
        this.medidaX = medidaX;
    }

    public void setMedidaY(int medidaY) {
        this.medidaY = medidaY;
    }

}
