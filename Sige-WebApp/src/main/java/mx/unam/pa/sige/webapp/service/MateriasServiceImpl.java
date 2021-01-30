package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.MateriasDAO;
import mx.unam.pa.sige.webapp.model.Materias;

@Service
@Transactional
public class MateriasServiceImpl implements MateriasService{
	@Autowired
	private MateriasDAO dao;
	
	@Override
	public List<Materias> listarMaterias(){
		return dao.getAllMaterias();
	};
	
	@Override
	public void guardar(Materias materia) {
		dao.save(materia);
	}
	
	/*@Override
	public void eliminar(Grupos grupo) {
		dao.delete(grupo);
	}
	
	@Override
	public void editar(Grupos grupo) {
		dao.edit(grupo);
	}*/
	
	@Override
	public Materias obtenerMateria(Integer idMateria) {
		return dao.getMaterias(idMateria);
	}
}