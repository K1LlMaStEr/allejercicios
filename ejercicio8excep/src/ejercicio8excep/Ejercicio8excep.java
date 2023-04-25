/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8excep;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejercicio8excep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor=0;
         try {
valor = valor+1;
valor = valor + Integer.parseInt ("42");
valor = valor +1;
System.out.println("Valor final del try:" + valor) ;
} catch (NumberFormatException e) {
valor = valor + Integer.parseInt("42");
System.out.println("Valor final del catch:" + valor);
} finally {
valor = valor + 1;
System.out.println("Valor final del finally: " + valor) ;
}
valor = valor +1;
System.out.println("Valor antes del return: " + valor) ;
leer.next();
        System.out.println("-------------------------------");
        System.out.println("ejercicio2");


valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt ("W");
valor = valor + 1;
System.out.println("Valor final del try: " + valor) ;
} catch ( NumberFormatException e ) {
valor = valor + Integer.parseInt ("42");
System.out.println("Valor final del catch: " + valor) ;
} finally {
valor = valor + 1;
System.out.println("Valor final del finally: " + valor) ;
}
valor = valor + 1;
System.out.println("Valor antes del return: " + valor) ;
        System.out.println(valor);

        
        
 leer.next();

        valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt ("A");
valor = valor + 1;
System.out.println("Valor final del try: " + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt ("B");
System.out.println("Valor final del catch: " + valor);
} finally{
valor = valor + 1;
System.out.println("Valor final del finally:" + valor);
}
valor = valor + 1;
System.out.println("Valor antes del return: " + valor) ;
}
      
    
    
}
