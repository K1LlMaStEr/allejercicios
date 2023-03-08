/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Jugador;
import Servicios.ServicioJugador;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gonza
 */
public class equipo {
    private List<Jugador> jugadores;
    

    public equipo() {
    }

    public equipo(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
    
    public void cargarEquipo(){
        
        
        Scanner leer = new Scanner(System.in);
        ServicioJugador sj=new ServicioJugador();
        System.out.println("ingrese cantidad de equipos a cargar");
        int cont=leer.nextInt();
        
        for (int i = 0; i < cont; i++) {
            this.jugadores=sj.cargaJugadores();
            
        }
        
        
        
        
    }
    
}
    
    
    

