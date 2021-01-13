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

public class AlumnoMateriasDAO extends GenericDAO {

    public List<AlumnoMaterias> listar() {
        String consulta = "SELECT a FROM AlumnoMaterias a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(AlumnoMaterias alumnoMaterias) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumnoMaterias);
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
    
    public void actualizar(AlumnoMaterias alumno) {
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
    
    public void eliminar(AlumnoMaterias alumno) {
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
    
    public AlumnoMaterias buscarPorId(AlumnoMaterias alumno){
    em=getEntityManager();
    return em.find(AlumnoMaterias.class, alumno.getIdAlumnoMaterias());
    }
}

