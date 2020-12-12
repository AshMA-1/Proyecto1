/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author ashle
 */
public class MontoIngredientes {

    String piña;
    String olores;
    String chile;
    String bordeRelleno;
    String tamaño;
    int total;
    int descuento;
    int codigo;

    public MontoIngredientes() {

    }

    public MontoIngredientes(String piña, String olores, String chile, String bordeRelleno, String tamaño, int total, int descuento, int codigo) {
        this.bordeRelleno = bordeRelleno;
        this.chile = chile;
        this.olores = olores;
        this.piña = piña;
        this.total = total;
        this.codigo = codigo;
        this.descuento = descuento;

    }

    @Override
    public String toString() {
        return "MontoIngredientes{" + "pi\u00f1a=" + piña + ", olores=" + olores + ", chile=" + chile + ", bordeRelleno=" + bordeRelleno + ", tama\u00f1o=" + tamaño + ", total=" + total + ", descuento=" + descuento + ", codigo=" + codigo + '}';
    }

    public String getPiña() {
        return piña;
    }

    public String getOlores() {
        return olores;
    }

    public String getChile() {
        return chile;
    }

    public String getBordeRelleno() {
        return bordeRelleno;
    }

    public String getTamaño() {
        return tamaño;
    }

    public int getTotal() {
        return total;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setPiña(String piña) {
        this.piña = piña;
    }

    public void setOlores(String olores) {
        this.olores = olores;
    }

    public void setChile(String chile) {
        this.chile = chile;
    }

    public void setBordeRelleno(String bordeRelleno) {
        this.bordeRelleno = bordeRelleno;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
