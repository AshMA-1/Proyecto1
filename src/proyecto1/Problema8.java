/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int  moneda_1, moneda_5, moneda_10, moneda_100, moneda_500, moneda_1000, cantidad_monedas, monedas_1, monedas_2;
        System.out.print("Ingrese la cantidad que desea calcular: ");
        cantidad_monedas = in.nextInt();
        in.nextLine();
        monedas_1 = cantidad_monedas;

        moneda_1 = (monedas_1 - monedas_1 % 1) / 1;
        monedas_1 = monedas_1 % 1;

        moneda_5 = (monedas_1 - monedas_1 % 5) / 5;
        monedas_1 = monedas_1 % 5;

        moneda_10 = (monedas_1 - monedas_1 % 10) / 10;
        monedas_1 = monedas_1 % 10;

        moneda_100 = (monedas_1 - monedas_1 % 100) / 100;
        monedas_1 = monedas_1 % 100;

        moneda_500 = (monedas_1 - monedas_1 % 500) / 500;
        monedas_1 = monedas_1 % 500;

        moneda_1000 = (monedas_1 - monedas_1 % 1000) / 1000;
        monedas_1 = monedas_1 % 1000;

        monedas_2 = (monedas_1 - monedas_1 % 2) / 2;
        monedas_1 = monedas_1 % 2;

        System.out.println("cantidad de 1: " + moneda_1);
        System.out.println("cantidad de 5: " + moneda_5);
        System.out.println("cantidad de 10: " + moneda_10);
        System.out.println("cantidad de 100: " + moneda_100);
        System.out.println("cantidad de 500: " + moneda_500);
        System.out.println("cantidad de 1000: " + moneda_1000);

        System.out.println("Valor de monedas de 1: " + monedas_1);
        System.out.println("Valor de monedas de 2: " + monedas_2);
    }

}
