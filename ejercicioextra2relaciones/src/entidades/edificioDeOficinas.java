/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public final class edificioDeOficinas extends Edificio implements interfaces.intefazpersonas{
    private int numDeOfi;
    private int cantPerOfi;
    private int numPisos;
    private int cantPersonas1;

    public edificioDeOficinas() {
    }

    

    public edificioDeOficinas(int numDeOfi, int cantPerOfi, int numPisos, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.numDeOfi = numDeOfi;
        this.cantPerOfi = cantPerOfi;
        this.numPisos = numPisos;
    }

    public edificioDeOficinas(int cantPersonas1) {
        this.cantPersonas1 = cantPersonas1;
    }

    public int getCantPersonas1() {
        return cantPersonas1;
    }

    public void setCantPersonas1(int cantPersonas1) {
        this.cantPersonas1 = cantPersonas1;
    }

    
    

    public int getNumDeOfi() {
        return numDeOfi;
    }

    public void setNumDeOfi(int numDeOfi) {
        this.numDeOfi = numDeOfi;
    }

    public int getCantPerOfi() {
        return cantPerOfi;
    }

    public void setCantPerOfi(int cantPerOfi) {
        this.cantPerOfi = cantPerOfi;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
   

    @Override
    public String toString() {
        return "EdificioDeOficinas{"+ "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + "numDeOfi=" + numDeOfi + ", cantPerOfi=" + cantPerOfi + ", numPisos=" + numPisos + '}';
    }

    @Override
    public double calcularSuperficie() {
        return super.calcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularVolumen() {
        return super.calcularVolumen(); //To change body of generated methods, choose Tools | Templates.
    }
   
    

     public void cantPersonas(){
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese numero de oficinas");
         numDeOfi=leer.nextInt();
    
         System.out.println("ingrese cantidad de personas por oficina");
         cantPerOfi=leer.nextInt();
         System.out.println("ingrese numero de pisos del edificio");
         numPisos=leer.nextInt();
         int p1= 0;
         p1=numDeOfi*cantPerOfi*numPisos;
         cantPersonas1=p1; 
         System.out.println(p1);
         p1=cantPersonas1;
     } 

    @Override
    public int cantpersonas() {
        
       return numDeOfi*cantPerOfi*numPisos;
        
    }
      
     
    
    
}
