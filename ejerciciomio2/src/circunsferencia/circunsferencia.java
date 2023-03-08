/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunsferencia;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */

public class circunsferencia {
    private int radio;
    public double area;
    Scanner leer = new Scanner(System.in);
    public circunsferencia() {
    }

    public circunsferencia(int radio, int area) {
        this.radio = radio;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public circunsferencia crearCircunsferencia(){
        System.out.println("ingrese radio");
        radio =leer.nextInt();
        System.out.println(radio);
        
        return new circunsferencia();
    
    
    
}
 
    
    
    
   /* public circunsferencia calcularArea(){
    
    
    area = (3.1416*(radio*radio));
        System.out.println(radio);
        System.out.println("el area de la circunsferencia es "+area);
        
    return area1();
    }*/
}