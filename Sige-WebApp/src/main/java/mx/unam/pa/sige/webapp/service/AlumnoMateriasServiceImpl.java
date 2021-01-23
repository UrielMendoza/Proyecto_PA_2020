package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.AlumnoMateriasDAO;
import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;

@Service
@Transactional
public class AlumnoMateriasServiceImpl implements AlumnoMateriasService{
	@Autowired
	private AlumnoMateriasDAO dao;
	
	@Override
	public List<AlumnoMaterias> listarAlumnoMaterias() {
		return dao.getAllAlumnoMaterias();
	}

	@Override
	public void guardar(AlumnoMaterias alumnoMaterias) {
		dao.save(alumnoMaterias);
	}
	
	public List<AlumnoMaterias> obtenerAlumnoMateriasPorNumCuenta(Alumnos alumno) {
		return dao.getAlumnoMateriasByNumCuenta(alumno);
	}
	
	@Override
	public void eliminar(List<AlumnoMaterias> alumnoMaterias) {
		dao.delete(alumnoMaterias);
	}
	
	@Override
	public void editar(AlumnoMaterias alumnoMaterias) {
		dao.edit(alumnoMaterias);
	}
	
	@Override
	public AlumnoMaterias obtenerAlumnoMaterias(Integer idAlumnoMaterias) {
		return dao.getAlumnoMaterias(idAlumnoMaterias);
	}
}