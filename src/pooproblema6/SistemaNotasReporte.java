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
public class SistemaNotasReporte {

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

    public SistemaNotasReporte(String genero, String nombreFamiliar, String parentezco, int edad, int press, int imprimirDatosAlumnos, int information) {
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
        return "SistemaNotasReporte{" + "genero=" + genero + ", nombreFamiliar=" + nombreFamiliar + ", parentezco=" + parentezco + ", edad=" + edad + ", press=" + press + ", maxRegistros=" + maxRegistros + ", examenes=" + examenes + ", cont=" + cont + ", imprimirDatosAlumnos=" + imprimirDatosAlumnos + ", datos=" + datos + ", information=" + information + ", info=" + info + '}';
    }

    public SistemaNotasReporte() {

        boolean resultado = false;
        if (cont < maxRegistros) {
            SistemaNotasReporte ex = null;
//el arreglo tiene espacio
            examenes[cont] = ex;
            cont++;
            resultado = true;
        }

        for (int i = 0; i < cont; i++) {
            if (examenes[i] != null) {
                System.out.println(examenes[i].toString());
            }
        }
    }

    public float promedioNotas() {
        float retorno = 0f;

        return retorno;
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

   



    

