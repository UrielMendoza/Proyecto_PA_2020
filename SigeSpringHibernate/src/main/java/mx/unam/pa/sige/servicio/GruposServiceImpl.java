package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.dao.*;
import mx.unam.pa.sige.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GruposServiceImpl implements GruposService {

    @Autowired
    private GruposDAO gruposDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Grupos> listarGrupos() {
        return (List<Grupos>) gruposDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Grupos grupos) {
        gruposDao.save(grupos);
    }

    @Override
    @Transactional
    public void eliminar(Grupos grupos) {
        gruposDao.delete(grupos);
    }

    @Override
    @Transactional(readOnly = true)
    public Grupos encontrarGrupos(Grupos grupos) {
        return gruposDao.findById(grupos.getIdGrupos()).orElse(null);
    }
}
