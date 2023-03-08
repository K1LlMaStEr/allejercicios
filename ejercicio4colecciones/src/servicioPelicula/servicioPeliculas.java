/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioPelicula;

import entidadPeliculas.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import comparator.comparatorss;

/**
 *
 * @author gonza
 */
public class servicioPeliculas {
    
    Scanner leer = new Scanner(System.in);
    
    public ArrayList<Pelicula> crearPeliculas(){
        String resp;
        ArrayList<Pelicula> pelis = new ArrayList();
        
        do{
            System.out.println("ingrese titulo");
            String titulo=leer.next();
            
            System.out.println("ingrese director");
            String director=leer.next();
            
            System.out.println("ingrese duracion");
            double duracion=leer.nextDouble();
            
            Pelicula peli=new Pelicula(titulo, director, duracion);
            pelis.add(peli);
            
            System.out.println("desea ingrear mas pelis");
            resp=leer.next();
        }
        while (!resp.equals("n"));
                return pelis;
       
    }
        
        public void mostrarpelis(ArrayList<Pelicula>p){
            for (Pelicula j : p) {
                System.out.println(j.toString());
            }
            
            
            
            
    }
        public void mostarPelis1 (ArrayList<Pelicula>p){
            
                
            System.out.println("pelis que duran mas de una hora");
 
              for (Pelicula j : p) {
                  if (j.getDuracion()>1) {
                      
                  
                System.out.println(j.toString());
            }
            
            

            
        }       
                
     }
        public static Comparator<Pelicula> menorAmayor = new Comparator<Pelicula>() {

        @Override

        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDuracion().compareTo(p2.getDuracion());
        }

        };
   
      public void ordenarDuracion(ArrayList<Pelicula> d) {

        System.out.println("----------------");
        System.out.println("Peliculas ordenadas de menor a mayor");
        
        Collections.sort(d, comparatorss.menorAmayor);
        
        for (Pelicula j : d) {

            System.out.println(j.toString());

}

}
    
    
}
        
        
}
}