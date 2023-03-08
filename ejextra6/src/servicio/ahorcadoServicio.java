
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Ahorcado;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class ahorcadoServicio {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        System.out.print("Ingrese una palabra: ");
        String palabra = leer.next();
       
        System.out.print("Ingrese la Cantidad de Jugadas Máxima: ");
        int cantidadJugadasMax=leer.nextInt();
        int longitudVector=palabra.length();
        char[] palabraBuscar= new char[longitudVector];
        for(int i=0;i<longitudVector;i++){
            palabraBuscar[i]=palabra.charAt(i);
        }
        
        return new Ahorcado(palabraBuscar,0,cantidadJugadasMax);
    }
    
    public void juego(Ahorcado juego){
        boolean bandera_aux=false;
        boolean encontrados[];
        System.out.println("arranquemos");
        do{ 
            System.out.println("ingrese una letra");
            char aux=leer.next().charAt(0);
            System.out.println("mensaje:");
            bandera_aux=juego.buscar(aux);
            encontrados=juego.encontradas(aux);
            juego.intentos();
        }while(juego.getcantidadJugadasMax()>0) || (juego.getLetrasEncontradas==()){
        if(juego.getLetrasEncontradas()==juego.getPalabraBuscar().length){
        System.out.println("encontraste la palabra");
        }else{
                System.out.println("los sentimos. te quedaste sin intentos");
                System.out.println("game over");
                
        
        }
        
    }
    
}
