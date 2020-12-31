/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Vista {

    //atributos
    int parlanteIzq;
    int parlanteDer;
    int parlanteSub;
    String[] volumen = new String[10];
    int[] listaAudios = new int[1000];
    int musica;
    int cantidad = 0;
    int cont;

    public Vista() {

    }

    public Vista(int parlanteIzq, int parlanteDer, int parlanteSub, int musica, int cont) {
        this.parlanteIzq = parlanteIzq;
        this.parlanteDer = parlanteDer;
        this.parlanteSub = parlanteSub;
        this.musica = musica;
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "EquipoSonido{" + "parlanteIzq=" + parlanteIzq + ", parlanteDer=" + parlanteDer + ", parlanteSub=" + parlanteSub + ", volumen=" + volumen + ", listaAudios=" + listaAudios + ", musica=" + musica + ", cantidad=" + cantidad + '}';
    }

    public void iniciar() {

    }

    //metodos y funcionanlidades 
    public void insertarMusica() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de música que desea agregar: ");
        cantidad = entrada.nextInt();
        for (int i = 0; i < cantidad; i++) {
            if (cantidad == cantidad) {
                System.out.println("Ingrese el código binario de la música: ");
                listaAudios[i] = entrada.nextInt();
            }
        }
        System.out.println("\nLos códigos binarios son: " + musica + 1);
        System.out.println("El total de códigos musicales es : " + cantidad + "\n");
    }

    public boolean eliminarLista(int parlanteIzq, int parlanteDer, int parlanteSu) {
        int insertarMusica = 100;
        Vista[] musica = new Vista[insertarMusica];
        int cont = 0;
        boolean resultado = true;
        if (cont != 0) {
            musica[cont - 1] = null;
            cont--;
            resultado = true;
        }
        return resultado;
    }

    public void nivelVolumen() {
        Random obt = new Random();
        int volumen;

        for (int i = 0; i < 1; i++) {
            volumen = obt.nextInt(10);
            System.out.println("Parlante izquierdo tiene un volumen de : " + volumen);
            volumen = obt.nextInt(10);
            System.out.println("Parlante subwoofer tiene un volumen de : " + volumen);
            volumen = obt.nextInt(10);
            System.out.println("Parlante derecho tiene un volumen de : " + volumen);
        }
    }

    public void ordenar() {
        for (int i = 0; i < 1000; i++) { //para cada espacio del arreglo
            if (listaAudios[i] == 999) { //Si no está vacío el audio en posición i
                System.out.println(listaAudios[i]); //imprime el audio en posición i

            }
        }
    }

    public int getParlanteIzq() {
        return parlanteIzq;
    }

    public int getParlanteDer() {
        return parlanteDer;
    }

    public int getParlanteSub() {
        return parlanteSub;
    }

    public String[] getVolumen() {
        return volumen;
    }

    public int[] getListaAudios() {
        return listaAudios;
    }

    public int getMusica() {
        return musica;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setParlanteIzq(int parlanteIzq) {
        this.parlanteIzq = parlanteIzq;
    }

    public void setParlanteDer(int parlanteDer) {
        this.parlanteDer = parlanteDer;
    }

    public void setParlanteSub(int parlanteSub) {
        this.parlanteSub = parlanteSub;
    }

    public void setVolumen(String[] volumen) {
        this.volumen = volumen;
    }

    public void setListaAudios(int[] listaAudios) {
        this.listaAudios = listaAudios;
    }

    public void setMusica(int musica) {
        this.musica = musica;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
