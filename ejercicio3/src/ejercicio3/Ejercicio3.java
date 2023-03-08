/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import servicioAlumno.servicioAlumno;

/**
 *
 * @author gonza
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicioAlumno sa=new servicioAlumno();
        ArrayList<Alumno> nombre = new ArrayList();
        sa.imprimirAlumnos(listaA);
        sa.buscarAlumno(listaA);
        
        // TODO code application logic here
    }
    
}
