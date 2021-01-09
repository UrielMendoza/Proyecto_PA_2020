/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.dao;

import javax.persistence.*;


/**
 *
 * @author jorge
 */
public abstract class GenericDAO {
    
    protected static EntityManager em;
    private static EntityManagerFactory emf;
    private static final String PU="HibernateJpaPU";

    public GenericDAO() {
        
        if(emf==null){
        emf=Persistence.createEntityManagerFactory(PU);
        }
    }
    
    protected EntityManager getEntityManager(){
    if(em==null){
    em=emf.createEntityManager();
    }
    return em;
    }
    
    
}
