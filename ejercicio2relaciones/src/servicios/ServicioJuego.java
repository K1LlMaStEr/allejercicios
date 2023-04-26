/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pistola;
import entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class ServicioJuego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Pistola mojar;
    Pistola cuetazo;

    public boolean mojar(boolean mojar, boolean cuetazo) {
        boolean siono = false;
        if (mojar == cuetazo) {
            siono = true;

        }

        return siono;
    }

    public Jugador cargarPersona() {

        Scanner leer = new Scanner(System.in);
        Jugador p1 = new Jugador();

        System.out.println("ingrese nombre");
        String nombre = leer.next();
        System.out.println("ingrese id");
        int id = leer.nextInt();
        System.out.println("ingrese el estado de humedad mojado o seco");
        boolean mojau = leer.hasNext();

        return new Jugador(nombre, id, mojau);
    }

    public void cargarPistola(Pistola Pistola, Jugador Jugador) {

        Pistola.setMojar((int) (Math.random() * 6 + 1));
        Pistola.setCuetazo((int) (Math.random() * 6 + 1));

    }

    public Boolean mojado(Pistola Pistola, Jugador Jugador) {
        boolean mojado = false;
        if (Pistola.getMojar() == Pistola.getCuetazo()) {
            mojado = true;

        } else {
            mojado= false;
        }

        return mojado;
    }

    public void siguienteChorro(Pistola Pistola) {
        int valor = Pistola.getCuetazo();
        Pistola.setCuetazo(valor + 1);
        System.out.println(Pistola.getCuetazo());
    }

    public void info(Jugador Jugadores) {
        System.out.println(Jugadores.toString());
    }
}
