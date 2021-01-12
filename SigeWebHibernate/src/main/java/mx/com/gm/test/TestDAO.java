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
//        
//        GruposDAO gruposDao = new GruposDAO();
//        System.out.println("Grupos");
//        imprimir(gruposDao.listar());
//        
//        MateriasDAO MateriasDao = new MateriasDAO();
//        System.out.println("Materias");
//        imprimir(MateriasDao.listar());
        
//        NivelDAO NivelDao = new NivelDAO();
//        System.out.println("Nivel");
//        imprimir(NivelDao.listar());
//        
//        ProfesoresDAO ProfesoresDao = new ProfesoresDAO();
//        System.out.println("Profesores");
//        imprimir(ProfesoresDao.listar());
//        
//        SalonesDAO SalonesDao = new SalonesDAO();
//        System.out.println("Salones");
//        imprimir(SalonesDao.listar());
//        
//        AsistenciasDAO AsistenciasDao = new AsistenciasDAO();
//        System.out.println("Asistencias");
//        imprimir(AsistenciasDao.listar());
//        
//        MateriasHorariosDAO MateriasHorariosDao = new MateriasHorariosDAO();
//        System.out.println("MateriasHorarios");
//        imprimir(MateriasHorariosDao.listar());
        
//        AlumnoMateriasDAO AlumnoMateriasDao = new AlumnoMateriasDAO();
//        System.out.println("AlumnoMaterias");
//        imprimir(AlumnoMateriasDao.listar());
        
    }
    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println("Valor = " + o);
        }
    }
}
