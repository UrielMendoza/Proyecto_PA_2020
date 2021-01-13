package mx.com.gm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.domain.Alumnos;

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

