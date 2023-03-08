/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mao2;


import Entidades.equipo;
import Servicios.ServicioJugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Mao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
      
        
        
        ArrayList<String> allteam = new ArrayList();
        equipo e1=new equipo();
        e1.cargarEquipo();
        System.out.println(e1.toString());
       /* ServicioJugador sj=new ServicioJugador();
        sj.cargaJugadores();*/
       
        
        
        
        
        // TODO code application logic here
    }
    
}
