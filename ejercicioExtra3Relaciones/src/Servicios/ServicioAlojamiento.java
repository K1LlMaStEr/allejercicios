/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Hotel4;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class ServicioAlojamiento {
    public ArrayList<Alojamiento> creacion(){
        ArrayList<Alojamiento> Faldero=new ArrayList<>();
        Hotel4 hotel1=new Hotel4("si", 2, 3, 20, 6, 10, "carlos", "galeotti", "cordoba", "marcos");
        Faldero.add(hotel1);
        System.out.println(Faldero);
        return Faldero;
    }    
    
}
