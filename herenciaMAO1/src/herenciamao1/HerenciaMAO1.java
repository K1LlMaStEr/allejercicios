/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamao1;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class HerenciaMAO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal a=new Animal();
        Animal b=new Perro();
        Animal c=new Gato();
        ArrayList<Animal> animalitos = new ArrayList();
        animalitos.add(a);
        animalitos.add(b);
        animalitos.add(c);
        
        
        for (Animal animalito : animalitos) {
            animalito.hacerRuido();
            ;
            
        }
      
        
      
        
        
        
        
        
    
        
        
        
    }
    
}
