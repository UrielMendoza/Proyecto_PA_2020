package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.forms.PasswordForm;
import mx.unam.pa.sige.webapp.forms.LoginForm;


public interface AlumnosService {
	public List<Alumnos> listarAlumnos();
	
	public Alumnos guardarAlumno(PasswordForm formPassword);
	
	public Alumnos loginAlumno(LoginForm formLogin);
	
	public void eliminar(Alumnos alumno);
	
	public  void editar(Alumnos alumno);
	
	public Alumnos obtenerAlumnos(Integer idAlumno);
	
	public List<AlumnoMaterias> listarMateriasAlumno(Integer IdAlumno);
	
	public List<MateriasHorarios> listarGrupoAlumno(Integer idGrupos);
}