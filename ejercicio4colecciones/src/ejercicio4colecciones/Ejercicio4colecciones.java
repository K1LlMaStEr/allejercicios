/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4colecciones;

import entidadPeliculas.Pelicula;
import java.util.ArrayList;
import servicioPelicula.servicioPeliculas;

/**
 *
 * @author gonza
 */
public class Ejercicio4colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  servicioPeliculas sp = new servicioPeliculas();
        ArrayList<Pelicula> Pelis = sp.crearPeliculas();
        
        sp.mostrarpelis(Pelis);
        System.out.println("---------------------------------");
        sp.mostarPelis1(Pelis);
        sp.ordenarDuracion(Pelis);
        
        
        // TODO code application logic here
    }
    
}
