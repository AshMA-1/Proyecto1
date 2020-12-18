/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema3;

/**
 *
 * @author Andres
 */
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Tester {

    public static void main(String[] args) {
        Ovalo ov = new Ovalo();
        System.out.println("\n" + ov);
        ov.Imprimir();

        Rectangulo rec = new Rectangulo();
        System.out.println("\n" + rec);
        rec.Mostrar();

    }
}
