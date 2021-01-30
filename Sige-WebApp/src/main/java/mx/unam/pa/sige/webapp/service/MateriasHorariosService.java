package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.forms.AltaMateriaForm;
import mx.unam.pa.sige.webapp.forms.BajaMateriaForm;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.model.Profesores;

public interface MateriasHorariosService {
	public List<MateriasHorarios> listarMateriasHorarios();
	
	public List<MateriasHorarios> listarMateriasHorariosByGrado(Integer grado);
	
	public void guardar(MateriasHorarios materiasHorarios);
	
	public void eliminar(BajaMateriaForm formBajaMateria);
	
	public  void editar(MateriasHorarios materiasHorarios);
	
	public MateriasHorarios obtenerMateriasHorarios(Integer idMateriasHorarios);
	
	public void guardarMateriaHorario(AltaMateriaForm formAltaMateria, Profesores profesor);
	
}