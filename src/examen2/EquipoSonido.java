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
public class EquipoSonido {

    //atributos
    int parlanteIzq;
    int parlanteDer;
    int parlanteSub;
    String[] volumen = new String[10];
    String[] lista = new String[1000];
    int musica = 0;
    int cantidad = 0;

    public EquipoSonido() {

    }

    public EquipoSonido(int parlanteIzq, int parlanteDer, int parlanteSub) {
        this.parlanteIzq = parlanteIzq;
        this.parlanteDer = parlanteDer;
        this.parlanteSub = parlanteSub;
    }

    @Override
    public String toString() {
        return "EquipoSonido{" + "parlanteIzq=" + parlanteIzq + ", parlanteDer=" + parlanteDer + ", parlanteSub=" + parlanteSub + ", volumen=" + volumen + ", lista=" + lista + ", musica=" + musica + ", cantidad=" + cantidad + '}';
    }

    //metodos y funcionanlidades 
    public void insertarMusica() {
        String[] lista = new String[1000];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de música que desea agregar: ");
        cantidad = entrada.nextInt();
        for (int i = 0; i < cantidad; i++) {
            if (cantidad == cantidad) {
                System.out.println("Ingrese el código binario de la música ");
                musica = entrada.nextInt();
                System.out.println("El código binario de la música es: " + musica + " \n");
            }

        }
        System.out.println("El total de códigos musicales es : " + cantidad);
    }

    public void ordenar() {
        String[] cantidad = new String[1000];
        for (int i = 0; i < 1000; i++) { //para cada espacio del arreglo
            if (cantidad[i].equals(""+musica)) { //Si no está vacío el audio en posición i
                System.out.println(cantidad[i]); //imprime el audio en posición i
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

    public String[] getLista() {
        return lista;
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

    public void setLista(String[] lista) {
        this.lista = lista;
    }

    public void setMusica(int musica) {
        this.musica = musica;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
