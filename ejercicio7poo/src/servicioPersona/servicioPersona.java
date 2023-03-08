/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioPersona;

import java.util.Scanner;
import persona.persona;

/**
 *
 * @author Alumno
 */
public class servicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public persona crearPersona() {
        boolean bandera = false;
        

        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese su sexo: ");
        String sexo = leer.next();
        if ("M".equals(sexo) || "F".equals(sexo))
        {
            bandera = true;
        }
        while (bandera)
        {
            System.out.println("Opción erronea, intente nuevamente");
            sexo = leer.next();
            if ("M".equals(sexo) || "F".equals(sexo))
            {
                bandera = true;
            }
        }
        System.out.println("Ingrese su peso: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura: ");
        double altura = leer.nextDouble();
         return new persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularImc(double peso, double altura) {
        double formula;
        int imc = 0;
        formula = peso / (Math.pow(altura, 2));
        System.out.println("CALCULANDO IMC");
        if (formula < 20) {
            imc = -1;
            

        } else if (formula > 20 & formula < 25)
        {
            imc = 0;

        } else if (formula > 25)
        {

            imc = 1;

        }

        return imc;
    }
    
    
    public boolean esMayorDeEdad(int edad){
        boolean rangoEdad = false;
        if (edad >= 18){
            rangoEdad = true;
        }
        
        return rangoEdad;
    
    }

    
}
