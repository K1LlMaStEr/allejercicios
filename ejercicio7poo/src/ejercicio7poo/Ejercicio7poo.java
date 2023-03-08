    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo;

import persona.persona;
import servicioPersona.servicioPersona;

/**
 *
 * @author Alumno
 */
public class Ejercicio7poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         servicioPersona sp = new servicioPersona();
        persona p1 = sp.crearPersona();
        
        
        p1.setImc(sp.calcularImc(p1.getPeso(),p1.getAltura()));
        sp.esMayorDeEdad(p1.getEdad());
        System.out.println(p1.getImc());
        
        
        switch (p1.getImc())
        {
            case -1:
                System.out.println("amiguit@ te falta comer");
                break;
            case 0:
                System.out.println("todo bien wachin");
                break;
            default:
                System.out.println(" A PAGAR GYMMMMMMMMMMM ");
                break;
        }
        System.out.println("----------------------------------");
 persona p2 = sp.crearPersona();
        sp.calcularImc(p2.getPeso(),p2.getAltura());
        sp.esMayorDeEdad(p2.getEdad());
        System.out.println(p2.getImc());
        
        if (p2.getImc() == -1 ) {
            System.out.println("amiguit@ te falta comer");
        }else if(p2.getImc() == 0 ){
            System.out.println("todo bien wachin");
        }else {
            System.out.println(" A PAGAR GYMMMMMMMMMMM ");
        }
persona p3 = sp.crearPersona();
        sp.calcularImc(p3.getPeso(),p3.getAltura());
        sp.esMayorDeEdad(p3.getEdad());
        System.out.println(p3.getImc());
        
        if (p3.getImc() == -1 ) {
            System.out.println("amiguit@ te falta comer");
        }else if(p3.getImc() == 0 ){
            System.out.println("todo bien wachin");
        }else {
            System.out.println(" A PAGAR GYMMMMMMMMMMM ");
        }
persona p4 = sp.crearPersona();
        sp.calcularImc(p4.getPeso(),p4.getAltura());
        sp.esMayorDeEdad(p4.getEdad());
        System.out.println(p4.getImc());
        
        if (p4.getImc() == -1 ) {
            System.out.println("amiguit@ te falta comer");
        }else if(p4.getImc() == 0 ){
            System.out.println("todo bien wachin");
        }else {
            System.out.println(" A PAGAR GYMMMMMMMMMMM ");
        }

        // TODO code application logic here
    }
    
}
