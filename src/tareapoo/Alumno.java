/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

import java.util.Scanner;

/**
 *
 * @author ashle
 */

public class Alumno {

    PadreFamiliar padres;
    String nombre;
    String apellido;
    int carne;

    public Alumno() {
    }

    public Alumno(PadreFamiliar padres, String nombre, String apellido, int carne) {
        this.padres = padres;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }

    public PadreFamiliar padres() {
        System.out.println(padres);
        return null;

    }

    public void mostrardatos() {
        System.out.println(nombre + " " + apellido + " " + carne);
    }

    public PadreFamiliar getPadres() {
        return padres;
    }

    //metodos gets y sets
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCarne() {
        return carne;
    }

    public void setPadres(PadreFamiliar padres) {
        this.padres = padres;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

}
