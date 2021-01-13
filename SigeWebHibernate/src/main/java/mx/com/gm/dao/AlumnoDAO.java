package mx.com.gm.dao;

import java.util.List;

import mx.com.gm.domain.Alumnos;

public interface AlumnoDAO {
	public List<Alumnos> getAllAlumnos();
	
	public void save(Alumnos alumnos);
	
	public Alumnos getAlumnos(Integer idAlumno );
}
