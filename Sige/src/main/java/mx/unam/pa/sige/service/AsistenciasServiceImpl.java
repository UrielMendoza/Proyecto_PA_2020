package mx.unam.pa.sige.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.dao.AsistenciasDAO;
import mx.unam.pa.sige.model.Asistencias;

@Service
@Transactional
public class AsistenciasServiceImpl implements AsistenciasService{
	
	@Autowired
	private AsistenciasDAO dao;
	
	@Override
	public List<Asistencias> listarAsistencias() {
		return dao.getAllAsistencias();
	}

	@Override
	public void guardar(Asistencias asistencia) {
		dao.save(asistencia);
	}
}
