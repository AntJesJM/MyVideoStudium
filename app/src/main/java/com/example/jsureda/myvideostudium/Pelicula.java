package com.example.jsureda.myvideostudium;

/**
 * Created by xemy0 on 29/01/2018.
 */

public class Pelicula {
    private int titulo;
    private int anio;
    private int imagen;
    private double nota;


    public Pelicula(int titulo, int anio,  int imagen){
        this.titulo = titulo;
        this.anio = anio;
        this.imagen = imagen;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


}
