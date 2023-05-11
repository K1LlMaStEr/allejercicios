package libreria;

import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencias.libroDao;
import servicios.serviciosAutor;
import servicios.serviciosEditorial;
import servicios.serviciosLibro;

public class Libreria {

    public static void main(String[] args) {
        serviciosAutor sa = new serviciosAutor();
        serviciosLibro sl = new serviciosLibro();
        serviciosEditorial se = new serviciosEditorial();
        libroDao ld=new libroDao();

        Scanner leer = new Scanner(System.in);

        System.out.println("...:::MENU:::...");
        int opcion = 0;
        do {
            System.out.println("1-Buscar libros por autor");
            System.out.println("2- cargar autor");
            System.out.println("3-Buscar libro por titulo");
            System.out.println("4-buscar libro por nombre de autor");
            System.out.println("5- Buscar libro por isbn");
            System.out.println("9- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        ld.buscarPorAutor();
                        
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                    
                    break;

                case 2:
                    try {
                        sa.crearAutor();
                        System.out.println(sa.listaAutores().toString());
                    } catch (Exception e) {
                        System.out.println("caja");

                    }
                    break;
                case 3:
                    try {

                        sl.crearLibro();

                    } catch (Exception e) {
                        System.out.println("a");
                    }
                    break;
                case 4:
                    try {
                        se.crearEditorial();
                        System.out.println(sa.listaAutores().toString());
                    } catch (Exception e) {

                    }
                    break;
                case 5:
                    
                    try {

                        System.out.println(ld.buscarPorIsbn1());

                    } catch (Exception e) {
                    }

                    break;

            }

        } while (opcion==9);{
        System.out.println("saliendo");
    }

    }

}
