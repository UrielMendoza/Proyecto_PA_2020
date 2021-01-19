package mx.unam.pa.sige.dao;

import java.util.List;

import mx.unam.pa.sige.model.Grupos;

public interface GruposDAO {
	
	public List<Grupos> getAllGrupos();
	
	/**
	 * <p>Ejecución de inserción en la tabla libro.</p>
	 * <p>Equivalente a <br><code>INSERT INTO libro...</code></p>
	 * @param autor
	 */
	public void save(Grupos grupos);
	
	/**
	 * <p>Ejecución de consulta a la tabla autor con el criterio id.</p>
	 * <p>Equivalente a <br> 
	 * <code>SELECT * FROM libro WHERE id = 3;</code>
	 * </p>
	 * @param id
	 * @return
	 */
	public Grupos getGrupos(Integer idGrupo );
}