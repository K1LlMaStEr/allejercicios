/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */


public class CuentaBancaria {
    
    
    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    private Scanner leer = new Scanner(System.in);
    
    

    public CuentaBancaria() {
    }
    
    
    

    public CuentaBancaria(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Por favor ingrese numero de cuenta");
        int numeroCuenta=leer.nextInt();
        System.out.println("Ahora ingrese DNI");
        long dni=leer.nextLong();
        System.out.println("Por Favor Ingrese Saldo Actual");
        int saldoActual=leer.nextInt();
        
        return new CuentaBancaria(numeroCuenta, dni, saldoActual);
        
        
        
       
    }
    public int ingreso(){
        
        
        Scanner leer=new Scanner(System.in);        
                
        System.out.println("cuanto dinero desea ingresar? ");
        int dineroIngreso=leer.nextInt();
        
        saldoActual= saldoActual+dineroIngreso;
        //dineroIngreso=dineroIngreso + saldoActual;
        return dineroIngreso;
    }
   
     public int retiro() {
         //double a= saldoActual;

        System.out.println("Cuanto dinero desea retirar");
        int salida = leer.nextInt();
        saldoActual= saldoActual-salida;

    
        
          
        
        
        return saldoActual;

     }

}
