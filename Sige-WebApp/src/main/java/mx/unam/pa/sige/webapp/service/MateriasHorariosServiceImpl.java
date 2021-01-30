package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.MateriasHorariosDAO;
import mx.unam.pa.sige.webapp.forms.PasswordForm;
import mx.unam.pa.sige.webapp.forms.AltaMateriaForm;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.Grupos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.model.Materias;
import mx.unam.pa.sige.webapp.model.Salones;
import mx.unam.pa.sige.webapp.dao.MateriasDAO;
import mx.unam.pa.sige.webapp.dao.GruposDAO;
import mx.unam.pa.sige.webapp.dao.SalonesDAO;
import mx.unam.pa.sige.webapp.forms.BajaMateriaForm;

@Service
@Transactional
public class MateriasHorariosServiceImpl implements MateriasHorariosService{
	@Autowired
	private MateriasHorariosDAO dao;
	@Autowired
	private MateriasDAO daoMaterias;
	@Autowired
	private GruposDAO daoGrupos;
	@Autowired
	private SalonesDAO daoSalones;
	
	@Override
	public List<MateriasHorarios> listarMateriasHorarios() {
		return dao.getAllMateriasHorarios();
	}
	
	@Override
	public List<MateriasHorarios> listarMateriasHorariosByGrado(Integer grado){
		return dao.getAllMateriasHorariosByGrado(grado);
	};

	@Override
	public void guardar(MateriasHorarios materiasHorarios) {
		dao.save(materiasHorarios);
	}
	
	@Override
	public void eliminar(BajaMateriaForm formBajaMateria) {
		
		String materiaBaja = String.valueOf(formBajaMateria.getIdMateriasHorarios());
		
		dao.delete(materiaBaja);
	}
	
	@Override
	public void editar(MateriasHorarios materiasHorarios) {
		dao.edit(materiasHorarios);
	}
	
	@Override
	public MateriasHorarios obtenerMateriasHorarios(Integer idMateriasHorarios) {
		return dao.getMateriasHorarios(idMateriasHorarios);
	}
	
	@Override
	public void guardarMateriaHorario(AltaMateriaForm formAltaMateria, Profesores profesor) {
		Grupos grupo = daoGrupos.getGrupos(formAltaMateria.getIdGrupos());
		
		Materias materia = daoMaterias.getMaterias(formAltaMateria.getIdMateria());
		
		Salones salon = daoSalones.getSalones(formAltaMateria.getIdSalon());
		
		MateriasHorarios nuevoMateriaHorario = new MateriasHorarios(materia, formAltaMateria.getHorario(), formAltaMateria.getDias(),
				profesor, grupo, salon);
		
		dao.save(nuevoMateriaHorario);
		
	}
}