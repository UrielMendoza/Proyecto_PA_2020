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

public class MateriasGrupoDAO extends GenericDAO {

    public List<MateriasGrupo> listar() {
        String consulta = "SELECT a FROM MateriasGrupo a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(MateriasGrupo materiasGrupo) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(materiasGrupo);
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
    
    public void actualizar(MateriasGrupo materiasGrupo) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(materiasGrupo);
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
    
    public void eliminar(MateriasGrupo materiasGrupo) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(materiasGrupo));
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
    
    public MateriasGrupo buscarPorId(MateriasGrupo materiasGrupo){
    em=getEntityManager();
    return em.find(MateriasGrupo.class, materiasGrupo.getIdMateriaGrupo());
    }
}

