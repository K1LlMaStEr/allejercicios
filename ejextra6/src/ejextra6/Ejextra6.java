/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra6;
import ejercicio_extra_6.Entidades.Ahorcado;
import ejercicio_extra_6.Servicios.ahorcadoServicios;
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class Ejextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Juego Ahorcado");
        ahorcadoServicios aS = new ahorcadoServicios();
        
        Ahorcado j1 = aS.crearJuego();
        
        System.out.print("Ingrese una letra: ");
        
        char aux = leer.next().charAt(0);
        j1.buscar(aux);
        j1.encontradas(aux);
        
        System.out.println("j1.toString()");
        // TODO code application logic here
    }
    
}
