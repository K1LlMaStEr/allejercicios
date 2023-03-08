/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Jugador;
import EntidadJugadores.Jugadores;
import Entidades.equipo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class ServicioJugador {

    private equipo equipo;
            
    public List<Jugador> cargaJugadores(){
        
        
          
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de jugadores a cargar en lista");
        int cont=leer.nextInt();
        ArrayList<Jugador> equipito = new ArrayList();
        for (int i = 0; i < cont; i++) {
            
        
        Jugador j1= new Jugador();
            System.out.println("ingrese nombre");
        j1.setNombre(leer.next());
            System.out.println("ingrese apellido");
        j1.setApellido(leer.next());
            System.out.println("ingrese numero camiseta");
        j1.setNumeroCamiseta(leer.nextInt());
            System.out.println("ingrese posicion");
        j1.setPosicion(leer.nextInt());
        equipito.add(j1);
        
        
    }
        System.out.println(equipito);
        
        return equipito;
    }
    
}
