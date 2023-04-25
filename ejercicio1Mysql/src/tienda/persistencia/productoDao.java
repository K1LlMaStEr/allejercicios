
package tienda.persistencia;

import Producto.Producto;
import java.util.ArrayList;


public final class productoDao extends claseDao {

    public productoDao() {
    }
    
    public ArrayList <String> ListarProductos() throws Exception{
    
            try {
                String sql="select nombre from producto";
                  consultarBase(sql);
                String nombreProducto=null;
                //nombreProducto= "juan";
                 ArrayList<String> nombreProductos = new ArrayList();
                  
                while (resultado.next()) {
                   
                nombreProducto=resultado.getString(1);
                   
                nombreProductos.add(nombreProducto);
                
                }
//                for (String nombreProducto1 : nombreProductos) {
//                    System.out.println(nombreProducto1);
//                    
//                }
                //desconectarBase();
                return nombreProductos;

                
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
                   // System.out.println(nombrePrecio);
                nombrePrecios.add(nombrePrecio);
                
                }
//               for (String nombreProducto1 : nombreProductos) {
//                    System.out.println(nombreProducto1);
//                    
//                }
                //desconectarBase();
                return nombrePrecios;

                
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
                throw e;
        }
              }
}
        
        
        /*try { String Consulta="select nombre from producto";
                consultarBase(Consulta);
                System.out.println(" entra al try");
                String nombreProducto=null;
                ArrayList<String> nombreProductos = new ArrayList();
                while (resultado.next()) {
                nombreProducto=resultado.getString(1);
                nombreProductos.add(nombreProducto);
                }
                return nombreProductos;
            } catch (Exception e) {
                e.printStackTrace();
                desconectarBase();
                throw e;
            }*/ 
    

    

    

