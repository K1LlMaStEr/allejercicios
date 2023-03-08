/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class alumno {
    private String Alumno;
    private ArrayList<Integer> notas;

    public alumno() {
    }

    public alumno(String Alumno, ArrayList<Integer> notas) {
        this.Alumno = Alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "alumno{" + "Alumno=" + Alumno + ", notas=" + notas + '}';
    }
    
    
}
