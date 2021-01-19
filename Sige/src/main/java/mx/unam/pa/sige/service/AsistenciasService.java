package mx.unam.pa.sige.service;

import java.util.List;

import mx.unam.pa.sige.model.Asistencias;

public interface AsistenciasService {
	public List<Asistencias> listarAsistencias();
	
	/**
	 * Inserción de un POJO {@link Autor} en la base de 
	 * datos
	 * @param autor
	 */
	public void guardar(Asistencias asistencia);

}
