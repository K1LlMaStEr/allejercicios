/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        int num;
        int numd;
        int numh;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese minutos");
        num = leer.nextInt();
        
         if (num>60) 
            num=  ( num/60 );
         System.out.println("dias "+(numd=num/24)+" horas "+ (num-(24*numd)) );
     /*    if (num>24)
             numd= (num/24);
             numh=  ( num-(24*numd) );
         System.out.println("horas" + num);*/
                     
         
            
        }
        
        
    }
    

