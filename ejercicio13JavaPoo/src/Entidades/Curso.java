/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Alumno
 */
public class Curso {
    private String nombreCurso;
    private int CantidadHoras;
    private int DiasSemanales;
    private boolean Turno;
    private int precioHora;
    private String[] alumnos;
    

    public Curso() {
    }

    public Curso(String nombreCurso, int CantidadHoras, int DiasSemanales, boolean Turno, int PrecioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.CantidadHoras = CantidadHoras;
        this.DiasSemanales = DiasSemanales;
        this.Turno = Turno;
        this.precioHora = PrecioHora;
        this.alumnos = new String[5];
    }

  

  
    

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHoras() {
        return CantidadHoras;
    }

    public void setCantidadHoras(int CantidadHoras) {
        this.CantidadHoras = CantidadHoras;
    }

    public int getDiasSemanales() {
        return DiasSemanales;
    }

    public void setDiasSemanales(int DiasSemanales) {
        this.DiasSemanales = DiasSemanales;
    }

    public boolean isTurno() {
        return Turno;
    }

    public void setTurno(boolean Turno) {
        this.Turno = Turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int PrecioHora) {
        this.precioHora = PrecioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }


    
    
    
    
}
