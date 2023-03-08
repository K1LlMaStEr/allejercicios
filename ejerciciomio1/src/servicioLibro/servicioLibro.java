/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioLibro;

import java.util.Scanner;
import libro.libro;

/**
 *
 * @author Alumno
 */
public class servicioLibro {
    public libro cargarLibro(){
        String usuario;
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese datos de usuario: ");
        usuario = leer.nextLine();
        System.out.println("ingrese ISBN del libro");
        int ISBN = leer.nextInt();
        System.out.println("ingrese Autor");
        String Autor = leer.next();
        System.out.println("ingrese Titulo");
        String Titulo = leer.next();
        System.out.println("ingrese cantidad de paginas");
        int paginas = leer.nextInt();
        System.out.println("el usuario: "+usuario+" ingreso el isbn "+ISBN+" con el nombre de autor: "+Autor+" el titulo del libro: "+Titulo+"con "+paginas+"paginas");
        return new libro();

        
    }
    
}
