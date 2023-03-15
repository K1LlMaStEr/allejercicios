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
public class Rectangulo implements calculosFormas {
    private double base;
    private double altura;
    private double pi;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double pi) {
        this.base = base;
        this.altura = altura;
        this.pi = pi;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", pi=" + pi + '}';
    }
    @Override
    public void perimetroRectangulo(double base, double altura){
        System.out.println("el perimetro del rectangulo es: "+ ((base+altura)*2));
    }
    
    @Override
    public void areaRectangulo(double base, double altura){
        System.out.println("el area del rectangulo es: "+(base*altura));
        
    }
    @Override
    public void pi(double num){
      
        
    }
    @Override
    public void areaCirculo(double pi, double radio){
        
    }
    @Override
    public void perimetroCirculo(double pi , double diametro ){
        
    }

}
