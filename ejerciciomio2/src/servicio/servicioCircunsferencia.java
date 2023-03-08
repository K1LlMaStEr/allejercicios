/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import circunsferencia.circunsferencia;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class servicioCircunsferencia {
    Scanner leer = new Scanner(System.in);
    public circunsferencia crearCircunsferencia(){
        System.out.println("ingrese radio");
        int radio =leer.nextInt();
        
        return new circunsferencia();
        
        
    }
   /* public int calcularArea(){
    int radio=0;
    double area=0;
    area = (3.1416*(radio*radio));    
    return  new area();
}*/
}
