package mx.unam.pa.sige.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.pa.sige.webapp.dao.AlumnosDAO;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.forms.PasswordForm;
import mx.unam.pa.sige.webapp.forms.LoginForm;

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
	public Alumnos loginAlumno(LoginForm formLogin) {
		Alumnos alumno = new Alumnos();
		alumno.setIdAlumno(formLogin.getNumCuenta());
		alumno.setPassword(formLogin.getPassword());
		
		return dao.loginAlumno(alumno);
	}

	@Override
	public Alumnos guardarAlumno(PasswordForm formPassword) {
		Alumnos nuevoAlumno = new Alumnos(formPassword.getCorreo(),formPassword.getNombre(),
					formPassword.getApellido(),formPassword.getTelefono(),formPassword.getSexo(),
					formPassword.getDireccion(),formPassword.getCp(),formPassword.getFechaNac(),
					formPassword.getPassword());
		Integer idAlumno = dao.saveAlumno(nuevoAlumno);
		return dao.getAlumnos(idAlumno);
	}
	
	@Override
	public void eliminar(Alumnos alumno) {
		dao.delete(alumno);
	}
	
	@Override
	public void editar(Alumnos alumno) {
		dao.edit(alumno);
	}
	
	@Override
	public Alumnos obtenerAlumnos(Integer idAlumno) {
		return dao.getAlumnos(idAlumno);
	}
}