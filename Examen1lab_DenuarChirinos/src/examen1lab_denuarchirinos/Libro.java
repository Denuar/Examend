/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_denuarchirinos;

import java.util.Date;

/**
 *
 * @author Denuar
 */
public class Libro {
    private String titulo, descripcion, puntaje, nCopias, genero, valor, edicion, autor;
    private Date año;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, String puntaje, String nCopias, String genero, String valor, String edicion, String autor, Date año) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.nCopias = nCopias;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getnCopias() {
        return nCopias;
    }

    public void setnCopias(String nCopias) {
        this.nCopias = nCopias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", puntaje=" + puntaje + ", nCopias=" + nCopias + ", genero=" + genero + ", valor=" + valor + ", edicion=" + edicion + ", autor=" + autor + ", a\u00f1o=" + año + '}';
    }

    
}
