/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio4excepciones {

    /**
     * @param args the command line
     * arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        try{
        System.out.println("ingrese un numero");
        int numero=leer.nextInt();
        } catch(InputMismatchException e){
            System.out.println("no ingreso dato de tipo entero"); 
        }
        leer.next();
         System.out.println("ingrese una palabra");
        String num=leer.next();
        try{ Integer.parseInt(num);
        }
        catch(NumberFormatException e){
            System.out.println("ingreso mal el dato");
            
        }
        leer.next();
        System.out.println("ingrese un numero");
        try{
     
        int numerito=leer.nextInt()/0;}
        catch(ArithmeticException e){
            System.out.println("todos echos");   
        }
        
        
        
       
       
        
       
    }
    
}
