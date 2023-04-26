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
public class ExtraHotelera {
    
  protected boolean privado;
  protected int cantMetrosCuadrados;

    public ExtraHotelera() {
    }
  
  

    public ExtraHotelera(boolean privado, int cantMetrosCuadrados) {
        this.privado = privado;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getCantMetrosCuadrados() {
        return cantMetrosCuadrados;
    }

    public void setCantMetrosCuadrados(int cantMetrosCuadrados) {
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }
  
    
}
