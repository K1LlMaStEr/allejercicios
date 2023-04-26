/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, String consumoE, int peso) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(String consumoE) {
        this.consumoE = consumoE;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Lavadora{"+ "color= "+color + " consumo= "+consumoE + " peso= "+peso + " carga= " +carga + " precio= "+precio +'}';
    }


    
    
}
