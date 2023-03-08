//MAIN
package ejercicio7javaPoo;

import Persona.Persona;
import servicioPersona.servicioPersona;






public class ejercicio7javaPoo {

    
    public static void main(String[] args) {
     
        servicioPersona sp = new servicioPersona();
        Persona p1 = sp.crearPersona();
        
        
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
 Persona p2 = sp.crearPersona();
        sp.calcularImc(p2.getPeso(),p2.getAltura());
        sp.esMayorDeEdad(p2.getEdad());
        System.out.println(p2.getImc());
        
        if (p2.getImc() == -1 ) {
            System.out.println("amiguit@ te falta comer");
        }else if(p1.getImc() == 0 ){
            System.out.println("todo bien wachin");
        }else {
            System.out.println(" A PAGAR GYMMMMMMMMMMM ");
        }

    }
}