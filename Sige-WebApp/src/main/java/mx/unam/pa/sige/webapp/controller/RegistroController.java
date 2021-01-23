package mx.unam.pa.sige.webapp.controller;

import javax.validation.Valid;

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
import mx.unam.pa.sige.webapp.service.AlumnosService;
import mx.unam.pa.sige.webapp.service.ProfesoresService;

@Controller
@SessionAttributes("usuarioFirmado")
@RequestMapping("/usuario")
public class RegistroController {
	
	@Autowired
	private AlumnosService alumnosServicio;
	@Autowired
	private ProfesoresService profesoresServicio;
	
	@GetMapping("/registro")
	public ModelAndView mostrarFormaLogin() {
		ModelAndView view = new ModelAndView("registro-usuario","formUserRegistro", new PasswordForm());
		return view;
	}
	
	@RequestMapping(value="/registroUsuario", method=RequestMethod.POST)
	public ModelAndView registrarUsuario(@Valid @ModelAttribute("formUserRegistro") PasswordForm formPassword, 
			@RequestParam("tipoUsuario") String tipo, @RequestParam("sexo") String sexo, 
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
