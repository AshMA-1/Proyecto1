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

public class SistemaNotas  {

    int maxRegistros = 100;
    Examen[] examenes = new Examen[maxRegistros];
    int cont = 0;
    
    int imprimirDatosAlumnos;
    Alumno[] datos = new Alumno[imprimirDatosAlumnos];
    
    int information;
    Informacion[] info = new Informacion[information];

    public SistemaNotas () {
    }

    //elimina el ult examen del arreglo
    public boolean eliminarEx() {
        boolean resultado = false;
        if (cont != 0) {
            examenes[cont - 1] = null;
            cont--;
            resultado = true;
        }
        return resultado;
    }
    
    public void otraInformacion(Informacion infor){
        System.out.println(""+information);
    }

    //imprimir datos del alumno
    public void imprimirDatosAlumno(Alumno alum) {
        Scanner insertado = new Scanner(System.in);

        int press = 0;
        String nombreCompleto = null, carnets = null, ningunDato = null;
        System.out.println("Seleccione la opción para mostrar la información que desea: \n1) nombreCompleto \n2) Carnets \n3) ningunDato ");
        press = insertado.nextInt();

        if (press == 1) {
            System.out.println(alum);
        } else if (press == 2) {
            System.out.println(" " + alum);
        }
        System.out.println("No desea ninguna información " + ningunDato);

    }
    //agregar un examen al arreglo
    public boolean agregarEx(Examen ex) {
        boolean resultado = false;
        if (cont < maxRegistros) { //el arreglo tiene espacio
            examenes[cont] = ex;
            cont++;
            resultado = true;
        }
        return resultado;
    }

    //mostrar examenes
    public void mostrarExamenes() {
        for (int i = 0; i < cont; i++) {
            if (examenes[i] != null) {
                System.out.println(examenes[i].toString());
            }
        }
    }

    //calcular promedio
    public float promedioNotas() {
        float retorno = 0f;

        return retorno;
    }
}
