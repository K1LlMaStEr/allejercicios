/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13javapoo;
import Servicios.servicioCurso;
import java.util.Arrays;
import java.util.Scanner;
import Entidades.Curso;

/**
 *
 * @author Alumno
 */
public class Ejercicio13JavaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        servicioCurso sp=new servicioCurso();
        Curso cur=sp.crearCurso();
        int g=sp.cuentaGanancias(cur.getCantidadHoras(), cur.getPrecioHora(), 5, cur.getDiasSemanales());
        System.out.println("el curso"+cur.getNombreCurso()+ "con los alumnos" + Array.toString(cur.getAlumnos()));
        
    }
    
}
