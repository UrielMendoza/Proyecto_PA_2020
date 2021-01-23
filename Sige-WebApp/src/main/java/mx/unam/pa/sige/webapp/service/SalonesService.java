package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Salones;

public interface SalonesService {
	public List<Salones> listarSalones();
	
	public void guardar(Salones salon);
	
	public void eliminar(Salones salon);
	
	public void editar(Salones salon);
	
	public Salones obtenerSalones(Integer idSalon);

}
