/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioLibro;

import entidad.entidadLibro;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class servicioLibro {

    public entidadLibro cargarLibro() {
        String usuario;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese datos de usuario: ");
        usuario = leer.nextLine();
        System.out.println("ingrese ISBN del libro");
        int ISBN = leer.nextInt();
        System.out.println("ingrese Autor");
        String Autor = leer.nextLine();
        System.out.println("ingrese Titulo");
        String Titulo = leer.nextLine();
        System.out.println("ingrese cantidad de paginas");
        int paginas = leer.nextInt();

        System.out.println("Usuario: " + usuario + "numero de ISBN:" + ISBN + " titulo:" + Titulo + " Autor" + Autor + "Cantidad de paginas" + paginas);
                 return new entidadLibro();
    }

}
