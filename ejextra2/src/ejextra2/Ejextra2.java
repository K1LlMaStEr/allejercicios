/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2;

import entidades.puntos;
import servicioPuntos.servicios;

/**
 *
 * @author Alumno
 */
public class Ejextra2 {
    
    public static void main(String[] args ){
    
    servicios sv= new servicios();
    puntos pt= new puntos();
    
    pt=sv.crearPuntos();
    sv.calcular();
   }
    

 
    
}
