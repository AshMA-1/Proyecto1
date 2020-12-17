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
import java.util.Scanner;

public class PadreFamiliar {

    String genero;
    String nombreFamiliar;
    String parentezco;
    int edad, press;

    public PadreFamiliar() {

    }

    public PadreFamiliar(String genero, String nombreFamiliar, String parentezco, int edad) {
        this.genero = genero;
        this.nombreFamiliar = nombreFamiliar;
        this.parentezco = parentezco;
        this.edad = edad;
        this.press = press;
    }

    public void ImprimirDatosFamiliar(int press) {
        //permite que usuario digite 
        Scanner insertado = new Scanner(System.in);
        int si, no;
        System.out.println("Desea mostrar la informació:\n 1) Si\n 2) No\n");
        press = insertado.nextInt();

        //creacion de switch y formulas con cada operacion para que muestre unicamente lo que el cliente desea
        switch (press) {
            case 1:
                System.out.println("La informaición : " + press);
                System.out.println("El género : " + genero);
                System.out.println("El nombre : " + nombreFamiliar);
                System.out.println("El parentezco : " + parentezco);
                System.out.println("La edad : " + edad);
                break;

            case 2:
                System.out.println("El resultado de la resta es: " + press);
                System.out.println("No desea ninguna infomración" + press);
                break;

        }
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
