/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class serviciosPersonas {
    
    public Persona cargarPersona(){
        
       
        
        Scanner leer = new Scanner(System.in);
        Persona p1=new Persona();

        System.out.println("ingrese nombre");
        String nombre=leer.next();
        System.out.println("ingrese apellido");
        String apellido=leer.next();
        System.out.println("ingrese edad");
        int edad=leer.nextInt();
        System.out.println("ingrese Dni");
        int Dni=leer.nextInt();
        
       
        return new Persona(nombre, apellido, edad, Dni, new Perro());
    }
    public void asignarPerro(ArrayList<Persona>personas, ArrayList<Perro>perros){
        Scanner leer = new Scanner(System.in);
        int dnitemp=0;
        int indicePersona=0;
        int cont=0;
        String nombrePerro;
        System.out.println("Asignacion de perro");       
        System.out.println("ingrese dni persona");
        dnitemp=leer.nextInt();
        for (Persona persona : personas) {
            if (persona.getDni()==dnitemp){
                indicePersona=cont;   
                
            }
            cont++;           
        }
        System.out.println("listado de perros");
        System.out.println(perros);
        System.out.println("que perro desea adoptar de la lista");
        nombrePerro=leer.next();
        Iterator <Perro> ip=perros.iterator();
           while(ip.hasNext()){
               Perro perroAux=ip.next();
            if(perroAux.getNombre().equals(nombrePerro)){
                personas.get(indicePersona).setPerro(perroAux);
                 ip.remove();
            }
            
        }
        
         
    }
   
    
    public void mostrarPersona(ArrayList<Persona>personas, ArrayList<Perro>perros){
        System.out.println(personas);
        
    }
}
