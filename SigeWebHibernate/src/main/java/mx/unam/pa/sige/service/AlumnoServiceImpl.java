package mx.unam.pa.sige.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.dao.AlumnoDAO;
import mx.unam.pa.sige.domain.Alumnos;

@Service
@Transactional
public class AlumnoServiceImpl implements AlumnoService {
	@Autowired
	private AlumnoDAO dao;
	
	@Override
	public List<Alumnos> listarAlumnos() {
		return dao.getAllAlumnos();
	}

	@Override
	public void guardar(Alumnos Alumnos) {
		dao.save(Alumnos);
	}
}

