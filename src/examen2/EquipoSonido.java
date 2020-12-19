/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class EquipoSonido {

    int parlanteIzq;
    int parlanteDer;
    int parlanteSub;
    String[] volumen = new String[10];
    String[] lista = new String[0];
    int musica = 0;
    int cantidad=0;

    public void insertarMusica() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de música que desea agregar: ");
        cantidad = entrada.nextInt();

        System.out.println("Ingrese el código binario de la música");
        musica = entrada.nextInt();
        System.out.println("El código binario de la música es: " + musica);
    }

    public void almacenarAudios() {
        String[] listaAudios = new String[1000]; //reservamos en memoria 1000 espacios
        for (int i = 0; i < 1000; i++) { //para cada espacio del arreglo
            listaAudios[musica] = "La lista de música es: "; //inicializamos el espacio de la posición i con un String vacío
        }
    }
}
