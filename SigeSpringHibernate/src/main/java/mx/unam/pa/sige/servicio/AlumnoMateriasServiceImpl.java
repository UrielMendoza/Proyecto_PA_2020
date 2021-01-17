package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnoMateriasServiceImpl implements AlumnoMateriasService {

    @Autowired
    private AlumnoMateriasDAO alumnoMateriasDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<AlumnoMaterias> listarAlumnoMaterias() {
        return (List<AlumnoMaterias>) alumnoMateriasDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(AlumnoMaterias alumnoMaterias) {
        alumnoMateriasDao.save(alumnoMaterias);
    }

    @Override
    @Transactional
    public void eliminar(AlumnoMaterias alumnoMaterias) {
        alumnoMateriasDao.delete(alumnoMaterias);
    }

    @Override
    @Transactional(readOnly = true)
    public AlumnoMaterias encontrarAlumnoMaterias(AlumnoMaterias alumnoMaterias) {
        return alumnoMateriasDao.findById(alumnoMaterias.getIdAlumnoMaterias()).orElse(null);
    }
}
