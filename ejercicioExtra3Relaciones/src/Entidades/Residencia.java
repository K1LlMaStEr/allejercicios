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
public class Residencia extends ExtraHotelera {
    private int cantHabitaciones;
    private boolean descGremio;
    private boolean CampoDeportivo;

    public Residencia() {
    }



    public Residencia(int cantHabitaciones, boolean descGremio, boolean CampoDeportivo, boolean privado, int cantMetrosCuadrados) {
        super(privado, cantMetrosCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.descGremio = descGremio;
        this.CampoDeportivo = CampoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampoDeportivo() {
        return CampoDeportivo;
    }

    public void setCampoDeportivo(boolean CampoDeportivo) {
        this.CampoDeportivo = CampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", descGremio=" + descGremio + ", CampoDeportivo=" + CampoDeportivo + '}';
    }
   
    
}
