/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.chumboDeAgua;
import entidades.jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class servicioJuego {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
       chumboDeAgua mojar;
       chumboDeAgua cuetazo;
       
       
       
   public boolean mojar(boolean mojar, boolean cuetazo){
       boolean siono=false;
       if (mojar==cuetazo) {
           siono=true;
           
       }
       
       
       
       
       
       return siono;
   }
     
    public ArrayList<jugador>listaJugador(){
        
        jugador j1=new jugador();
      
        for (int i = 0; i < 2; i++) { 
        
        System.out.println("ingrese nombre de jugador");
        j1.setNombre(leer.next());
        System.out.println("ingrese ID");
        j1.setId(leer.nextInt());
        System.out.println("ingrese true o false si esta mojado");
        j1.setMojau(leer.hasNextBoolean());
        listaJugador.add(j1);
        }
         System.out.println(j1);
       
      
            
         
    
    
    
    return listaJugador();
}
    
    public void llenarChumbo(){
        
       
        
        int azar1 = (int) (Math.random()*10+1);
        int azar2 =(int) (Math.random()*6+1);
        
        if (azar1>5) {
          
                    mojar=true;
            
        }
        if (azar2>6) {
            
            
            cuetazo=true;
            
        }
        
    
}
    public void mojar(){
        boolean morir=false;
        if (mojar=cuetazo) {
            morir=true;
            
        }
        
        
    }
    public void siguienteChorro(){
        
    }
    
}
