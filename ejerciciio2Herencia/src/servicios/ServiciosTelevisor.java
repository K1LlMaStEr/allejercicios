/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import entidades.Televisor;

/**
 *
 * @author PC
 */
public class ServiciosTelevisor extends ServiciosElectrodomesticos{
   
    public int precioFinal(int precio, int peso, String consumo, int res, boolean sint){
        
        precio = super.precioFinal(precio, peso, consumo);
        
        double nuevoPrecio = precio;
        if(res > 40){
            nuevoPrecio = (precio * 0.3) + precio;
        }
        if(sint){
            nuevoPrecio+= 500;
        }
        
        int nuevoPrecio2 = (int) nuevoPrecio;
        
        return nuevoPrecio2;
    }
    
    public void crearTelevisor(Televisor t){

        super.crearElectrodomestico(t);
        System.out.println("Ingrese resolucion(pulgadas): ");
        int res = leer.nextInt();
        System.out.println("Tiene sintonizador(S/N)?");
        String resp = leer.next().toLowerCase();
        
        if(resp.equals("s")){
            t.setSintonizador(true);
        }else{
            t.setSintonizador(false);
        }
        t.setResolucion(res);
        int precio = precioFinal(t.getPrecio(), t.getPeso(), t.getConsumoE(), t.getResolucion(), t.isSintonizador());
        t.setPrecio(precio);
    
    }
}
