/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.icio9javapoo;

import Entidades.matematica;
import servicioMatematica.servicioMatematica;

/**
 *
 * @author Alumnox
 */
public class EjercIcio9javaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     servicioMatematica sm= new servicioMatematica();
     matematica m1= new matematica();
     m1.setNum1(Math.random()*(10-0)+0);
     m1.setNum2(Math.random()*(10-0)+0);
        System.out.println(m1.getNum1()+" "+m1.getNum2());
     double may=sm.devolverValor(m1.getNum1(),m1.getNum2());
     double men=sm.devolverMenor(m1.getNum1(),m1.getNum2());
     int mayor=(int)Math.round(may);
     int menor=(int)Math.round(men);
        sm.calcularPotencia(mayor, menor);
            
        
     
    }
    
}
