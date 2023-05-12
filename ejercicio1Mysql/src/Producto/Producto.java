/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author gonza
 */
public class Producto {



      private int codigo;
      private String nombre;
      private double precio;
      double codigoFabricante;
    
    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCodigoFabricante() {
        return codigoFabricante;
    }



    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    @Override
    public String toString() {
        
        String formatoCodigo = codigo==0 ? "" : String.format("%10.10s",codigo)+"|";
        String formatoNombre = nombre==null ? "" :String.format("%31.31s",nombre)+"|";
        String formatoPrecio = precio==0 ? "" : String.format("%.2f",precio)+"|";
        String AuxFormatoPrecio = String.format("%11.11s",formatoPrecio);
        String formatoCodigoFabricante = codigoFabricante==0 ? "" : String.format("%20.20s",codigoFabricante)+"|";
        
        return formatoCodigo + formatoNombre + AuxFormatoPrecio + formatoCodigoFabricante + "\n";
        
    }
    
}
