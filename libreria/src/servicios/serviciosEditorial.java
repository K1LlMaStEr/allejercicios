/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import persistencias.autorDao;
import persistencias.editorialDao;



/**
 *
 * @author gonza
 */
public class serviciosEditorial {
    private final editorialDao DAO;

    public serviciosEditorial() {
        this.DAO =new editorialDao();
        
    }

   
    public List<Editorial> listaEditoriales(){
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        }
        
    
}
    public void crearEditorial(){
        Editorial editorial=new Editorial();
        Scanner leer = new Scanner(System.in);
        System.out.println("MOOD CARGAR EDITORIAL");
        System.out.println("ingrese nombre editorial ");
        editorial.setNombre(leer.next());
        System.out.println("ingrese true o false status de autor");
        editorial.setAlta(leer.nextBoolean());
        System.out.println("fin crear editorial");
       
        
     DAO.guardar(editorial);
     
    }
   
}
