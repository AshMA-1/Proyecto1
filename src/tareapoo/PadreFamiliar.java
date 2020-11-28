/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

/**
 *
 * @author ashle
 */
public class PadreFamiliar {

    String genero;
    String nombreFamiliar;
    String parentezco;
    int edad;

    public PadreFamiliar() {

    }

    public PadreFamiliar(String genero, String nombreFamiliar, String parentezco, int edad) {
        this.genero = genero;
        this.nombreFamiliar = nombreFamiliar;
        this.parentezco = parentezco;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PadreFamiliar{" + "genero=" + genero + ", nombreFamiliar=" + nombreFamiliar + ", parentezco=" + parentezco + ", edad=" + edad + '}';
    }

    public String getGenero() {
        return genero;
    }

    public String getNombreFamiliar() {
        return nombreFamiliar;
    }

    public String getParentezco() {
        return parentezco;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombreFamiliar(String nombreFamiliar) {
        this.nombreFamiliar = nombreFamiliar;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
