/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Jugador {
    private String nombre;
    private int id;
    private Boolean mojau;
    ArrayList<String> Jugadores = new ArrayList();
   
    public Jugador() {
    }

    public ArrayList<String> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<String> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Jugador(String nombre, int id, Boolean mojau) {
        this.nombre = nombre;
        this.id = id;
        this.mojau = mojau;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getMojau() {
        return mojau;
    }

    public void setMojau(Boolean mojau) {
        this.mojau = mojau;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", id=" + id + ", mojau=" + mojau + '}';
    }
    
    
    
}
