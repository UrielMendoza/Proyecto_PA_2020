/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.*;

/**
 *
 * @author jorge
 */
public class TestDAO {

    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");
        AlumnosDAO1 alumnoDao = new AlumnosDAO1();
        System.out.println("Alumnos");
        imprimir(alumnoDao.listar());

        ContactoDAO contactodao = new ContactoDAO();
        System.out.println("Contacto");
        imprimir(contactodao.listar());
    
        AlumnoMateriasDAO alumaterias =new AlumnoMateriasDAO();
        System.out.println("AlumnoMaterias");
        imprimir(alumaterias.listar());
    }
    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println("Valor = " + o);
        }
    }
}
