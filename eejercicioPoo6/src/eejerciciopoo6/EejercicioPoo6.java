/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eejerciciopoo6;

import java.util.Scanner;
import Entidad.cafetera;
import servicioCafetera.servicioCafetera;
/**
 *
 * @author Alumno
 */
public class EejercicioPoo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
        Scanner leer= new Scanner(System.in);
        servicioCafetera sc=new servicioCafetera();
        cafetera cafetera1= sc.crearCafetera();
        sc.agregarCafe(cafetera1);
        sc.servirTaza(cafetera1);
        
        System.out.println("desea vaciar cafetera");
        String opcion=leer.nextLine();
        if (opcion.equals("s")) {
           sc.vaciarCafetera(cafetera1);
        } else {
            System.out.println("su cafetera sigue con producto. buenas tardes");     
        
        }
        
        
        
        
        
    }
    }
    

