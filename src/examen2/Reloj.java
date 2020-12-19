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
public class Reloj {

    int Alarma;
    int hora;
    int minutos;

    public Reloj() {

    }

    public Reloj(int Alarma, int hora, int minutos) {
        this.Alarma = Alarma;
        this.hora = hora;
        this.minutos = minutos;
    }

    public int getAlarma() {
        return Alarma;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setAlarma(int Alarma) {
        this.Alarma = Alarma;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

}
