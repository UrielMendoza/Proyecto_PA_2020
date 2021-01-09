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

public class ProfesoresMateriasDAO extends GenericDAO {

    public List<ProfesoresMaterias> listar() {
        String consulta = "SELECT a FROM ProfesoresMaterias a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(ProfesoresMaterias profesoresMaterias) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(profesoresMaterias);
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
    
    public void actualizar(ProfesoresMaterias profesoresMaterias) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(profesoresMaterias);
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
    
    public void eliminar(ProfesoresMaterias profesoresMaterias) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(profesoresMaterias));
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
    
    public ProfesoresMaterias buscarPorId(ProfesoresMaterias profesoresMaterias){
    em=getEntityManager();
    return em.find(ProfesoresMaterias.class, profesoresMaterias.getIdProfesoresMaterias());
    }
}

