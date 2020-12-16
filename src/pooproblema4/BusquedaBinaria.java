/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema4;

/**
 *
 * @author ashle
 */
public class BusquedaBinaria {

    int[] numeros = {1, 4, 8, 45, 200};
    int inicio = 0;
    int fin = numeros.length - 1;
    int buscadorNum = 200;
    int posicion = 0;
    int resultado = 0;

    public BusquedaBinaria() {

    }

    public BusquedaBinaria(int inicio, int fin, int buscadorNum, int posicion, int resultado, int numeros) {
        this.buscadorNum = buscadorNum;
        this.fin = fin;
        this.inicio = inicio;
        this.posicion = posicion;
        this.resultado = resultado;
    }


    @Override
    public String toString() {
        return "BusquedaBinaria{" + "numeros=" + numeros + ", inicio=" + inicio + ", fin=" + fin + ", buscardorNum=" + buscadorNum + ", posicion=" + posicion + ", resultado=" + resultado + '}';
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public int getBuscardorNum() {
        return buscadorNum;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setBuscardorNum(int buscardorNum) {
        this.buscadorNum = buscardorNum;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
