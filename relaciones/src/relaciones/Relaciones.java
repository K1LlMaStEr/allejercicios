/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import entidad.Dni;
import entidad.Persona;
import servicioRelaciones.servicioRelacion;

/**
 *
 * @author gonza
 */
public class Relaciones {

    public static void main(String[] args) {
        //servicioRelacion sR=new servicioRelacion();
        //sR.crear();
        System.out.println("");
        Persona p1=new Persona();
        p1.setNombre("gonzalo");
        p1.setApellido("Alvarez");
        p1.setDni(new Dni ("f",31996818));
        System.out.println(p1);
        
    }
    
}
