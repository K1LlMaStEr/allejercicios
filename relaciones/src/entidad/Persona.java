/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author gonza
 */
public class Persona {
    private String nombre;
    private String apellido;

    
    private Dni dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int DNI, Dni serie) {
        this.nombre = nombre;
        this.apellido = apellido;
       
        this.dni = dni;
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

  

    public String getSerie(Dni serie) {
        
        return "caracter"+dni.getSerie()+"numero"+dni.getNumero();
    }

    public void setDni(Dni serie) {
        this.dni = serie;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", apellido= " + apellido + " " + dni + '}';
    }


}

