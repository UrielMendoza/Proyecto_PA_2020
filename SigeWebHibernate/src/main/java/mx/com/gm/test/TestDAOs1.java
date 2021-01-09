/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.test;

import java.util.*;
import mx.com.gm.dao.*;

/**
 *
 * @author jorge
 */
public class TestDAOs1 {
    public static void main(String[] args) {
        PersonaDAO alumnoDao=new PersonaDAO();
        System.out.println("Persona buena");
        imprimir(alumnoDao.listar());
        
//        System.out.println("Domicilios");
//        DomicilioDAO domicilioDao= new DomicilioDAO();
//        imprimir(domicilioDao.listar());
//        
//        System.out.println("Contactos");
//        ContactoDAO contactoDao= new ContactoDAO();
//        imprimir(contactoDao.listar());
//        
//        System.out.println("Cursos");
//        CursoDAO cursoDao= new CursoDAO();
//        imprimir(cursoDao.listar());
        
//        System.out.println("Asignaciones");
//        AsignacionDAO asignacionDao= new AsignacionDAO();
//        imprimir(asignacionDao.listar());
    }
    
    private static void imprimir(List coleccion){
    for(Object o: coleccion){
        System.out.println("Valor = " + o);
    }
    }
    
}
