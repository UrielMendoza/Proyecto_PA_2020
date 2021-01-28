package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.MateriasHorariosDAO;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;

@Service
@Transactional
public class MateriasHorariosServiceImpl implements MateriasHorariosService{
	@Autowired
	private MateriasHorariosDAO dao;
	
	@Override
	public List<MateriasHorarios> listarMateriasHorarios() {
		return dao.getAllMateriasHorarios();
	}
	
	@Override
	public List<MateriasHorarios> listarMateriasHorariosByGrado(Integer grado){
		return dao.getAllMateriasHorariosByGrado(grado);
	};

	@Override
	public void guardar(MateriasHorarios materiasHorarios) {
		dao.save(materiasHorarios);
	}
	
	@Override
	public void eliminar(MateriasHorarios materiasHorarios) {
		dao.delete(materiasHorarios);
	}
	
	@Override
	public void editar(MateriasHorarios materiasHorarios) {
		dao.edit(materiasHorarios);
	}
	
	@Override
	public MateriasHorarios obtenerMateriasHorarios(Integer idMateriasHorarios) {
		return dao.getMateriasHorarios(idMateriasHorarios);
	}
}