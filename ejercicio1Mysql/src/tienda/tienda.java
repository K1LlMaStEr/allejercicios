/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.persistencia.productoDao;
import tienda.servicios.servicios;



/**
 *
 * @author gonza
 */
public class tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    servicios sv=new servicios();
     sv.consulta();
     
    }
    
}
