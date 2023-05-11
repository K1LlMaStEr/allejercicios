/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;

import entidades.Autor;
import entidades.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gonza
 */
public class editorialDao {
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
      
      public void guardar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        desconectar();
    } 
       public void eliminar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
        desconectar();
       }
        public void editar(Editorial editorial) {
        conectar();
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        desconectar();
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editorial = em.createQuery("SELECT m FROM Editorial m ").getResultList();
        desconectar();
        return editorial;
    }

    public Editorial buscarPorID(int ID) throws Exception {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT m FROM Editorial m WHERE m.id LIKE :ID").setParameter("ID", ID).getSingleResult();
        desconectar();
        
        return editorial;
    }
    
}
