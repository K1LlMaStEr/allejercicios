/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;


public abstract class Edificio {
    protected int alto;
    protected int ancho;
    protected int largo;
   

    public Edificio() {
    }

    public Edificio(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
       
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

   

    @Override
    public String toString() {
        return "Edificio{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
    
   
 public double calcularSuperficie(){
    return ancho*largo;
    
 }   
 public double calcularVolumen(){
     return ancho*largo*alto;
     
     
 }
 

}
