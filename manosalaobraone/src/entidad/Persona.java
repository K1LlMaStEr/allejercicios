/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import Dni.Dnientidad;

/**
 *
 * @author gonza
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Dnientidad Dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dnientidad Dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dnientidad getDni() {
        return Dni;
    }

    public void setDni(Dnientidad Dni) {
        this.Dni = Dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + '}';
    }
    
    
}
