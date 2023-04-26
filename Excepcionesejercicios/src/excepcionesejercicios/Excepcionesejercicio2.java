/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesejercicios;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Excepcionesejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList();
        String abc;
        nombre.add("abc");
        try {
            System.out.println(nombre.get(2));
          
          
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error");
        }
        // TODO code application logic here
    }
    
}
