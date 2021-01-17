/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.pa.sige.dao;

import mx.unam.pa.sige.domain.*;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jorge
 */
public interface AlumnoMateriasDAO extends CrudRepository<AlumnoMaterias, Integer>{
    
}
