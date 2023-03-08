
package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class servicioPerro {
    
    public void crearPerro(){
        Scanner leer = new Scanner(System.in);
        int opcion;
        ArrayList <String> raza=new ArrayList();
        System.out.println("Bienvenido al menu;  ");
        System.out.println("ingrese 1 para ingresar raza");
        System.out.println("ingrese 2 para salir");
        opcion=leer.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("ingrese cantidad de perros a ingresar");
                int cant=leer.nextInt();
                for (int i = 0; i < (cant); i++) {
                     System.out.println("ingrese raza");
                raza.add(leer.next());
                    
                }
                break;
            case 2:
                System.out.println("muchas Gracias por participar");
               break;
        }
        
                System.out.println(raza);
                
            System.out.println("ingrese raza a buscar");
            String perro=leer.nextLine();
            int cont=0;
            System.out.println(perro);
            Iterator iterator= raza.iterator();    
            
            while(iterator.hasNext()) { 
                if (iterator.next().equals(perro)){
                    raza.remove(perro);
                    cont++;
                }
                if (cont>0){
                    System.out.println("no se encontro");}
                else{
                    System.out.println("se encontro");
                }
                Collections.sort(raza);
                for (String string : raza) {
                    System.out.println(raza+" ");
                    
                }
                
                
    }         
        
        
            
            
            
                
            
            
    
    
}
        
        
        
       
     

        
        
        
        
        /*if (opcion==1){
            for (int i = 0; i < 5; i++) {
                System.out.println("ingrese raza");
                raza.add(leer.next());
        }if (opcion==2) {
                System.out.println("gracias por participar");
                
                }
        
        
            for (String string : raza) {
                System.out.println(raza);
                
            }
                
        }*/
          
        
        
        
        
    }
    

/*main
package lista.perros;

import static com.sun.jmx.snmp.ThreadContext.contains;
import entidades.Perro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import servicio.PerroServicio;


public class ListaPerros {

  
    public static void main(String[] args) {
        
        //PerroServicio Ps =new PerroServicio();
        
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        
        ArrayList <String> perros = new ArrayList();
        
        Perro perro = new Perro();
        
        System.out.println("Bienvenido");
        //leer.nextLine();
        //perros.add(raza);
        //for (String Perro : perros) {
        //    System.out.println(perros);
        //}
        
       
        
        do {  
            System.out.println("1- Ingrese una raza de perro");
            System.out.println("2- Salir");
            int op = leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese raza de perro");
                    String raza1 = leer.next();
                    perros.add(raza1);
                    break;
                case 2:
                    System.out.println("Salir");
                    salir= true;
                    break;
                    default:
                        System.out.println("Las razas de la lista son: ");
            }
            
        } while (!salir);
        
         for (String Perro : perros) {
            System.out.println(perros);
        }
        
        System.out.println("Ingrese perro a buscar");
        String raza2 = leer.next();
        perros.add(raza2);
        contains(raza2);
        
        int cont =0;
        Iterator <String> it = perros.iterator();
        while (it.hasNext()) {
            String raza1 = it.next();
            
            if(raza1.equals(raza2)) { 
                cont++;
                it.remove(); 
                
            }
            
             
        }
        if (cont==0){
                System.out.println("se removio raza");}
        else{
            System.out.println("no se encotro raza");
        }
        System.out.println(cont);
         for (String Perro : perros) {
            System.out.println(perros);
        }
        
        
       
        
    }
    
}*/
