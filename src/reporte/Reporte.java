/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Reporte {

    boolean modoGUI = true;

    public void imprimirReporte() {
        String mensaje = "Mensaje prueba";
        if (modoGUI) {
            JOptionPane.showMessageDialog(null, mensaje);

        } else {
            System.out.println(mensaje);
        }
    }

}
