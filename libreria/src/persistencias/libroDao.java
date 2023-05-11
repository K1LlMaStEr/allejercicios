/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;

import entidades.Autor;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import servicios.serviciosAutor;

/**
 *
 * @author gonza
 */
public class libroDao {
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("ejercicio1PU");
     private EntityManager em = EMF.createEntityManager();
     Scanner leer = new Scanner(System.in);
    
      public void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }
      public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
      
      public void guardar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        desconectar();
    } 
       public void eliminar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        desconectar();
       }
        public void editar(Libro libro) {
        conectar();
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libro = em.createQuery("SELECT a FROM Libro a ").getResultList();
        desconectar();
        return libro;
    }

    public List<Libro> buscarPorAutor() throws Exception {
        serviciosAutor sa=new serviciosAutor();
        
        conectar();
        System.out.println(sa.listaAutores().toString().replace(",", "\n"));
        System.out.println("ingrese numero de autor");
        int aux=leer.nextInt();
        List<Libro> libro = (List<Libro>) em.createQuery("SELECT a FROM Libro a WHERE a.autor.id LIKE :autor").setParameter("autor", aux).getResultList();
        System.out.println(libro.toString());
        desconectar();
        return libro;
    }
        public Libro buscarPorIsbn1() throws Exception {            
        conectar();
        System.out.println("ingrese isbn del libro a buscar del dao");
        int aux=leer.nextInt();
        Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.isbn LIKE :aut").setParameter("aut", aux).getSingleResult();
        
        desconectar();
        return libro;
    }
    
}
