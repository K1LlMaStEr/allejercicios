/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Alumno
 */
public class libro {
      public int ISBN;
        public String Titulo;
        public String Autor;
        public int Pagina;

    public libro() {
    }

    public libro(int ISBN, String Titulo, String Autor, int Pagina) {
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
