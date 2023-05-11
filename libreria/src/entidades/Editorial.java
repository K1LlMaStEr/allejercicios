
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="editoriales")
public class Editorial implements Serializable {
       @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_editorial")
            private int id;
       @Column(name="nombre")
            private String nombre;
       @Column(name="status_editorial")
            private Boolean alta;

    public Editorial() {
        this.alta=true;
    }

    public Editorial(int id, String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
    }
            
            
    
    
}
