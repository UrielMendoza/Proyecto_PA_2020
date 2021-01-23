package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.SalonesDAO;
import mx.unam.pa.sige.webapp.model.Salones;

@Service
@Transactional
public class SalonesServiceImpl implements SalonesService{
	@Autowired
	private SalonesDAO dao;
	
	@Override
	public List<Salones> listarSalones() {
		return dao.getAllSalones();
	}

	@Override
	public void guardar(Salones salon) {
		dao.save(salon);
	}
	
	@Override
	public void eliminar(Salones salon) {
		dao.delete(salon);
	}
	
	@Override
	public void editar(Salones salon) {
		dao.edit(salon);
	}
	
	@Override
	public Salones obtenerSalones(Integer idSalon) {
		return dao.getSalones(idSalon);
	}
}