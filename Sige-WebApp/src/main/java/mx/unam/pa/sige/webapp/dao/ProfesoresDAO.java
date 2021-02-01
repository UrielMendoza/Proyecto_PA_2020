package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;

public interface ProfesoresDAO {
	
	public List<Profesores> getAllProfesores();
	
	public Profesores getProfesores(Integer idProf );
	
	public Integer saveProfesor(Profesores Profesor);
	
	public Profesores loginProfesor(Profesores Profesor);
	
	public void delete(String idProfesor);
	
	public void edit(Profesores profesor);
	
	public List<MateriasHorarios> getAllMateriasProfesor(Integer idProf);

}