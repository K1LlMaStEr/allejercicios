/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gonza
 */
public class chumboDeAgua {
    private Boolean mojar ;
    private Boolean cuetazo;
    private jugador nombre;
    private jugador id;
    private jugador mojau;

    public chumboDeAgua() {
    }

    public chumboDeAgua(Boolean mojar, Boolean cuetazo, jugador nombre, jugador id, jugador mojau) {
        this.mojar = mojar;
        this.cuetazo = cuetazo;
        this.nombre = nombre;
        this.id = id;
        this.mojau = mojau;
    }

    public Boolean getMojar() {
        return mojar;
    }

    public void setMojar(Boolean mojar) {
        this.mojar = mojar;
    }

    public Boolean getCuetazo() {
        return cuetazo;
    }

    public void setCuetazo(Boolean cuetazo) {
        this.cuetazo = cuetazo;
    }

    public jugador getNombre() {
        return nombre;
    }

    public void setNombre(jugador nombre) {
        this.nombre = nombre;
    }

    public jugador getId() {
        return id;
    }

    public void setId(jugador id) {
        this.id = id;
    }

    public jugador getMojau() {
        return mojau;
    }

    public void setMojau(jugador mojau) {
        this.mojau = mojau;
    }

    @Override
    public String toString() {
        return "chumboDeAgua{" + "mojar=" + mojar + ", cuetazo=" + cuetazo + ", nombre=" + nombre + ", id=" + id + ", mojau=" + mojau + '}';
    }

   
    
    
   
        
   
}
