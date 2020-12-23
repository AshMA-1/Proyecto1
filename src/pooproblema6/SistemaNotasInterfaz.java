/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproblema6;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class SistemaNotasInterfaz {

    String genero;
    String nombreFamiliar;
    String parentezco;
    int edad, press;

    int maxRegistros = 100;
    SistemaNotasReporte[] examenes = new SistemaNotasReporte[maxRegistros];
    int cont = 0;

    int imprimirDatosAlumnos;
    SistemaNotasInterfaz[] datos = new SistemaNotasInterfaz[imprimirDatosAlumnos];

    int information;
    SistemaNotasControlador[] info = new SistemaNotasControlador[information];

    public SistemaNotasInterfaz(String genero, String nombreFamiliar, String parentezco, int edad, int press, int imprimirDatosAlumnos, int information) {
        this.genero = genero;
        this.nombreFamiliar = nombreFamiliar;
        this.parentezco = parentezco;
        this.edad = edad;
        this.press = press;
        this.imprimirDatosAlumnos = imprimirDatosAlumnos;
        this.information = information;
    }

    @Override
    public String toString() {
        return "SistemaNotasInterfaz{" + "genero=" + genero + ", nombreFamiliar=" + nombreFamiliar + ", parentezco=" + parentezco + ", edad=" + edad + ", press=" + press + ", maxRegistros=" + maxRegistros + ", examenes=" + examenes + ", cont=" + cont + ", imprimirDatosAlumnos=" + imprimirDatosAlumnos + ", datos=" + datos + ", information=" + information + ", info=" + info + '}';
    }

    public SistemaNotasInterfaz() {

        Scanner insertado = new Scanner(System.in);

        int press = 0;
        String nombreCompleto = null, carnets = null, ningunDato = null;
        System.out.println("Seleccione la opción para mostrar la información que desea: \n1) nombreCompleto \n2) Carnets \n3) ningunDato ");
        press = insertado.nextInt();

        if (press == 1) {
            System.out.println(info);
        } else if (press == 2) {
            System.out.println(" " + info);
        }
        System.out.println("No desea ninguna información " + ningunDato);

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

    public void otraInformacion(SistemaNotasControlador info) {
        System.out.println("" + information);

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

    public int getPress() {
        return press;
    }

    public int getMaxRegistros() {
        return maxRegistros;
    }

    public SistemaNotasReporte[] getExamenes() {
        return examenes;
    }

    public int getCont() {
        return cont;
    }

    public int getImprimirDatosAlumnos() {
        return imprimirDatosAlumnos;
    }

    public SistemaNotasInterfaz[] getDatos() {
        return datos;
    }

    public int getInformation() {
        return information;
    }

    public SistemaNotasControlador[] getInfo() {
        return info;
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

    public void setPress(int press) {
        this.press = press;
    }

    public void setMaxRegistros(int maxRegistros) {
        this.maxRegistros = maxRegistros;
    }

    public void setExamenes(SistemaNotasReporte[] examenes) {
        this.examenes = examenes;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void setImprimirDatosAlumnos(int imprimirDatosAlumnos) {
        this.imprimirDatosAlumnos = imprimirDatosAlumnos;
    }

    public void setDatos(SistemaNotasInterfaz[] datos) {
        this.datos = datos;
    }

    public void setInformation(int information) {
        this.information = information;
    }

    public void setInfo(SistemaNotasControlador[] info) {
        this.info = info;
    }

}
