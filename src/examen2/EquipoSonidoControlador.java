/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author ashle
 */
public class EquipoSonidoControlador {

    int parlanteIzq;
    int parlanteDer;
    int parlanteSub;
    String[] volumen = new String[10];
    int[] listaAudios = new int[1000];
    int musica;

    public EquipoSonidoControlador() {

    }

    /**
     *
     */
    public void iniciar() {

    }

    public EquipoSonidoControlador(int parlanteIzq, int parlanteDer, int parlanteSub, int musica) {
        this.parlanteIzq = parlanteIzq;
        this.parlanteDer = parlanteDer;
        this.parlanteSub = parlanteSub;
        this.musica = musica;
    }

    @Override
    public String toString() {
        return "EquipoSonidoControlador{" + "parlanteIzq=" + parlanteIzq + ", parlanteDer=" + parlanteDer + ", parlanteSub=" + parlanteSub + ", volumen=" + volumen + ", listaAudios=" + listaAudios + ", musica=" + musica + '}';
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

}
