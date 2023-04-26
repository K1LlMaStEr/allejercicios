/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;


/**
 *
 * @author gonza
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Animal perro1= new Perro("Stich", "carnivoro", 15, "doberman");
       perro1.aliementarse();
       Animal perro2= new Perro("teddy", "croquetas", 10, "chihuahua");
       perro2.aliementarse();
       Animal gato= new Gato("pelusa", "galletas", 15, "siames");
       gato.aliementarse();
       Animal caballo=new Caballo("spark", "Pasto", 25, "Fino");
       caballo.aliementarse();
       
       
       
       
       
    }
    
}
