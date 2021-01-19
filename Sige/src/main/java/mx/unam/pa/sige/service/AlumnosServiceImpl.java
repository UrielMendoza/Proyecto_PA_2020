package mx.unam.pa.sige.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.dao.AlumnosDAO;
import mx.unam.pa.sige.model.Alumnos;

@Service
@Transactional
public class AlumnosServiceImpl implements AlumnosService{
	@Autowired
	private AlumnosDAO dao;
	
	@Override
	public List<Alumnos> listarAlumnos() {
		return dao.getAllAlumnos();
	}

	@Override
	public void guardar(Alumnos alumno) {
		dao.save(alumno);
	}
	
	@Override
	public void eliminar(Alumnos alumno) {
		dao.delete(alumno);
	}
	
	@Override
	public Alumnos obtenerAlumnos(Integer idAlumn) {
		return dao.getAlumnos(idAlumn);
	}
}