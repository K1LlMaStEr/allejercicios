/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class servicioCurso {
    
    public String[] CargarAlumnos(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         String[] alumnos = new String[5];
     
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese nombre del estudiante"+ i+1+"");
            alumnos[i]=leer.next();
            
           }
     return alumnos;         
     /* private String nombreCurso;
    private int CantidadHoras;
    private int DiasSemanales;
    private boolean Turno;
    private float precioHora;
    private String[] alumnos;*/
}
    public Curso crearCurso() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre del curso");
        String nombreCurso =leer.nextLine();
        System.out.println("ingrese la cantidad de horas por dia a cursar");
        int CantidadHoras = leer.nextInt();
        System.out.println("especifique las horas por semana de cursado");
        int DiasSemanales = leer.nextInt();
        System.out.println("ingre turno mañana o tarde con T o M");
        String turno = leer.nextLine();
        if ("m".equals(turno)) {
            turno = "mañana";
        } else if ("t".equals(turno)) {
            turno = "tarde";
        } else {
            turno = "no especificado";
        }
        System.out.println("turno");
        System.out.println("ingrese el precio de cursado por hora");
        int precioHora = leer.nextInt();
        String alumnos[] = CargarAlumnos();
        return new Curso(nombreCurso, CantidadHoras, DiasSemanales, turno, precioHora, alumnos);
    }
    
   public int cuentaGanancias(int CantidadHoras, float precioHora, String alumnos, int DiasSemanales){
       
       System.out.println("las ganancias del alumno son" +(CantidadHoras*precioHora) );
       
          return new cuentaGanancias();
     }
}


    
 
            
    
    
        
        
        
        
    
    
    
    
    

