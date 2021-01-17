package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalonesServiceImpl implements SalonesService {

    @Autowired
    private SalonesDAO salonesDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Salones> listarSaloness() {
        return (List<Salones>) salonesDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Salones salones) {
        salonesDao.save(salones);
    }

    @Override
    @Transactional
    public void eliminar(Salones salones) {
        salonesDao.delete(salones);
    }

    @Override
    @Transactional(readOnly = true)
    public Salones encontrarSalones(Salones salones) {
        return salonesDao.findById(salones.getIdSalon()).orElse(null);
    }
}
