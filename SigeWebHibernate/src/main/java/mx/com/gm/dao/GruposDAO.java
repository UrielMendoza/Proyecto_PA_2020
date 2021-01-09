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

public class GruposDAO extends GenericDAO {

    public List<Grupos> listar() {
        String consulta = "SELECT a FROM Grupos a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Grupos grupo) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(grupo);
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
    
    public void actualizar(Grupos grupo) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(grupo);
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
    
    public void eliminar(Grupos grupo) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(grupo));
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
    
    public Grupos buscarPorId(Grupos grupo){
    em=getEntityManager();
    return em.find(Grupos.class, grupo.getIdGrupo());
    }
}

