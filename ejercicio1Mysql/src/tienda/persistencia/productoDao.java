
package tienda.persistencia;

import Producto.Producto;
import java.util.ArrayList;


public final class productoDao extends claseDao {

    public productoDao() {
    }
    
    public ArrayList <Producto> ListarProductos() throws Exception{
    
            try {
                String sql="select nombre from producto";
                consultarBase(sql);
                Producto nombreProducto=null;
               
                ArrayList<Producto> nombreProductos = new ArrayList();
                  
                while (resultado.next()) {
                    nombreProducto = new Producto();
                    nombreProducto.setNombre(resultado.getString(1));
                    nombreProductos.add(nombreProducto);

                }

                return nombreProductos;

                
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
                throw e;
        }
    }
     public ArrayList <String> listallenas() throws Exception{
    
            try {
                String sql="select codigo, nombre  from fabricante";
                  consultarBase(sql);
                String listaLlena=null;
               
                 ArrayList<String> listallenas = new ArrayList();
                  
                while (resultado.next()) {
                   
                listaLlena=resultado.getString(1);
                   
                listallenas.add(listaLlena);
                
                }

                return listallenas;

                
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
                throw e;
        }
    }
              public ArrayList <String> nombrePrecios() throws Exception{
    
            try {
                String sql="select nombre,precio from producto";
                  consultarBase(sql);
                String nombrePrecio=null;
                
                 ArrayList<String> nombrePrecios = new ArrayList();
                  
                while (resultado.next()) {
                     nombrePrecio=new String();
                nombrePrecio=resultado.getString(1)+"= $"+resultado.getDouble(2);
                 
                nombrePrecios.add(nombrePrecio);
                
                }
            
                return nombrePrecios;

                
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
                throw e;
        }
              }
                   public ArrayList <String> precioEntre() throws Exception{
    
            try {
                String sql="select nombre, precio from producto where precio>120 and precio<202 ";
                  consultarBase(sql);
                String precioEntre=null;
                
                 ArrayList<String> preciosEntre = new ArrayList();
                  
                while (resultado.next()) {
                     precioEntre=new String();
                precioEntre=resultado.getString(1)+"= $"+resultado.getDouble(2);
                   // System.out.println(nombrePrecio);
                preciosEntre.add(precioEntre);
                
                }

                return preciosEntre;

                
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
                throw e;
        }
                   }
                          public ArrayList <String> poratiles() throws Exception{
    
            try {
                String sql="select nombre, precio from producto where nombre like '%portatil%' ";
                  consultarBase(sql);
                String portatil=null;
                
                 ArrayList<String> poratiles = new ArrayList();
                  
                while (resultado.next()) {
                     portatil=new String();
                portatil=resultado.getString(1)+"= $"+resultado.getDouble(2);
                   // System.out.println(nombrePrecio);
                poratiles.add(portatil);
                
                }

                return poratiles;

                
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
                throw e;
        }
                   }
                          public ArrayList <String> baratos() throws Exception{
    
            try {
                String sql="select nombre, precio from producto order by precio asc limit 1 ";
                  consultarBase(sql);
                String barato=null;
                
                 ArrayList<String> baratos = new ArrayList();
                  
                while (resultado.next()) {
                     barato=new String();
                barato=resultado.getString(1)+"= $"+resultado.getDouble(2);
                   // System.out.println(nombrePrecio);
                baratos.add(barato);
                
                }

                return baratos;

                
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
                throw e;
        }
                   }
       public void guardaProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("ingrese nombre producto");
            }
            String sql = "INSERT INTO Producto (nombre, precio, codigoFabricante) "
                    + "VALUES ( '"  + "' , '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' ," + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }                    
}
        
        
     

    

