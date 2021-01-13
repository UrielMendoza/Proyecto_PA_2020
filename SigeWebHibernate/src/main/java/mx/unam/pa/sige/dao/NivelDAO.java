/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.pa.sige.dao;

/**
 *
 * @author jorge
 */
 
import java.util.*;
import javax.persistence.*;

import mx.unam.pa.sige.domain.*;

public class NivelDAO extends GenericDAO {

    public List<Nivel> listar() {
        String consulta = "SELECT a FROM Nivel a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Nivel nivel) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(nivel);
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
    
    public void actualizar(Nivel nivel) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(nivel);
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
    
    public void eliminar(Nivel nivel) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(nivel));
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
    
    public Nivel buscarPorId(Nivel nivel){
    em=getEntityManager();
    return em.find(Nivel.class, nivel.getIdNivel());
    }
}

