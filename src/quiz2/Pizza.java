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
public class Pizza {

    String peperoni;
    String suprema;
    String jamonQueso;
    int monto;

    public Pizza() {

    }

    public Pizza(String peperoni, String suprema, String jamonQueso, int monto) {
        this.jamonQueso = jamonQueso;
        this.monto = monto;
        this.peperoni = peperoni;
        this.suprema = suprema;
    }

    public float calcular() {
        float monto = 0;
        return 0;

    }

    @Override
    public String toString() {
        return "Pizza{" + "peperoni=" + peperoni + ", suprema=" + suprema + ", jamonQueso=" + jamonQueso + ", monto=" + monto + '}';
    }

    public String getPeperoni() {
        return peperoni;
    }

    public String getSuprema() {
        return suprema;
    }

    public String getJamonQueso() {
        return jamonQueso;
    }

    public int getMonto() {
        return monto;
    }

    public void setPeperoni(String peperoni) {
        this.peperoni = peperoni;
    }

    public void setSuprema(String suprema) {
        this.suprema = suprema;
    }

    public void setJamonQueso(String jamonQueso) {
        this.jamonQueso = jamonQueso;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

}
