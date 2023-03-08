/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


/**
 *
 * @author gonza
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> numerosA = new ArrayList();
        int x=20;
        int y=21;
        int z=22;
        int a=23;
        int b=24;
        int c=25;
        
        numerosA.add(x);
        numerosA.add(y);
        numerosA.add(z);
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        numerosA.remove(y);

        System.out.println(numerosA.toString());
         
              
        HashSet<Integer> numerosB =new HashSet();
        Integer q =30;
        Integer w =31;
        Integer e =32;
        Integer r =33;
        Integer t =34;
        Integer u =35;
        Integer i =36;
        
        numerosB.add(30);
        numerosB.add(31);
        numerosB.add(32);
        numerosB.add(33);
        numerosB.add(34);
        numerosB.add(35);
        numerosB.add(36);
        numerosB.remove(36);
        
        
        
                
        HashMap<Integer, String> alumnos = new HashMap();
        int Dni1=12;
        String nombreAlumno="pepe";
        int Dni2=123;
        String nombreAlumno1="pepas";
        int Dni3=1234;
        String nombreAlumno2="pepiss";
        int Dni4=12345;
        String nombreAlumno3="pepo";
        int Dni5=123456;
        String nombreAlumno4="pepu";
        int Dni6=1234567;
        String nombreAlumno5="pepus";
        int Dni7=12345678;
        
        alumnos.put(12, "pepe");
        alumnos.put(123, "pepas");
        alumnos.put(1234, "pepiss");
        alumnos.put(12345, "peoe");
        alumnos.put(123456, "pepu");
        alumnos.put(1234567, "pepus");
        alumnos.remove(12);
        
        HashMap<Integer, String> personas = new HashMap();
        int HP1=1989;        
        String n1 = "Albus";
        int HP2=1990;
        String n2 = "Severus";
        personas.put(HP1, n1);
        personas.put(HP2, n2);


        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        
        Iterator<String> it =bebidas.iterator();
        while (it.hasNext()){
        if (it.next().equals("café")){
        it.remove();
        }
        
       // ArrayList <String >
        
        
}


        
        
        
    }
    
}
