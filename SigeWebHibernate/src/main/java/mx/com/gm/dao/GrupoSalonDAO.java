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

public class GrupoSalonDAO extends GenericDAO {

    public List<GrupoSalon> listar() {
        String consulta = "SELECT a FROM GrupoSalon a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(GrupoSalon grupoSalon) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(grupoSalon);
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
    
    public void actualizar(GrupoSalon alumno) {
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
    
    public void eliminar(GrupoSalon alumno) {
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
    
    public GrupoSalon buscarPorId(GrupoSalon alumno){
    em=getEntityManager();
    return em.find(GrupoSalon.class, alumno.getIdGrupoSalon());
    }
}

