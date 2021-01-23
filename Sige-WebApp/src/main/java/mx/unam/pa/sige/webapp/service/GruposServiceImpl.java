package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.GruposDAO;
import mx.unam.pa.sige.webapp.model.Grupos;

@Service
@Transactional
public class GruposServiceImpl implements GruposService{
	@Autowired
	private GruposDAO dao;
	
	@Override
	public List<Grupos> listarGrupos() {
		return dao.getAllGrupos();
	}

	@Override
	public void guardar(Grupos grupo) {
		dao.save(grupo);
	}
	
	@Override
	public void eliminar(Grupos grupo) {
		dao.delete(grupo);
	}
	
	@Override
	public void editar(Grupos grupo) {
		dao.edit(grupo);
	}
	
	@Override
	public Grupos obtenerGrupos(Integer idGrupo) {
		return dao.getGrupos(idGrupo);
	}
}