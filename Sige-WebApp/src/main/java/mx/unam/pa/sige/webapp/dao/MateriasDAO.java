package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Materias;

public interface MateriasDAO {
	
	public List<Materias> getAllMaterias();
	
	public void save(Materias materias);
	
	public Materias getMaterias(Integer idMateria );
	
}
