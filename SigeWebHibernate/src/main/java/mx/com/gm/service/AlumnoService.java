package mx.com.gm.service;

import java.util.List;

import mx.com.gm.domain.Alumnos;

public interface AlumnoService {
	public List<Alumnos> listarAlumnos();
	
	/**
	 * Inserción de un POJO {@link Autor} en la base de 
	 * datos
	 * @param autor
	 */
	public void guardar(Alumnos alumno);
}