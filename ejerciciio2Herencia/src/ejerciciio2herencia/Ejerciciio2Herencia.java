/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciio2herencia;

/**
 *
 * @author gonza
 */


import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import servicios.ServiciosElectrodomesticos;
import servicios.ServiciosLavadora;
import servicios.ServiciosTelevisor;

/**
 *
 * @author PC
 */

public class Ejerciciio2Herencia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAR LAVADORA
        System.out.println("INGRESE DATOS LAVADORA");
        ServiciosLavadora sl = new ServiciosLavadora();
        Lavadora lavadora = new Lavadora();
        sl.crearLavadora(lavadora);
        System.out.println(lavadora.toString());
        
        System.out.println("");
        //CREAR TELEVISOR
        System.out.println("INGRESE DATOS TELEVISOR");
        ServiciosTelevisor st = new ServiciosTelevisor();
        Televisor televisor = new Televisor();
        st.crearTelevisor(televisor);
        System.out.println(televisor.toString());
        
        
    }
    
    }
    

