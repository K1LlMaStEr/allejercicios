/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class serviciosExcep {
       public void excepcion(){
          Scanner leer = new Scanner(System.in);
     System.out.println("ingrese un nombre");
        String nombre=leer.next();
        Integer.parseInt(nombre);
        
    }
    
}
