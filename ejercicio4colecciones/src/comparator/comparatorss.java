/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import entidadPeliculas.Pelicula;
import java.util.Comparator;

/**
 *
 * @author gonza
 */
public class comparatorss {
     public static Comparator<Pelicula> menorAmayor = new Comparator<Pelicula>() {

        @Override

        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDuracion().compareTo(p2.getDuracion());
        }

    };

    public static Comparator<Pelicula> mayorAmenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };
    
     public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getPelicula().compareTo(t1.getPelicula());
        }

    };
     
     public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }

    };
    
}
