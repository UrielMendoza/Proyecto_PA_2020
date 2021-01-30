package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.ProfesoresDAO;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.forms.PasswordForm;
import mx.unam.pa.sige.webapp.forms.LoginForm;

@Service
@Transactional
public class ProfesoresServiceImpl implements ProfesoresService{
	
	@Autowired
	private ProfesoresDAO dao;
	
	@Override
	public List<Profesores> listarProfesores() {
		return dao.getAllProfesores();
	}

	@Override
	public Profesores guardarProfesor(PasswordForm formPassword) {
		Profesores nuevoProfesor = new Profesores(formPassword.getCorreo(),formPassword.getNombre(),
				formPassword.getApellido(),formPassword.getTelefono(),formPassword.getSexo(),
				formPassword.getDireccion(),formPassword.getCp(),formPassword.getFechaNac(),
				formPassword.getPassword());
		Integer idProf = dao.saveProfesor(nuevoProfesor);
		return dao.getProfesores(idProf);
	}
	
	@Override 
	public Profesores loginProfesor(LoginForm formLogin) {
		Profesores profesor = new Profesores();
		profesor.setIdProf(formLogin.getNumCuenta());
		profesor.setPassword(formLogin.getPassword());
		
		return dao.loginProfesor(profesor);
	}
	
	@Override
	public void eliminar(Profesores profesor) {
		dao.delete(profesor);
	}
	
	@Override
	public void editar(Profesores profesor) {
		dao.edit(profesor);
	}
	
	@Override
	public Profesores obtenerProfesores(Integer idProf) {
		return dao.getProfesores(idProf);
	}
	
	@Override
	public List<MateriasHorarios> listarMateriasProfesor(Integer idProf){
		return dao.getAllMateriasProfesor(idProf);
	} 

}