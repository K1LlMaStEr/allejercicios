/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1ale;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author gonza
 */
public class Eje1Ale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int cont=0;
         Scanner leer = new Scanner(System.in);
         ArrayList<String> raza = new ArrayList();
         System.out.println("bienvenidos");
         System.out.println("ingrese cantidad de perros a ingresar");
         cont=leer.nextInt();
         System.out.println("ingrese una opcion");
         System.out.println("1.Ingrese una raza de perro");
        System.out.println("2.Salir");
        int opcion=leer.nextInt();
        while  (opcion!=2) {

            for (int i = 0; i < cont; i++) {
            
            System.out.println("ingrese raza");
            raza.add(leer.next());
            i++;
           
            
        }
        
        
    }
      
          
   }  

    
 } 