package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;

public interface AlumnoMateriasService {
	public List<AlumnoMaterias> listarAlumnoMaterias();
	
	public void guardarAlumnoMaterias(AlumnoMaterias alumnoMaterias);
	
	public void eliminar(List<AlumnoMaterias> alumnoMaterias);
	
	public  void editar(AlumnoMaterias alumnoMaterias);
	
	public AlumnoMaterias obtenerAlumnoMaterias(Integer idAlumnoMaterias);
	
	public List<AlumnoMaterias> obtenerAlumnoMateriasPorNumCuenta(Alumnos alumno);
	
	public void guardarAlumnosInscritos(List<MateriasHorarios> materiasHorarios, Alumnos alumno);
	
	public List<AlumnoMaterias> listarAllAlumnosMateriasByIdMateriasHorarios(Integer idMateriasHorarios);
	
	public float obtenerPromedio(List<AlumnoMaterias> alumnoMaterias);
}