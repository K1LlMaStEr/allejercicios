/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        int A=1;
        int B=2;
        int C=3;
        int D=4; 
        int aux=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("valor de A= "+ A + " valor de b= "+B+ " valor de c= "+C+" valor de D= "+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
         System.out.println("valor de A= "+ A + " valor de b= "+B+ " valor de c= "+C+" valor de D= "+D);
        
                
              
    }
    
}
