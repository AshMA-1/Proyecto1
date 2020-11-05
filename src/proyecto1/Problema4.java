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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static boolean biciesto(int anno) {
        //Inicializar variables 
        int ano;
        int p = 4;
        int q = 100;
        int r = 400;
        boolean resultado = false;

        //Permite que el usuario digite
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese año a evaluar: ");
        ano = entrada.nextInt();

        //Inicia mi condición de si es o no año bisiesto, ciclo con IF 
        if ((ano % p == 0) && (ano % q != 0 || ano % r == 0)) {
            resultado = true;
            System.out.println(ano + " es un año bisiesto");
        } else {
            resultado = false;
            System.out.println(ano + " no es un año bisiesto");
        }

        //Retorna el resultado 
        return resultado;

    }

    public static void main(String[] args) {
        int resultado = 0;
        System.out.println("El año ingresado es: " + biciesto(resultado));

    }
}
