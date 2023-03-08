 
package libro;

import java.util.ArrayList;
import java.util.Scanner;



public class Libro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       ArrayList<String> Libros= new ArrayList();   
       
        System.out.println("ingrese cantidad de libros a ingresa");

        System.out.println("bienvenido");
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese libro a cargar ");
            String libro=leer.nextLine();
            Libros.add(libro);
           }
        for (String Libro : Libros) {
            System.out.println(Libro);
            
        }
            
        }
        
        
        
        
        // TODO code application logic here
    }
    
