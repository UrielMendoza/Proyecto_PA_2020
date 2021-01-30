package mx.unam.pa.sige.webapp.controller;

import java.util.List;

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
import mx.unam.pa.sige.webapp.forms.CambioGrupoForm;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.Grupos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.service.AlumnosService;
import mx.unam.pa.sige.webapp.service.MateriasHorariosService;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.service.ProfesoresService;
import mx.unam.pa.sige.webapp.service.GruposService;

@Controller
@SessionAttributes("usuarioFirmado")
public class CambiarGrupoController {
	@Autowired
	private AlumnosService alumnosServicio;
	@Autowired
	private MateriasHorariosService materiasHorariosServicio;
	@Autowired
	private GruposService gruposServicio;
	
	@GetMapping("/cambiarGrupo")
	public ModelAndView mostrarFormatoCambioGrupo(@ModelAttribute("usuarioFirmado") Alumnos alumno) {	
		
		ModelAndView view = new ModelAndView("cambiar-grupo","cambioGrupoFrm",new CambioGrupoForm());
		
		List<MateriasHorarios> materiasGruposDisponibles = materiasHorariosServicio.listarMateriasHorariosByGrado(alumno.getGrupo().getGrado());
		List<Grupos> gruposDisponibles = gruposServicio.listarGruposByGrado(alumno.getGrupo().getGrado());
		
		view.addObject("materiasGruposDisponiblesFirmado", materiasGruposDisponibles);
		view.addObject("gruposDisponiblesFirmado",gruposDisponibles);
		
		return view;
	}
	
	@RequestMapping(value="/grupoCambiado", method=RequestMethod.POST)
	public ModelAndView grupoCambiado(@Valid @ModelAttribute("cambioGrupoFrm") CambioGrupoForm formCambioGrupo,
			@ModelAttribute("usuarioFirmado") Alumnos alumno, @RequestParam("idGrupo") Integer idGrupo, 
			BindingResult resultado, ModelAndView view) {
		if(resultado.hasErrors()) {
			view.setViewName("cambiar-grupo");
			return view;
		}
		
		// Agregar editar aqui el grupo
		Grupos grupo = new Grupos();
		grupo.setIdGrupo(idGrupo);
		grupo.setGrado(alumno.getGrupo().getIdGrupo());		
		alumno.setGrupo(grupo);
		
		alumnosServicio.editar(alumno);
		
		view.addObject("usuarioFirmado", alumno);
		view.setViewName("home-alumno");
	
		return view;
		
	}

}
