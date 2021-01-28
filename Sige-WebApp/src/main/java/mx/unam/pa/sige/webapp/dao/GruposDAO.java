package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Grupos;

public interface GruposDAO {
	
	public List<Grupos> getAllGrupos();
	
	public List<Grupos> getAllGruposByGrado(Integer grado);
	
	public void save(Grupos grupo);
	
	public Grupos getGrupos(Integer idGrupo );
	
	public void delete(Grupos grupo);
	
	public void edit(Grupos grupo);
}