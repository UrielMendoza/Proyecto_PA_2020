package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MateriasHorariosServiceImpl implements MateriasHorariosService {

    @Autowired
    private MateriasHorariosDAO materiasHorariosDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<MateriasHorarios> listarMateriasHorarios() {
        return (List<MateriasHorarios>) materiasHorariosDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(MateriasHorarios materiasHorarios) {
        materiasHorariosDao.save(materiasHorarios);
    }

    @Override
    @Transactional
    public void eliminar(MateriasHorarios materiasHorarios) {
        materiasHorariosDao.delete(materiasHorarios);
    }

    @Override
    @Transactional(readOnly = true)
    public MateriasHorarios encontrarMateriasHorarios(MateriasHorarios materiasHorarios) {
        return materiasHorariosDao.findById(materiasHorarios.getIdMateriasHorarios()).orElse(null);
    }
}
