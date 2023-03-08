/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.Scanner;
import entidad.entidadpaises;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author gonza
 */
public class serviciospaises {
    
    public void cargaPaises(HashSet<String> p){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int opcion;
        
       
        System.out.println("Bienvenido al menu;  ");
        System.out.println("ingrese 1 para ingresar pais");
        System.out.println("ingrese 2 para salir");
        opcion=leer.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("ingrese cantidad de paises a agregar");
                int cant=leer.nextInt();
                for (int i = 0; i < (cant); i++) {
                     System.out.println("ingrese pais");
                
                p.add(leer.next());
                    
                }
                break;
            case 2:
                System.out.println("muchas Gracias por participar");
               break;
        }
        
        System.out.println("los paises ingresados son: ");        
        System.out.println(p);
        
        System.out.println("--------------------------------------");
        
    }
    public void ordenarPaises(HashSet<String>p){
        ArrayList<String> ordenados = new ArrayList(p);
        Collections.sort(ordenados);
        System.out.println("paises ordenados alfabeticamente");
        System.out.println(ordenados);
        
        System.out.println("---------------------------------------");
}
    
    public void encontrado(HashSet<String> p) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese pais a buscar");
        String paiss = leer.next();
        System.out.println("-----------------------------------");
        int cont = 0;
        System.out.println(paiss);
        Iterator<String> iterator = p.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(paiss)) {
                iterator.remove();
                cont++;
            }
        }
            if (cont > 0) {
                System.out.println(" se encontro y elimino pais");
                System.out.println("----------------------------------------");
                
            } else {
                System.out.println("no se encontro");
                System.out.println("-----------------------------------------");
            }
            System.out.println("..::Resultado::..");
             System.out.println(p);

        }
       

    }

