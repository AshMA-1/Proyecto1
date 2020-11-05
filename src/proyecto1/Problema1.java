/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;
//hacer primer ajuste
/**
 *
 * @author ashle
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner insertado = new Scanner(System.in);
        
        //Inicializar variables 
        int a;
        int b;
        int total = 0, press = 0, suma = 0, resta = 0, multiplicacion = 0, division = 0;
        int x;
        
        //permite que usuario digite 
        System.out.println("Qué opción desea hacer:\n 1) Suma\n 2) Resta\n 3) Multiplicación\n 4) División\n");
        press = insertado.nextInt();

        System.out.print("Favor ingrese primer número");
        a = insertado.nextInt();
        System.out.print("Favor ingrese segundo número");
        b = insertado.nextInt();
        
        //creacion de switch y formulas con cada operacion +, -, *, / para que muestre unicamente lo que el cliente desea
        switch (press) {
            case 1:
                suma = a + b;
                System.out.println("El resultado de la suma es: " + suma);
                break;

            case 2:
                resta = a - b;
                System.out.println("El resultado de la resta es: " + resta);
                break;

            case 3:
                multiplicacion = a * b;
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                break;

            case 4:
                division = a / b;
                System.out.println("El resultado de la división es: " + division);
                break;

            default:
                System.out.println("Opción no es válida");
        }
    }
}
