/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import java.util.List;
import java.util.Scanner;
import persistencias.autorDao;

/**
 *
 * @author gonza
 */
public class servicioAutor {
    
  private final autorDao DAO;

    public serviciosAutor() {
        this.DAO = new autorDao();
    }
    public List<Autor> listaAutores(){
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        }
    
    
    
    }
    public void crearAutor(){
        Autor autor=new Autor();
        Scanner leer = new Scanner(System.in);
        System.out.println("MOOD CARGAR AUTOR");
       
            
            System.out.println("ingrese nombre autor ");
        autor.setNombre(leer.next());
        System.out.println("ingrese true o false status de autor");
        autor.setAlta(leer.nextBoolean());
            
        
        
        
       
        
     DAO.guardar(autor);
        
}
    
    
    
    
}

