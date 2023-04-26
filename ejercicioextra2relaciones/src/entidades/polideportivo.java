
package entidades;

import java.util.Scanner;


public class polideportivo extends Edificio {

private String nombre;
private boolean techada;

public polideportivo() {
    }
    public polideportivo(String nombre, boolean techada, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.techada = techada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechada() {
        return techada;
    }

    public void setTechada(boolean techada) {
        this.techada = techada;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo +  "nombre=" + nombre + ", techada=" + techada + '}';
    }
    
/*public void crearPoli(){
    Scanner leer = new Scanner(System.in);
    
    System.out.println("ingrese nombre del edificio");
    nombre=leer.next();
    System.out.println("ingrese si es techado o no con true o false");
    techada=leer.hasNextBoolean();
    System.out.println(nombre+" "+techada);
    
}*/

}
