/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Manosalaobra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   /* private Scanner Leer;
    private ArrayList<Integer> numeroA;
    private HashSet<Integer> numeroB;
    private HashMap<Integer, String> numeroC;*/
    
    
    ArrayList<Integer> numeroA = new ArrayList();
    int x=20;
    int a=2;
    int b=3;
    int c=5;
    int d=7;
    int e=9;
    
    numeroA.add(x);
    numeroA.add(a);
    numeroA.add(b);
    numeroA.add(c);
    numeroA.add(d);
    numeroA.add(e);
    ;
    System.out.println(""+numeroA);
    
        for (Integer integer : numeroA) {
            System.out.println(integer);          
         
            
        }
    numeroA.remove(c);
    
            
    for (Integer integer : numeroA) {
            System.out.println(integer);          
            }
    
    
    HashSet<Integer> numeroB = new HashSet();
    Integer y=22;
    Integer z=23;
    Integer p=24;
    Integer w=25;
    Integer u=26;
    Integer r=27;
    Integer t=28;
    
    numeroB.add(y);
    numeroB.add(z);
    numeroB.add(p);
    numeroB.add(w);
    numeroB.add(u);
    numeroB.add(r);
    numeroB.add(t);
    
     for (Integer integer : numeroB) {
            System.out.println(integer);   
        }
    numeroB.remove(22);
   
     for (Integer integer : numeroB) {
            System.out.println(integer);   
        }
    
    LinkedHashMap<Integer, String> alumnos = new LinkedHashMap();
    int Dni1= 31996818, Dni2=3123123, Dni3=32987432, Dni4=12344432, Dni5=123432;
    String nombreAlumno1="pepe";
    String nombreAlumno2="juanCarlos";
    String nombreAlumno3="boby"; 
    String nombreAlumno4="carla";
    String nombreAlumno5="rocio";
    alumnos.put(Dni1, nombreAlumno1);
    alumnos.put(Dni2, nombreAlumno2);
    alumnos.put(Dni3, nombreAlumno3);
    alumnos.put(Dni4, nombreAlumno4);
    alumnos.put(Dni5, nombreAlumno5);
    
    
        System.out.println(alumnos.toString());
        
        
        
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            
        }
        
        
        /*
    alumnos.remove(31996818);
    
    for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
    }*/
    
       
    
    
        System.out.println("imprimir colecciones");
        System.out.println("Arraylist: ");
        System.out.println(numeroA.toString());
        System.out.println("hashset: ");
        System.out.println(numeroB.toString());
        System.out.println("HashMap: ");
        System.out.println(alumnos.toString());
    }
            
for(Map.Entry<Integer, String> aux : alumnos.entrySet()){  System.out.println(aux.getKey() + aux.getValue);
    
}
