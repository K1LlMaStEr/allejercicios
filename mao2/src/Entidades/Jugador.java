/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;



/**
 *
 * @author gonza
 */
public class Jugador {
    private String nombre;
    private String apellido;
    private int posicion;
    private int numeroCamiseta;
    

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int posicion, int numeroCamiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", numeroCamiseta=" + numeroCamiseta + '}';
    }
    
    
    
}
