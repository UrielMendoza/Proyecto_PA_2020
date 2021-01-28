package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import mx.unam.pa.sige.webapp.model.MateriasHorarios;

public interface MateriasHorariosDAO {
	
	public List<MateriasHorarios> getAllMateriasHorarios();
	
	public List<MateriasHorarios> getAllMateriasHorariosByGrado(Integer grupo);
	
	public void save(MateriasHorarios materiasHorarios);
	
	public MateriasHorarios getMateriasHorarios(Integer idMateriasHorarios );
	
	public void delete(MateriasHorarios idMateriasHorarios);
	
	public void edit(MateriasHorarios idMateriasHorarios);
}
