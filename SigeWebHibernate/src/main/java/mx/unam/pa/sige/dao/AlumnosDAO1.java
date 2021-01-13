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

public class AlumnosDAO1 extends GenericDAO {

    public List<Alumnos> listar() {
        String consulta = "SELECT a FROM Alumnos a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Alumnos alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void actualizar(Alumnos alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void eliminar(Alumnos alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Object buscarPorId(Alumnos alumno){
    em=getEntityManager();
    return em.find(Alumnos.class, alumno.getIdAlumno());
    }
}
