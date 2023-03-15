/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author gonza
 */
public class Circulo implements calculosFormas {
    private double diamentro;
    private double pi;
   
     @Override
    public void perimetroRectangulo(double base, double altura){
        
    }
    
    @Override
    public void areaRectangulo(double base, double altura){
    
        
    }
    @Override
    public void pi(double num){
        
    }
    @Override
    public void areaCirculo(double pi, double radio){
        System.out.println("el area del circulo es "+((pi*radio)/2));
    }
    @Override
    public void perimetroCirculo(double pi , double diametro ){
        System.out.println("el perimetro del circulo es "+(pi*diametro));
    }

}
