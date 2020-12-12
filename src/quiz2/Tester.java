/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Tester {

    public static void main(String[] args) {

        Pizza sabores = new Pizza();

        System.out.println("Sabores:\n 1)Peperoni\n 2)Suprema\n 3)Jamon y Queso");
        System.out.println("Ingredientes:\n 1)Olores\n 2)Piña\n 3)Picante\n 4)Borde Relleno");
        System.out.println("Tamaños:\n 1)Grande\n 2)Mediana\n 3)Pequeña");

        MontoIngredientes costo = new MontoIngredientes();

        System.out.println("Sin ingrediente, el monto a pagar es de: 5000");
        System.out.println("Con ingrediente, el monto a pagar es de: 9000");
        System.out.println("Tamaño, el monto adicional a pagar es de: 3500");
    }

}
