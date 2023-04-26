/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author gonza
 */
public final class Hotel5 extends Hotel4 {
    //Atributos
    int salones;
    int suites;
    int limosinas;
    //Constructores

    public Hotel5(String gimnasio, int restaurante, int habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, restaurante, habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
    }
    

    public Hotel5(int salones, int suites, int limosinas, String gimnasio, int restaurante, int habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, restaurante, habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    //Getters y Setters

    public int getSalones() {
        return salones;
    }

    public void setSalones(int salones) {
        this.salones = salones;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{"  + "habitaciones= "  + habitaciones + ", camas= " + camas +  ", pisos= " + pisos +  ", precio= " + precio +   "gimnasio=" + gimnasio + ", restaurante=" + restaurante + "salones=" + salones + ", suites=" + suites + ", limosinas=" + limosinas + '}';
    }
    
    
}
    

