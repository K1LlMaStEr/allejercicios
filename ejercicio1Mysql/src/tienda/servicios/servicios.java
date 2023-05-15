/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class servicios {

    public void consulta() {
        String opcion = null;
        Scanner leer = new Scanner(System.in);
        serviciosProducto sv = new serviciosProducto();
        System.out.println("Bienvenido");
        System.out.println("ingresando al menu");
        System.out.println("----------------------------");

        int opcionMenu = 0;
        do {
            System.out.println("tienda menu");
            System.out.println("1-Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2-Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3-Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4-Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5-Listar el nombre y el precio del producto más barato.");
            System.out.println("6-Ingresar un producto a la base de datos.");
            System.out.println("7-Ingresar un fabricante a la base de datos");
            System.out.println("8-Editar un producto con datos a elección.");
            System.out.println("9- salir");
            System.out.println("elija una opcion");
            opcionMenu = leer.nextInt();
            
            switch (opcionMenu) {
                
                case 1:
                    
                    try {
                        System.out.println("+-----------------------------+");
                        System.out.println("|     Nombre de Producto      |");
                        System.out.println("+-----------------------------+");
                        System.out.println(sv.ListarProductos().toString().replace(",", "+-----------------------------+\n"));
                        
                        System.out.println("+-----------------------------+");
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error de sistema por \n" + e.getMessage());
                        
                    }
                   break;

                case 2:
                    try {
                     System.out.println( sv.nombrePrecio());
                        
                    } catch (Exception e) {
                         e.printStackTrace();
                      System.out.println("Error de sistema por \n" + e.getMessage());
                        
                    }
                   break;
                case 3: try {
                     System.out.println( sv.preciosEntre());
                        
                    } catch (Exception e) {
                         e.printStackTrace();
                      System.out.println("Error de sistema por \n" + e.getMessage());
                        
                    }
                   break;
                case 4:
                     try {
                     System.out.println( sv.portatil());
                        
                    } catch (Exception e) {
                         e.printStackTrace();
                      System.out.println("Error de sistema por \n" + e.getMessage());
                        
                    }
                   break;
                case 5:
                     try {
                     System.out.println( sv.baratos());
                        
                    } catch (Exception e) {
                         e.printStackTrace();
                      System.out.println("Error de sistema por \n" + e.getMessage());
                        
                    }
                   break;
                case 6:
                     try {
                    
                        
                    } catch (Exception e) {
                         e.printStackTrace();
                      System.out.println("Error de sistema por \n" + e.getMessage());
                        
                    }
                   break;
                case 7:
                    System.out.println("");
                    
            }
           
        } while(opcionMenu==9);
        }
        
    }
/*
Daniel Roa 21:15
case 1 ->{
                    try{
                        System.out.println("+-----------------------------+");
                        System.out.println("|     Nombre de Productos     |");
                        System.out.println("+-----------------------------+");
                        //System.out.println(sP.listarNombreProductos().toString().replace(",", "+-----------------------------+"));
                        System.out.println(sP.listarNombreProductos().toString());
                        System.out.println("+-----------------------------+");
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    }
*/
