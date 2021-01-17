package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NivelServiceImpl implements NivelService {

    @Autowired
    private NivelDAO nivelDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Nivel> listarNiveles() {
        return (List<Nivel>) nivelDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Nivel nivel) {
        nivelDao.save(nivel);
    }

    @Override
    @Transactional
    public void eliminar(Nivel nivel) {
        nivelDao.delete(nivel);
    }

    @Override
    @Transactional(readOnly = true)
    public Nivel encontrarNiveles(Nivel nivel) {
        return nivelDao.findById(nivel.getIdNivel()).orElse(null);
    }
}
