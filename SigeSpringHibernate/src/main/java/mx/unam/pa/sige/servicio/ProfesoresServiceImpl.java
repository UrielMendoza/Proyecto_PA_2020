package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfesoresServiceImpl implements ProfesoresService {

    @Autowired
    private ProfesoresDAO profesoresaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Profesores> listarProfesores() {
        return (List<Profesores>) profesoresaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Profesores profesoresa) {
        profesoresaDao.save(profesoresa);
    }

    @Override
    @Transactional
    public void eliminar(Profesores profesoresa) {
        profesoresaDao.delete(profesoresa);
    }

    @Override
    @Transactional(readOnly = true)
    public Profesores encontrarProfesores(Profesores profesoresa) {
        return profesoresaDao.findById(profesoresa.getIdProf()).orElse(null);
    }
}
