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

public class ContactoDAO extends GenericDAO {

    public List<Contacto> listar() {
        String consulta = "SELECT a FROM Contacto a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacto);
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
    
    public void actualizar(Contacto alumno) {
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
    
    public void eliminar(Contacto alumno) {
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
    
    public Contacto buscarPorId(Contacto alumno){
    em=getEntityManager();
    return em.find(Contacto.class, alumno.getIdContacto());
    }
}

