/*
ISBN, Título, Autor,
Número de páginas,
 */
package entidad;

/**
 *
 * @author Alumno
 */
public class entidadLibro {
        private int ISBN;
        private String Titulo;
        private String Autor;
        private int Pagina;

    public entidadLibro() {
    }

    public entidadLibro(int ISBN, String Titulo, String Autor, int Pagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Pagina = Pagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPagina() {
        return Pagina;
    }

    public void setPagina(int Pagina) {
        this.Pagina = Pagina;
    }

        
        
    
}

