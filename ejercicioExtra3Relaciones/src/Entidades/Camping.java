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
public class Camping extends ExtraHotelera{
    private int capMaxCarpas;
    private int cantBanios;
    private boolean restaurante;
    

    public Camping(int capMaxCarpas, int cantBanios, boolean restaurante, boolean privado, int cantMetrosCuadrados) {
        super(privado, cantMetrosCuadrados);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capMaxCarpas=" + capMaxCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }
    
    
}
