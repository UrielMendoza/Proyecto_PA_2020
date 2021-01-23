package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.Salones;

public interface SalonesDAO {
	public List<Salones> getAllSalones();
	
	public void save(Salones salones);
	
	public Salones getSalones(Integer idSalon );
	
	public void delete(Salones salon);
	
	public void edit(Salones salon);
}