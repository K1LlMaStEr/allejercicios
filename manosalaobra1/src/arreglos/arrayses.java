/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Alumno
 */

 
public class arrayses {
    private Scanner Leer;
    private ArrayList<Integer> numeroA;
    private HashSet<Integer> numeroB;
    private HashMap<Integer, String> numeroC;
    
    public void crearlistas(int cantidad){
    ArrayList<Integer> numeroA = new ArrayList();
    int x=20;
    cantidad=5;
    numeroA.add(x);
        for (int i = 0; cantidad < 10; i++) {
            System.out.print("ingrese numero "+( i+1));
            numeroA.add(i);
            System.out.println(" "+ numeroA );
        }
        
    
    
    HashSet<Integer> numeroB = new HashSet();
    Integer y=20;
    numeroB.add(y);
    
    
    
    HashMap<Integer, String> numeroC = new HashMap();
    int Dni= 31996818;
    String nombreAlumno="pepe";
    numeroC.put(Dni, nombreAlumno);
    }
            
}
