/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author ashle
 */
import java.util.Scanner;

public class Problema3 {

    /**
     * @param the args command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner calcular = new Scanner(System.in);

        double a = 1, b = 0.9, c = 0.7, d = 0.6, e = 0.4;
        double salario;
        int ingreso = 0;
        int rango1, rango2, rango3, rango4, rango5;

        System.out.println("\nDigite cual es su salario aproximado de la siguiente lista: \n 1) Salario menor a 200.000\n 2) Salario entre 200.000 y menor a 400.000\n 3) Salario entre 400.000 y menor a 600.000\n 4) Salario entre 600.000 y menor a 800.000\n 5) Salario mayor o igual a 800.000");
        salario = calcular.nextInt();

        System.out.println("\nIndique en cual rango se encuentra : \n 1) rango1\n 2) rango2\n 3) rango3\n 4) rango4\n 5) rango5");
        ingreso = calcular.nextInt();

        switch (ingreso) {
            case 1:
                rango1 = (int) (salario * a);
                System.out.println("\nEl Impuesto de Renta a pagar es: " + rango1);
                break;

            case 2:
                rango2 = (int) (salario * b);
                System.out.println("\nEl Impuesto de Renta a pagar es: " + rango2);
                break;

            case 3:
                rango3 = (int) (salario * c);
                System.out.println("\nEl Impuesto de Renta a pagar es: " + rango3);
                break;

            case 4:
                rango4 = (int) (salario * d);
                System.out.println("\nEl Impuesto de Renta a pagar es: " + rango4);
                break;

            case 5:
                rango5 = (int) (salario * 0.4);
                System.out.println("\nEl Impuesto de Renta a pagar es: " + rango5);
                break;

            //Si el usuario digita otra opción, mostrar siguiente mensaje 
            default:
                System.out.println("Opción no es válida");

        }

    }

}
