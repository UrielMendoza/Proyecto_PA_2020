package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;

public interface AlumnoMateriasService {
	public List<AlumnoMaterias> listarAlumnoMaterias();
	
	public void guardar(AlumnoMaterias alumnoMaterias);
	
	public void eliminar(List<AlumnoMaterias> alumnoMaterias);
	
	public  void editar(AlumnoMaterias alumnoMaterias);
	
	public AlumnoMaterias obtenerAlumnoMaterias(Integer idAlumnoMaterias);
	
	public List<AlumnoMaterias> obtenerAlumnoMateriasPorNumCuenta(Alumnos alumno);
}