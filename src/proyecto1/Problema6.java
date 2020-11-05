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
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Para que el usuario digite 
        Scanner calcular = new Scanner(System.in);

        //inicialidar variables 
        int x = 0, y = 0, cuadrado, triangulo, rectangulo, area = 0;
        float circulo;
        double pi = 3.14;

        System.out.println("Qué opción desea hacer:\n 1) Cuadrado\n 2) Triangulo\n 3) Rectangulo\n 4) Circulo\n");

        area = calcular.nextInt();

        System.out.println("Favor ingrese el primer dígito: ");
        x = calcular.nextInt();
        System.out.println("Favor ingrese el segundo dígito: ");
        y = calcular.nextInt();

        //creacion de switch y agregando formulas de cada figura geometrica 
        switch (area) {
            case 1:
                cuadrado = x * x;
                //CUADRADO
                System.out.println("El área del cuadrado es: " + cuadrado);
                break;

            case 2:
                triangulo = (x * y) / 2;
                //TRIANGULO
                System.out.println("El área del triángulo es: " + triangulo);
                break;

            case 3:
                rectangulo = (x * y);
                //RECTÁNGULO 
                System.out.println("El área del rectángulo es: " + rectangulo);
                break;

            case 4:
                circulo = (int) (pi * (x * y));
                //CIRCULO
                System.out.println("El área del circulo es: " + circulo);
                break;

            //Si el usuario digita otra opción, mostrar siguiente mensaje 
            default:
                System.out.println("Opción no es válida");

        }
    }
}
