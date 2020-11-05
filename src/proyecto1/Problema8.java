/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
//hacer primer ajuste
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
        int coin_1, coin_5, coin_10, coin_100, coin_500, bill_1000;
        int amount_of_coin, monedas_de_1;
        System.out.print("Ingrese la cantidad que desea desglosar: ");
        amount_of_coin = in.nextInt();
        in.nextLine();
        monedas_de_1 = amount_of_coin;

        bill_1000 = (monedas_de_1 - monedas_de_1 % 1000) / 1000;
        monedas_de_1 = monedas_de_1 % 1000;

        coin_500 = (monedas_de_1 - monedas_de_1 % 500) / 500;
        monedas_de_1 = monedas_de_1 % 500;

        coin_100 = (monedas_de_1 - monedas_de_1 % 100) / 100;
        monedas_de_1 = monedas_de_1 % 100;

        coin_10 = (monedas_de_1 - monedas_de_1 % 10) / 10;
        monedas_de_1 = monedas_de_1 % 10;

        coin_5 = (monedas_de_1 - monedas_de_1 % 5) / 5;
        monedas_de_1 = monedas_de_1 % 5;

        coin_1 = (monedas_de_1 - monedas_de_1 % 1) / 1;
        monedas_de_1 = monedas_de_1 % 1;

        System.out.println("Cantidad de moneda 1: " + coin_1);
        System.out.println("Cantidad de moneda 5: " + coin_5);
        System.out.println("Cantidad de moneda 10: " + coin_10);
        System.out.println("Cantidad de moneda 100: " + coin_100);
        System.out.println("Cantidad de moneda 500: " + coin_500);
        System.out.println("Cantidad de billete 1000: " + bill_1000);

    }

}
