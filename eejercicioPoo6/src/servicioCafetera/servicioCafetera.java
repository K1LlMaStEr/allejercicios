/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioCafetera;
import Entidad.cafetera;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * 
 */
public class servicioCafetera {
    Scanner leer=new Scanner(System.in);
    
    public cafetera crearCafetera(){
        System.out.println("ingrese capacidad Maxima de cafetera ");
        int capacidad=leer.nextInt();
        System.out.println("que cantidad tiene la cafetera?");
        int cantidadini=leer.nextInt();
         return new cafetera(capacidad, cantidadini);
    }
     public void servirTaza( cafetera c){
        
        System.out.println("ingrese el tamaño de la taza");
        int tamanio= leer.nextInt();
        int falta=0;
        int capacidadActual=c.getCapacidadActual();
        
        if (tamanio>capacidadActual ){
            
            falta = tamanio - capacidadActual;
            capacidadActual=0;
            System.out.println("Falto para llenar su taza "+tamanio);
            
        }else { 
                    capacidadActual = capacidadActual-tamanio;
                    System.out.println("La capacidad actual es de "+capacidadActual);
                                                
        }
                
    }
    
    public void vaciarCafetera(cafetera c){
        
        c.setCapacidadActual(0);
        System.out.println("Se vacio su capacidad con exito");
        
        
        
    }
     public void agregarCafe(cafetera c){
         int cafeina=c.getCapacidadActual();
         int max=c.getCapacidadMaxima();
         
         //carga= Integer.parseInt(JOptionPane.showInputDialog("cuanto cafe desea adicionar"));
         System.out.println("cuanto cafe desea adicionar a la cafetera?");
         int carga=leer.nextInt();
         int suma=cafeina+carga;
         
         
         if (suma<max){
             System.out.println("la cafetera quedo con "+suma);
             
         c.setCapacidadActual(suma);
         }else {
          System.out.println("se excedio del maximo de la cafetera");}
         
               
         //System.out.println("su capacidaD ACTUAL es de "+ suma);
         
     }
     }
