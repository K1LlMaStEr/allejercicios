/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);    
        System.out.println("ingrese una letra");
        String vocal=leer.nextLine();
       switch (vocal){
           case "A":
               System.out.println("es vocal");
               break;
            case "E":
               System.out.println("es vocal");
               break;   
            case "I":
               System.out.println("es vocal");
               break;   
            case "O":
               System.out.println("es vocal");
               break;
            case "U":
               System.out.println("es vocal");
               break;   
            default :
                System.out.println("no es vocal");
       }  
        

            
                
            
        
    }
    
}
