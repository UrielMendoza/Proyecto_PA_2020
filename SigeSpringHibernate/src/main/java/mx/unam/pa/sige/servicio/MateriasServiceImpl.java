package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MateriasServiceImpl implements MateriasService {

    @Autowired
    private MateriasDAO materiasDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Materias> listarMaterias() {
        return (List<Materias>) materiasDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Materias materias) {
        materiasDao.save(materias);
    }

    @Override
    @Transactional
    public void eliminar(Materias materias) {
        materiasDao.delete(materias);
    }

    @Override
    @Transactional(readOnly = true)
    public Materias encontrarMaterias(Materias materias) {
        return materiasDao.findById(materias.getIdMateria()).orElse(null);
    }
}
