/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import Producto.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import tienda.persistencia.productoDao;

/**
 *
 * @author gonza
 */
public class serviciosProducto {
    Scanner leer = new Scanner(System.in);
    
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
    
        try { 
            return Dao.nombrePrecios();
             
             
         } catch (Exception e)  {
             throw e;
         
         } 
        
     }
     public ArrayList <String> preciosEntre() throws Exception{
         try {
             return Dao.precioEntre();
             
         } catch (Exception e) {
             throw e;
         }
     }
      public ArrayList <String> portatil() throws Exception{
         try {
             return Dao.poratiles();
             
         } catch (Exception e) {
             throw e;
         }
     }
       public ArrayList <String> baratos() throws Exception{
         try {
             return Dao.baratos();
             
         } catch (Exception e) {
             throw e;
         }
     }
       public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception {
          
           try{
               productoDao pD=new productoDao();
           String fabricante;
           System.out.println("ingrese nombre producto");
           nombre=leer.next();
           System.out.println("ingrese precio");
           precio=leer.nextDouble();
         
           System.out.println("ingrese fabricante acorde a la lista");
           
           codigoFabricante=leer.nextInt();
           

           // Creamos el mascota
           Producto producto=new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
          

            pD.guardaProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }
}

    

