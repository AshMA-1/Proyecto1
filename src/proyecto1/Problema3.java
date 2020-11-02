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
    public void calcularImpuesto(int numDependientes, double salario){
        // TODO code application logic here
        Scanner calcular = new Scanner(System.in);
        double arreglo[] = {0, 1, 2, 3, 4};
        double a = 0,b = 0,c = 0,d = 0,e = 0;
        int valor = 0;
        int ingreso;
        
        arreglo[0] = 1;
        arreglo[1] = 0.9;
        arreglo[2] = 0.7;
        arreglo[3] = 0.6;
        arreglo[4] = 0.4;
        
        System.out.println("Presione el salario aproximado:\n 1) Salario menor a 200.000\n 2)Salario igual a 200.000 y menor a 400.000\n 3) Salario igual a 400.000 y menor a 600.000\n 4) Salario igual a 600.000 y menor a 800.000\n 5) Salario mayor o igual a 800.000\n");
        salario = calcular.nextInt();
        
        System.out.println("Ingrese aquí su salario: ");
        ingreso = calcular.nextInt();

        switch (valor) {
            case 1:
                a = salario * arreglo[0];
                //CUADRADO
                System.out.println("El Impuesto de Renta a pagar es: " + a);
                break;

            case 2:
                b = salario * arreglo[1];
                //TRIANGULO
                System.out.println("El Impuesto de Renta a pagar es: " + b);
                break;

            case 3:
                c = salario * arreglo[2];
                //TRIANGULO
                System.out.println("El Impuesto de Renta a pagar es: " + c);
                break;

            case 4:
                d = salario * arreglo[3];
                //TRIANGULO
                System.out.println("El Impuesto de Renta a pagar es: " + d);
                break;

            case 5:
                e = salario * arreglo[4];
                //TRIANGULO
                System.out.println("El Impuesto de Renta a pagar es: " + e);
                break;
        }

    }
public static void main(String[] args) {
}
    
}


