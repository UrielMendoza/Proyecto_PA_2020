package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.model.AlumnoMaterias;

public interface AlumnosDAO {
	
	public List<Alumnos> getAllAlumnos();
	
	public Integer saveAlumno(Alumnos alumno);
	
	public Alumnos loginAlumno(Alumnos alumno);
	
	public Alumnos getAlumnos(Integer idAlumno );
	
	public void delete(Alumnos alumno);
	
	public void edit(Alumnos alumno);
	
	public List<AlumnoMaterias> getAllMateriasAlumno(Integer idAlumno);
	
	public List<MateriasHorarios> getGrupoAlumno(Integer idGrupos);
	

}