/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadPeliculas;

import java.util.Comparator;

/**
 *
 * @author gonza
 */
public class Pelicula {
    private String Pelicula;
    private String Director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String Pelicula, String Director, Double duracion) {
        this.Pelicula = Pelicula;
        this.Director = Director;
        this.duracion = duracion;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Pelicula=" + Pelicula + ", Director=" + Director + ", duracion=" + duracion + '}';
    }
  
    
    
}
