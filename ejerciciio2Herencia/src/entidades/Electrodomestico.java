/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public abstract class Electrodomestico {
    
    protected int precio;
    protected String color;
    //letra entre A-F
    protected String consumoE;
    //peso en KG
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, String consumoE, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
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
    
 
}
