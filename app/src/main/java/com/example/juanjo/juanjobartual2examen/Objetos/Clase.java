package com.example.juanjo.juanjobartual2examen.Objetos;


import android.graphics.drawable.Drawable;

/**
 * Created by Juanjo on 30/1/18.
 */

public class Clase {

    String curso,grado,fecha, alumnos;
    int imagen;


    public Clase(String curso, String grado, String fecha, String alumnos, int imagen) {
        this.curso = curso;
        this.grado = grado;
        this.fecha = fecha;
        this.alumnos = alumnos;
        this.imagen = imagen;
    }

    public Clase(){

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
