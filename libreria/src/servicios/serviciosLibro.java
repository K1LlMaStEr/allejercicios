package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;

import java.util.List;
import java.util.Scanner;
import persistencias.autorDao;
import persistencias.libroDao;
import persistencias.editorialDao;

public class serviciosLibro {

    private final libroDao DAO;
    private final editorialDao DAOe;

    public serviciosLibro() {
        this.DAO = new libroDao();
        this.DAOe = new editorialDao();

    }

    Scanner leer = new Scanner(System.in);

    public List<Libro> listaLibros() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }

    }

    public void crearLibro() {
        try {
            serviciosAutor a1 = new serviciosAutor();
            serviciosLibro se = new serviciosLibro();
            serviciosEditorial edit = new serviciosEditorial();
            autorDao ad = new autorDao();
            editorialDao ed = new editorialDao();
            int opcionAutor = 0;
            Editorial e1 = new Editorial();

            Libro libro = new Libro();
            Scanner leer = new Scanner(System.in);
            System.out.println("MOOD CARGAR LIBRO");

            System.out.println("");
            System.out.println("elija ID de la siguiente colunma del autor del libro que quiere cargar ");
            System.out.println(a1.listaAutores().toString().replace(",", "\n"));
            opcionAutor = leer.nextInt();
            libro.setAutor(ad.buscarPorID(opcionAutor));
            System.out.println("ingese isbn de libro");
            libro.setIsbn(leer.nextLong());
            System.out.println("ingrese año de libro");
            libro.setAnio(leer.nextInt());
            System.out.println("ingrese titulo del libro");
            libro.setTitulo(leer.next());
            System.out.println("ingrese cantidad de ejemplares del libro");
            libro.setEjemplares(leer.nextInt());
            System.out.println("ingrese cantidad de libros prestados");
            libro.setEjemplaresPrestados(leer.nextInt());
            libro.setEjemplaresRestantes(libro.getEjemplares()-libro.getEjemplaresPrestados());
            System.out.println("libros restantes"+(libro.getEjemplaresRestantes()));
            if (libro.getEjemplaresRestantes() > 0) {
                libro.setAlta(true);
            } else {
                libro.setAlta(false);
            }
            System.out.println("vamos a cargar la editorial");
            
            System.out.println(se.DAOe.listarTodos().toString().replace(",", "\n"));
            System.out.println("elija editorial");
            System.out.println("leer lista,si se encuetra en la lista ingrese 1");
            System.out.println("de lo contrario 2");
            int opcionCarga = leer.nextInt();
            switch (opcionCarga) {
                case 1:
                    System.out.println("ingrese el numero de id de la editorial");
                    int opcionEdit = leer.nextInt();

                    libro.setEditorial(ed.buscarPorID(opcionEdit));
                    break;
                case 2:
                    edit.crearEditorial();
                    System.out.println(se.DAOe.listarTodos().toString());
                     System.out.println("elija editorial");
                     libro.setEditorial(ed.buscarPorID(leer.nextInt()));
                    System.out.println("fin crear editorial en case2");
                    
                    
                    break;
            }
               DAO.guardar(libro);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("entra a excepcion");
        }
    }

//    public void buscarLibro() {
//        serviciosAutor sa = new serviciosAutor();
//        libroDao ld = new libroDao();
//        try {
//
//           
//
//            System.out.println(ld.buscarPorAutor(leer.nextInt()));
//
//            System.out.println("imprime el toString" + ld.toString());
//
//        } catch (Exception e) {
//            System.out.println("salio de try de buscar libro");
//
//        }
//
//    }

    public void buscarPorIsbn() {
        try {
             libroDao ld=new libroDao();
             System.out.println("ingrese isbn a buscar");
             int aux=leer.nextInt();
             ld.buscarPorIsbn1();
             
         
       
        
            
        } catch (Exception e) {
            
        }
       
        

    }

}
        
        
        
       
        
     
        

    

