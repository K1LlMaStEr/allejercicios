/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gonza
 */
public class Pistola {
    private int mojar ;
    private int cuetazo;
    private Jugador nombre;
    private Jugador id;
    private Jugador mojau;

    public Pistola() {
    }

    public Pistola(int mojar, int cuetazo, Jugador nombre, Jugador id, Jugador mojau) {
        this.mojar = mojar;
        this.cuetazo = cuetazo;
        this.nombre = nombre;
        this.id = id;
        this.mojau = mojau;
    }

    public int getMojar() {
        return mojar;
    }

    public void setMojar(int mojar) {
        this.mojar = mojar;
    }

    public int getCuetazo() {
        return cuetazo;
    }

    public void setCuetazo(int cuetazo) {
        this.cuetazo = cuetazo;
    }

    public Jugador getNombre() {
        return nombre;
    }

    public void setNombre(Jugador nombre) {
        this.nombre = nombre;
    }

    public Jugador getId() {
        return id;
    }

    public void setId(Jugador id) {
        this.id = id;
    }

    public Jugador getMojau() {
        return mojau;
    }

    public void setMojau(Jugador mojau) {
        this.mojau = mojau;
    }

    @Override
    public String toString() {
        return "Pistola{" + "mojar=" + mojar + ", cuetazo=" + cuetazo + ", nombre=" + nombre + ", id=" + id + ", mojau=" + mojau + '}';
    }

  
    
   
        
   
}
