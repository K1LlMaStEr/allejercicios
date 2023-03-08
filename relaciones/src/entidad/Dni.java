/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author gonza
 */
public class Dni {
    private String serie;
    private int numero;

    public Dni() {
        
    }

    public Dni(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setDni(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "" + "serie=" + serie + ", dni=" + numero + '}';
    }
    
}
