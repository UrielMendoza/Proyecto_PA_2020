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

public class MateriasHorariosDAO extends GenericDAO {

    public List<MateriasHorarios> listar() {
        String consulta = "SELECT a FROM MateriasHorarios a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(MateriasHorarios materiasHorarios) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(materiasHorarios);
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
    
    public void actualizar(MateriasHorarios materiasHorarios) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(materiasHorarios);
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
    
    public void eliminar(MateriasHorarios materiasHorarios) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(materiasHorarios));
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
    
    public MateriasHorarios buscarPorId(MateriasHorarios materiasHorarios){
    em=getEntityManager();
    return em.find(MateriasHorarios.class, materiasHorarios.getIdMateriasHorarios());
    }
}

