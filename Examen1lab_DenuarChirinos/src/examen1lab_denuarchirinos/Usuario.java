/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_denuarchirinos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Denuar
 */
public class Usuario {
    private String nombreU, contraseña, tel, correo, nombreC, generoF;
    private Date fechaN;
    private ArrayList<Libro> Libros = new ArrayList();
    private ArrayList<Usuario> amigos = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombreU, String contraseña, String tel, String correo, String nombreC, String generoF, Date fechaN) {
        this.nombreU = nombreU;
        this.contraseña = contraseña;
        this.tel = tel;
        this.correo = correo;
        this.nombreC = nombreC;
        this.generoF = generoF;
        this.fechaN = fechaN;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getGeneroF() {
        return generoF;
    }

    public void setGeneroF(String generoF) {
        this.generoF = generoF;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public ArrayList<Libro> getLibros() {
        return Libros;
    }

    public void setLibros(ArrayList<Libro> Libros) {
        this.Libros = Libros;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreU=" + nombreU + ", contrase\u00f1a=" + contraseña + ", tel=" + tel + ", correo=" + correo + ", nombreC=" + nombreC + ", generoF=" + generoF + ", fechaN=" + fechaN + ", Libros=" + Libros + ", amigos=" + amigos + '}';
    }

    
}
