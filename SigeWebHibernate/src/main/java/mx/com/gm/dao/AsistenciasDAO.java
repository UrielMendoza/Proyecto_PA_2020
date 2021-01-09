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

public class AsistenciasDAO extends GenericDAO {

    public List<Asistencias> listar() {
        String consulta = "SELECT a FROM Asistencias a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Asistencias asistencia) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(asistencia);
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
    
    public void actualizar(Asistencias alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
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
    
    public void eliminar(Asistencias alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
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
    
    public Asistencias buscarPorId(Asistencias alumno){
    em=getEntityManager();
    return em.find(Asistencias.class, alumno.getIdAsistencias());
    }
}

