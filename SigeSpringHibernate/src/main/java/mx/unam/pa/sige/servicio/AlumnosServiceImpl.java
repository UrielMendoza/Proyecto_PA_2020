package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnosServiceImpl implements AlumnosService {

    @Autowired
    private AlumnosDAO alumnosdao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Alumnos> listarAlumnos() {
        return (List<Alumnos>) alumnosdao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Alumnos alumnos) {
        alumnosdao.save(alumnos);
    }

    @Override
    @Transactional
    public void eliminar(Alumnos alumnos) {
        alumnosdao.delete(alumnos);
    }

    @Override
    @Transactional(readOnly = true)
    public Alumnos encontrarAlumnos(Alumnos alumnos) {
        return alumnosdao.findById(alumnos.getIdAlumno()).orElse(null);
    }
}
