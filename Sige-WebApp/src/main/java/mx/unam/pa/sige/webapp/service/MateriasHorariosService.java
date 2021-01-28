package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.MateriasHorarios;

public interface MateriasHorariosService {
	public List<MateriasHorarios> listarMateriasHorarios();
	
	public List<MateriasHorarios> listarMateriasHorariosByGrado(Integer grado);
	
	public void guardar(MateriasHorarios materiasHorarios);
	
	public void eliminar(MateriasHorarios materiasHorarios);
	
	public  void editar(MateriasHorarios materiasHorarios);
	
	public MateriasHorarios obtenerMateriasHorarios(Integer idMateriasHorarios);
	
}