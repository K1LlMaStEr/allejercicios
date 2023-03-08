/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Persona {
   private String nombre;
    private String apellido;
    private int edad;
    private int Dni;
    private Perro perro;

    public Persona(Perro perro) {
        this.perro = perro;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int Dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Dni = Dni;
       
       
    }

    public Persona(String nombre, String apellido, int edad, int Dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Dni = Dni;
        this.perro = perro;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", Dni=" + Dni + ", perro=" + perro + '}';
    }

 
    

   
    

    
   
    
    
    
    
}
