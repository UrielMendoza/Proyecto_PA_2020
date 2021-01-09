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

public class SalonesDAO extends GenericDAO {

    public List<Salones> listar() {
        String consulta = "SELECT a FROM Salones a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Salones salones) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(salones);
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
    
    public void actualizar(Salones salones) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(salones);
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
    
    public void eliminar(Salones salones) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(salones));
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
    
    public Salones buscarPorId(Salones salones){
    em=getEntityManager();
    return em.find(Salones.class, salones.getIdSalon());
    }
}

