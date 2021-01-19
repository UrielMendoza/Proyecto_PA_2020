package mx.unam.pa.sige.service;

import java.util.List;

import mx.unam.pa.sige.model.Alumnos;

public interface AlumnosService {
	public List<Alumnos> listarAlumnos();
	
	/**
	 * Inserción de un POJO {@link Autor} en la base de 
	 * datos
	 * @param autor
	 */
	public void guardar(Alumnos alumno);
	
	public void eliminar(Alumnos alumno);
	
	public Alumnos obtenerAlumnos(Integer idAlumn);
}