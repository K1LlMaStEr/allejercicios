/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Televisor extends Electrodomestico{
    
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, int precio, String color, String consumoE, int peso) {
        super(precio, color, consumoE, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
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
        return "Televisor{"+ "color= "+color + " consumo= "+consumoE + " peso= "+peso + " resolucion= " +resolucion + " sintonizador= "+sintonizador + " precio= "+precio +'}';
    }
    
}
