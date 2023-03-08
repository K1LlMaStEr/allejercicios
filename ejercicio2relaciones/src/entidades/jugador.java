/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gonza
 */
public class jugador {
    private String nombre;
    private int id;
    private Boolean mojau;

    public jugador() {
    }

    public jugador(String nombre, int id, Boolean mojau) {
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
