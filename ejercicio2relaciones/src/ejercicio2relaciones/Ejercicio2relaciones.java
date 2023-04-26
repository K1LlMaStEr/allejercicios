/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2relaciones;

import entidades.Pistola;
import entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioJuego;

/**
 *
 * @author gonza
 */
public class Ejercicio2relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pistola chum =new Pistola();
        
        ServicioJuego sj=new ServicioJuego();
        ArrayList<Jugador> Jugadores = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String op;
         int opcion;

        
        do {
            System.out.println("Empezemos el juego");
            System.out.println("menu :");
            System.out.println("1-cargar jugadores");
            System.out.println("2-cargar pistola");
            System.out.println("3-disparar");
            System.out.println("4-mostrar el mojado");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    do {
                         Jugadores.add(sj.cargarPersona());
                        System.out.println("desea cargar otra persona?");
                        op = leer.next();
                    } while (op.equalsIgnoreCase("s"));
                    System.out.println(Jugadores);

                    break;
                case 2:
                    sj.cargarPistola(chum, sj.cargarPersona());
        System.out.println(sj.cargarPersona());
                    break;
                case 3:
                    sj.mojar(true, true);
                    System.out.println(sj.mojado(chum, sj.cargarPersona()));
                    break;
                   
            }
                
        }while (opcion != 5);
        
           
       
        
        }
        
        
        
        
    }
    
