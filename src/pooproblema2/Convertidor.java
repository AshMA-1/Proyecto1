/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema2;

/**
 *
 * @author ashle
 */
public class Convertidor {

    Moneda monedaColon;
    Moneda monedaDolar;
    Moneda monedaEuro;

    public Convertidor() {
    }

    public Convertidor(Moneda monedaColon, Moneda monedaDolar, Moneda monedaEuro) {
        this.monedaColon = monedaColon;
        this.monedaDolar = monedaDolar;
        this.monedaEuro = monedaEuro;
    }

    //Este metodo requiere que monedaOrigen y monedaSalida esten establecidas
    public float convertir(Moneda monedaOrigen, Moneda monedaSalida, float cantidadOrigen) {
        float resultado = 0;
        if (monedaOrigen != null && monedaSalida != null) {

            if (monedaOrigen.getNombre().equals("Colon")) {
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen;
                } else if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen / monedaDolar.getValorColon();
                } else {
                    resultado = cantidadOrigen / monedaEuro.getValorColon();
                }
            } else if (monedaOrigen.getNombre().equals("Dolar")) {

            } else {

            }
        }
        return resultado;
    }

    public Moneda getMonedaColon() {
        return monedaColon;
    }

    public void setMonedaColon(Moneda monedaColon) {
        this.monedaColon = monedaColon;
    }

    public Moneda getMonedaDolar() {
        return monedaDolar;
    }

    public void setMonedaDolar(Moneda monedaDolar) {
        this.monedaDolar = monedaDolar;
    }

    public Moneda getMonedaEuro() {
        return monedaEuro;
    }

    public void setMonedaEuro(Moneda monedaEuro) {
        this.monedaEuro = monedaEuro;
    }

}
