/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;

import entidades.Autor;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 *
 * @author gonza
 */
public class autorDao {
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("ejercicio1PU");
     private EntityManager em = EMF.createEntityManager();
    
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
      
      public void guardar(Autor autor) {
        conectar();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        desconectar();
    } 
       public void eliminar(Autor autor) {
        conectar();
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
        desconectar();
       }
        public void editar(Autor autor) {
        conectar();
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autor = em.createQuery("SELECT a FROM Autor a ").getResultList();
        desconectar();
        return autor;
    }


    public Autor buscarPorID(int id) throws Exception {
        conectar();
        System.out.println("antes de ");
        int codigo= id;
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :codigo  ").setParameter("codigo", codigo).getSingleResult();
        System.out.println("despues"); 
        
        desconectar();
        return autor;
    }
}


