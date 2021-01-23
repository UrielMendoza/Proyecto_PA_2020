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

import mx.unam.pa.sige.webapp.forms.LoginForm;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.service.AlumnosService;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.service.ProfesoresService;

@Controller
@SessionAttributes("usuarioFirmado")
public class LoginController {
	@Autowired
	private AlumnosService alumnosServicio;
	@Autowired
	private ProfesoresService profesoresServicio;
	
	@GetMapping("/login")
	public ModelAndView mostrarFormatoLogin() {
		ModelAndView view = new ModelAndView("login","formUsuario",new LoginForm());
		return view;
	}
	
	@RequestMapping(value="/inicioSesion", method=RequestMethod.POST)
	public ModelAndView loginUsuario(@Valid @ModelAttribute("formUsuario") LoginForm formLogin,
		@RequestParam("tipoUsuario") String tipo, BindingResult resultado, ModelAndView view) {
		if(resultado.hasErrors()) {
			view.setViewName("login");
			return view;
		}
		if (tipo.equals("A")) {
			System.out.print("chi");
			Alumnos usuarioFirmado = alumnosServicio.loginAlumno(formLogin);
			if (usuarioFirmado != null) {
				view.addObject("usuarioFirmado", usuarioFirmado);
				view.setViewName("home-alumno");
			} else {
				view.addObject("error","Parámetros incorrectos");
				view.setViewName("login");
			}
		} else {
			Profesores usuarioFirmado = profesoresServicio.loginProfesor(formLogin);
			if (usuarioFirmado != null) {
				view.addObject("usuarioFirmado", usuarioFirmado);
				view.setViewName("home-profesor");
			} else {
				view.addObject("error","Parámetros incorrectos");
				view.setViewName("login");
			}
		}
		
		return view;
		
	}

}
