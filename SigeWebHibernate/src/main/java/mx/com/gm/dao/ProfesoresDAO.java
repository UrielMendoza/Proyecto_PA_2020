/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.dao;

/**
 *
 * @author jorge
 */
 
import java.util.*;
import javax.persistence.*;
import mx.com.gm.domain.*;

public class ProfesoresDAO extends GenericDAO {

    public List<Profesores> listar() {
        String consulta = "SELECT a FROM Profesores a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Profesores profesores) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(profesores);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public void actualizar(Profesores profesores) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(profesores);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public void eliminar(Profesores profesores) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(profesores));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public Profesores buscarPorId(Profesores profesores){
    em=getEntityManager();
    return em.find(Profesores.class, profesores.getIdProf());
    }
}

