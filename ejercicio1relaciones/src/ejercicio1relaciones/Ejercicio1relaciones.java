
package ejercicio1relaciones;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.serviciosPerro;
import servicio.serviciosPersonas;

public class Ejercicio1relaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();

        Persona p1 = new Persona();

        Persona p2 = new Persona();

        Perro p3 = new Perro();

        serviciosPersonas sa = new serviciosPersonas();
        serviciosPerro sp = new serviciosPerro();
        personas.add(new Persona("Andrea", "Martinez", 29, 1102988365, new Perro()));
        personas.add(new Persona("Julio", "Sanchez", 32,  1103317045, new Perro()));
        personas.add(new Persona("Ximena", "Carpio", 42, 1734567822, new Perro()));
        personas.add(new Persona("Gustavo", "Alvarez", 39, 1102988357, new Perro()));
        perros.add(new Perro("Bruno","Mestizo",5,"Mediano"));
        perros.add(new Perro("Carol","Mestizo",3,"Mediano"));
        perros.add(new Perro("Coffee","Mestizo",1,"Grande"));
        perros.add(new Perro("Pimienta","Mestizo",1,"Pequeña"));
        perros.add(new Perro("Amor","Mestizo",6,"Mediano"));

        int opcion;

        String op;
        do {
            System.out.println("bienvenido");
            System.out.println("menu :");
            System.out.println("1-crear persona");
            System.out.println("2-crear perro");
            System.out.println("3-asignar perro");
            System.out.println("4-salir menu");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        personas.add(sa.cargarPersona());
                        System.out.println("desea cargar otra persona?");
                        op = leer.next();
                    } while (op.equalsIgnoreCase("s"));

                    break;
                case 2:
                    do {
                        perros.add(sp.crearPerro());
                        System.out.println("desea cargar otro perro?");
                        op = leer.next();
                    } while (op.equalsIgnoreCase("s"));

                    break;
                case 3:
                    sa.asignarPerro(personas, perros);
                   
            }
                
        }while (opcion != 4);
        
           
        sa.mostrarPersona(personas, perros);
         sp.mostrarPerro(personas, perros);
            
        }
        
    }

/*    
        do {
             switch (opcion){
            case 1: humano.add(sa.cargarPersona());
                  break;
            case 2: can.add(sa.crearPerro());
                 break;
            
        } while (op==true);
        
        
       
        
        }
        }    }*/

       