/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import tienda.persistencia.productoDao;

/**
 *
 * @author gonza
 */
public class serviciosProducto {
    
    private productoDao Dao;
         public serviciosProducto() {
        this.Dao = new productoDao();
    }
    
     public ArrayList <String> ListarProductos() throws Exception{
     
        try {
           
              

             
             return Dao.ListarProductos();
             
             
         } catch (Exception e)  {
             throw e;
         
         } 
        
     }
     public ArrayList <String> nombrePrecio() throws Exception{
      // ArrayList<String> nombrePrecios = null;
        try {
           
               //nombrePrecios= Dao.nombrePrecios();

             
             return Dao.nombrePrecios();
             
             
         } catch (Exception e)  {
             throw e;
         
         } 
        
     }
}

    

