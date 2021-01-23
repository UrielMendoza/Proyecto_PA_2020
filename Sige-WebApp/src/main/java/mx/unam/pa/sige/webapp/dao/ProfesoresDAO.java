package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Profesores;

public interface ProfesoresDAO {
	
	public List<Profesores> getAllProfesores();
	
	public Profesores getProfesores(Integer idProf );
	
	public Integer saveProfesor(Profesores Profesor);
	
	public Profesores loginProfesor(Profesores Profesor);
	
	public void delete(Profesores profesor);
	
	public void edit(Profesores profesor);

}