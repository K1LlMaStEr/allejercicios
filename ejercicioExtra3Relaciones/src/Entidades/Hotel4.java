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
public class Hotel4 extends Hoteles {

    //Atributos
    protected String gimnasio;
  
    protected int restaurante;

    //Constructores

    public Hotel4(String gimnasio, int restaurante, int habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
    }
//  Getters y Setters

    

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public int getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(int restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "habitaciones= "  + habitaciones + ", camas= " + camas +  ", pisos= " + pisos +  ", precio= " + precio +   "gimnasio=" + gimnasio + ", restaurante=" + restaurante + '}';
    }
    @Override
    
    public void precioHabitacion(){
        int valorRestaurante=0;
        if (restaurante < 30) {
            valorRestaurante=10;
        } else if (restaurante > 30 && restaurante<50) {
            valorRestaurante=30;
        }else if (restaurante > 50){
                valorRestaurante=50;
                }   
        int valorGimnasio;
                if (gimnasio=="A"||gimnasio=="a"){
                valorGimnasio=50;
                if(gimnasio=="B"||gimnasio=="b"){
                valorGimnasio=30;
                
                
                }
            
        this.precio =habitaciones*50+camas+valorRestaurante + valorGimnasio;    
        }
            
        
 
            
        }
        
        
    }
    

