package mx.unam.pa.sige.service;

import java.util.List;

import mx.unam.pa.sige.domain.Alumnos;

public interface AlumnoService {
	public List<Alumnos> listarAlumnos();
	
	/**
	 * Inserción de un POJO {@link Autor} en la base de 
	 * datos
	 * @param autor
	 */
	public void guardar(Alumnos alumno);
}