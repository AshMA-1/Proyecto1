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
public class Informacion {

    String grado;
    String teacher;
    String materia;
    int year;

    public Informacion() {

    }

    public Informacion(String grado, String teacher, String materia, int year) {
        this.grado = grado;
        this.teacher = teacher;
        this.materia = materia;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Informacion{" + "grado=" + grado + ", teacher=" + teacher + ", materia=" + materia + ", year=" + year + '}';
    }

    public String getGrado() {
        return grado;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getMateria() {
        return materia;
    }

    public int getYear() {
        return year;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
