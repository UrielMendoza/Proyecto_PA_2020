package mx.unam.pa.sige.dao;

import mx.unam.pa.sige.domain.*;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Integer>{
    
}
