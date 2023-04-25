
package adivinarnumero;

import java.util.Scanner;


public class AdivinarNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int intentos=0;
        int acertijo= (int)(Math.random()*500+1);
        System.out.println(acertijo);
        int numero=0;
     do{   
         System.out.println("ingrese un numero");
            numero=leer.nextInt();
        try {
            
            if (numero>acertijo){
                System.out.println("el numero es mayor");
                intentos ++;
            }
            if (numero<acertijo) {
                System.out.println("el numero es menor");
                intentos++;
            }
    
            
        } catch (Exception e) {
            System.out.println("no ingreso un numero ");
        }
         }while(numero!=acertijo);{
        System.out.println("acertaste!!!!!");
        
    }
        System.out.println("cantidad de intentos: "+(intentos+1));
    
    
    }
    
}
