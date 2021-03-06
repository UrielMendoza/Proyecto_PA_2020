package mx.unam.pa.sige.webapp.service;

import java.util.List;

import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.forms.PasswordForm;
import mx.unam.pa.sige.webapp.forms.LoginForm;

public interface ProfesoresService {
	public List<Profesores> listarProfesores();
	
	public Profesores guardarProfesor(PasswordForm formPassword);
	
	public Profesores loginProfesor(LoginForm formLogin);
	
	public void eliminar(Integer idProfesor);
	
	public void editar(Profesores profesor);
	
	public Profesores obtenerProfesores(Integer idProf);
	
	public List<MateriasHorarios> listarMateriasProfesor(Integer idProf); 
}
