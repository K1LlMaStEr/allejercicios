/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioAlumno;

import alumno.alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class servicioAlumno {
    Scanner leer = new Scanner(System.in);
    
    public ArrayList crearAlumno(){
        String resp;
        ArrayList<alumno> alumnos = new ArrayList();
        do{
            ArrayList<Integer> notas = new ArrayList();
            
            alumno obj = new alumno();
            System.out.println("Ingrese su nombre: ");
            obj.setAlumno(leer.next());
        
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese una nota: ");
                notas.add(leer.nextInt());
            }
             obj.setNotas(notas);
             alumnos.add(obj);
  
            System.out.println("Desea seguir cargando alumnos: ");
            resp = leer.next();
        }while(!resp.equals("n"));
        
       return alumnos;
    }
    


    public void imprimirAlumno(ArrayList<alumno>a){
        for (alumno object : a) {
            System.out.println(object.toString());
            
        }
     
            
        }
    public void buscarAlumno(ArrayList<alumno>a){
                System.out.println("Ingrese el nombre del alumno: ");
        String alumno = leer.next();
        
        for (alumno alumno1 : a) { 
             if(alumno1.getAlumno().equals(alumno)){
                    System.out.println("ENCONTRADO");
                    ArrayList<Integer> note = alumno1.getNotas();
                    double prom = sacarPromedio(note);
                    System.out.println("El promedio de las notas es: "+prom);
                }
        }
                   
                    
                   
                 
               }
           
            
            
       
            
        
    
  public double sacarPromedio(ArrayList<Integer> Notas){
        int sumatoria=0;
        for (Integer Nota : Notas) {
            sumatoria+= Nota;
        }
        double promedio = sumatoria /3;
        return promedio;
    }
        
}


