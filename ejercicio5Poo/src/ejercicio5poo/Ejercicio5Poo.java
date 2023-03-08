/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5poo;

/**
 *
 * @author Alumno
 */
import Entidad.CuentaBancaria;
import java.util.Scanner;

public class Ejercicio5Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        CuentaBancaria cb1= new CuentaBancaria();
        
        cb1= cb1.crearCuenta();
        cb1.ingreso();
        System.out.println(cb1.getSaldoActual());
        
         cb1.retiro();
        
       System.out.println(cb1.getSaldoActual());
     }
}
    

