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

public class MateriasDAO extends GenericDAO {

    public List<Materias> listar() {
        String consulta = "SELECT a FROM Materias a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Materias materias) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(materias);
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
    
    public void actualizar(Materias materias) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(materias);
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
    
    public void eliminar(Materias materias) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(materias));
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
    
    public Materias buscarPorId(Materias materias){
    em=getEntityManager();
    return em.find(Materias.class, materias.getIdMateria());
    }
}

