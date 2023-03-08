/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomio2;

import circunsferencia.circunsferencia;
import servicio.servicioCircunsferencia;

/**
 *
 * @author Alumno
 */
public class Ejerciciomio2 {
    
    public static double areaa(double r, double p){
        
        double areaa=(p*(r*r));
        
        return areaa;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        circunsferencia c1= new circunsferencia();
        servicioCircunsferencia sc=new servicioCircunsferencia();
        
        c1=c1.crearCircunsferencia();
        System.out.println("el area de la circunferencia es "+Ejerciciomio2.areaa(2, 3.1416) );
        
        c1.setArea((3.1416 *(c1.getRadio()*c1.getRadio())));
        System.out.println("el area es " +c1.getArea());
        // TODO code application logic here
    }
    
}
