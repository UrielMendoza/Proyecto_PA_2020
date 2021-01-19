package mx.unam.pa.sige.dao;

import java.util.List;

import mx.unam.pa.sige.model.Asistencias;

public interface AsistenciasDAO {
	public List<Asistencias> getAllAsistencias();
	
	/**
	 * <p>Ejecución de inserción en la tabla libro.</p>
	 * <p>Equivalente a <br><code>INSERT INTO libro...</code></p>
	 * @param autor
	 */
	public void save(Asistencias asistencias);
	
	/**
	 * <p>Ejecución de consulta a la tabla autor con el criterio id.</p>
	 * <p>Equivalente a <br> 
	 * <code>SELECT * FROM libro WHERE id = 3;</code>
	 * </p>
	 * @param id
	 * @return
	 */
	public Asistencias getAsistencias(Integer idAsistencias );
	
	public void delete(Asistencias asistencia);

}