package mx.unam.pa.sige.dao;

import java.util.List;

import mx.unam.pa.sige.domain.Alumnos;

public interface AlumnoDAO {
	public List<Alumnos> getAllAlumnos();
	
	public void save(Alumnos alumnos);
	
	public Alumnos getAlumnos(Integer idAlumno );
}
