package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AsistenciasServiceImpl implements AsistenciasService {

    @Autowired
    private AsistenciasDAO asistenciasDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Asistencias> listarAsistencias() {
        return (List<Asistencias>) asistenciasDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Asistencias asistencias) {
        asistenciasDao.save(asistencias);
    }

    @Override
    @Transactional
    public void eliminar(Asistencias asistencias) {
        asistenciasDao.delete(asistencias);
    }

    @Override
    @Transactional(readOnly = true)
    public Asistencias encontrarAsistencias(Asistencias asistencias) {
        return asistenciasDao.findById(asistencias.getIdAsistencias()).orElse(null);
    }
}
