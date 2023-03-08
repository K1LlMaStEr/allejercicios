/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maocolecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class MAOcolecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        
      ArrayList<String> biblioteca = new ArrayList();
        System.out.println("Bienvenido. Ingrese 3 libro");
        biblioteca.add(leer.nextLine());
        biblioteca.add(leer.nextLine());
        biblioteca.add(leer.nextLine());
        
        for (String string : biblioteca) {
            System.out.print(biblioteca);
        }
        
        
        
      
    }
    
}
