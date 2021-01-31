package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;

public interface AlumnoMateriasDAO {
	
	public List<AlumnoMaterias> getAllAlumnoMaterias();
	
	public void saveAlumnoMaterias(AlumnoMaterias alumnoMaterias);
	
	public AlumnoMaterias getAlumnoMaterias(Integer idAlumnoMaterias );
	
	public List<AlumnoMaterias> getAlumnoMateriasByNumCuenta(Alumnos alumno);
	
	public void delete(List<AlumnoMaterias> alumnoMaterias);
	
	public void edit(AlumnoMaterias alumnoMaterias);
	
	public void saveAlumnosInscritos(List<MateriasHorarios> materiasHorarios, Alumnos alumno);
	
	public List<AlumnoMaterias> getAllAlumnosMateriasByIdMateriasHorarios(Integer idMateriasHorarios);
	
	
}