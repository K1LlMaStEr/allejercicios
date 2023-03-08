/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dni;

/**
 *
 * @author gonza
 */
public class Dnientidad {
    private int numero;
    private String serie;

    public Dnientidad() {
    }

    public Dnientidad(int numero, String serie) {
        this.numero = numero;
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Dnientidad{" + "numero=" + numero + ", serie=" + serie + '}';
    }
    
    
    
}
