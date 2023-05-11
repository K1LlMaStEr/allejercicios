/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import persistencias.autorDao;
import persistencias.editorialDao;
import persistencias.libroDao;

public class servicioLibro {  private final libroDao DAO;
      private final editorialDao DAOe;

    public serviciosLibro() {
        this.DAO = new libroDao();
         this.DAOe = new editorialDao();
        
    }
   
    Scanner leer = new Scanner(System.in);
    public List<Libro> listaLibros(){
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        }
    
    
    
    }
    public void crearLibro(){
        try{
        serviciosAutor a1=new serviciosAutor();
        autorDao ad=new autorDao();
        int opcionAutor=0;
        Editorial e1=new Editorial();
        
        Libro libro=new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("MOOD CARGAR LIBRO");
       
        System.out.println("");  
        System.out.println("elija ID de la siguiente colunma del autor del libro que quiere cargar ");
        System.out.println(a1.listaAutores().toString());
        opcionAutor=leer.nextInt();
        libro.setAutor(ad.buscarPorID(opcionAutor));
            System.out.println("ingese isbn de libro");
        libro.setIsbn(leer.nextLong());
            System.out.println("ingrese año de libro");
            libro.setAnio(leer.nextInt());
            System.out.println("ingrese titulo del libro");
            libro.setTitulo(leer.next());
            
            System.out.println("ingrese editorial");
            
            e1.setNombre(leer.next());
            DAOe.guardar(e1);
            
            
            libro.setEditorial(e1);
            
        DAO.guardar(libro);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("entra a excepcion");
        }
    }
        public void buscarLibro(){
            serviciosAutor sa=new serviciosAutor();
             libroDao ld=new libroDao();
             try {
                 
                 System.out.println("ingrese autor a buscar");
                 
            
                 System.out.println(ld.buscarPorAutor(leer.next())); 
                 
                 System.out.println("imprime el toString"+ld.toString());
                 
                 
                
            } catch (Exception e) {
                 System.out.println("salio de try de buscar libro");
                
                
            }
            
            
           
             }
        public void mostrarLibro(){
            
            
        }
        
           
            
            
            
        }
    

