package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Materias;

public interface MateriasService {
	
	public List<Materias> listarMaterias();
	
	public void guardar(Materias materias);
	
	//public void eliminar(Grupos grupo);
	
	//public  void editar(Grupos grupo);
	
	public Materias obtenerMateria(Integer idMateria);

}
