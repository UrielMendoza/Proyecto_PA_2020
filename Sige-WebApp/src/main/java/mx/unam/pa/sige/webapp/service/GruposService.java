package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Grupos;

public interface GruposService {
	public List<Grupos> listarGrupos();
	
	public void guardar(Grupos grupo);
	
	public void eliminar(Grupos grupo);
	
	public  void editar(Grupos grupo);
	
	public Grupos obtenerGrupos(Integer idGrupo);

}
