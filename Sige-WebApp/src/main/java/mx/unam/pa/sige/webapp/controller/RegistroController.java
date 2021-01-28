package mx.unam.pa.sige.webapp.controller;

import javax.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import mx.unam.pa.sige.webapp.forms.PasswordForm;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.model.Grupos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.service.AlumnosService;
import mx.unam.pa.sige.webapp.service.ProfesoresService;
import mx.unam.pa.sige.webapp.service.GruposService;
import mx.unam.pa.sige.webapp.service.MateriasHorariosService;

@Controller
@SessionAttributes("usuarioFirmado")
@RequestMapping("/usuario")
public class RegistroController {
	
	@Autowired
	private AlumnosService alumnosServicio;
	@Autowired
	private ProfesoresService profesoresServicio;
	@Autowired
	private GruposService gruposServicio;
	@Autowired
	private MateriasHorariosService materiasHorariosServicio;
	
	@GetMapping("/registro")
	public ModelAndView mostrarFormaLogin() {
		ModelAndView view = new ModelAndView("registro-usuario","formUserRegistro", new PasswordForm());
		List<Grupos> gruposPrimero = gruposServicio.listarGruposByGrado(1);
		List<MateriasHorarios> materiasHorariosPrimero = materiasHorariosServicio.listarMateriasHorariosByGrado(1);
		view.addObject("gruposPrimeroFirmado", gruposPrimero);
		view.addObject("materiasHorariosPrimeroFirmado", materiasHorariosPrimero);
		return view;
	}
	
	@RequestMapping(value="/registroUsuario", method=RequestMethod.POST)
	public ModelAndView registrarUsuario(@Valid @ModelAttribute("formUserRegistro") PasswordForm formPassword, 
			@RequestParam("tipoUsuario") String tipo, @RequestParam("sexo") String sexo, @RequestParam("idGrupo") Integer idGrupo, 
			BindingResult resultado,ModelAndView view) {
		if(resultado.hasErrors()) {
			view.setViewName("registro-usuario");
		}
		 	
		System.out.println(formPassword);
		System.out.println(sexo);
		
		if (tipo.equals("A")) {
			
			Alumnos usuarioFirmado = alumnosServicio.guardarAlumno(formPassword); 
			
			if (usuarioFirmado != null) {
				view.addObject("usuarioFirmado", usuarioFirmado);
				view.setViewName("home-alumno");
			} else {
				view.addObject("error","Parámetros incorrectos");
				view.setViewName("registro-usuario");
			}
		} else {
			Profesores usuarioFirmado = profesoresServicio.guardarProfesor(formPassword);
			if (usuarioFirmado != null) {
				view.addObject("usuarioFirmado", usuarioFirmado);
				view.setViewName("home-profesor");
			} else {
				view.addObject("error","Parámetros incorrectos");
				view.setViewName("registro-usuario");
			}
		}
		
		return view;
	}
}
