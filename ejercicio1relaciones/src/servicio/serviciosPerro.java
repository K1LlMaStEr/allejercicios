/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class serviciosPerro {
     public Perro crearPerro(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre");
        String nombre=leer.next();
        System.out.println("ingrese raza");
        String raza=leer.next();
        System.out.println("ingrese edad");
        int edad=leer.nextInt();
        System.out.println("ingrese tamaño");
        String tamanio=leer.next();
       
        return new Perro(nombre, raza, edad, tamanio);
         
    }
    
    
    
    public void mostrarPerro(ArrayList<Persona>personas, ArrayList<Perro>perros){
        System.out.println(perros);
        
    }
}
