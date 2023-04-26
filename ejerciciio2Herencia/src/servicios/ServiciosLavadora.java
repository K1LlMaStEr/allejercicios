/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Lavadora;

public class ServiciosLavadora extends ServiciosElectrodomesticos {
      
    public int precioFinal(int precio, int peso, String consumo, int carga){
        
        precio = super.precioFinal(precio, peso, consumo);
        if(carga > 30){
            precio+= 500;
        }
        return precio;
    }
    
    public void crearLavadora(Lavadora l){
        
        super.crearElectrodomestico(l);
        System.out.println("Ingrese la carga: ");
        int carga = leer.nextInt();
        l.setCarga(carga);
        int precio = precioFinal(l.getPrecio(), l.getPeso(), l.getConsumoE(), l.getCarga());
        l.setPrecio(precio);
        
    }
    
      
}
