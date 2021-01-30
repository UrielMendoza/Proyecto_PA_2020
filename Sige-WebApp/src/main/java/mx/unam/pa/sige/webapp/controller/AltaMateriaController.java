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
import mx.unam.pa.sige.webapp.forms.AltaMateriaForm;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.Grupos;
import mx.unam.pa.sige.webapp.model.Materias;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.service.AlumnosService;
import mx.unam.pa.sige.webapp.service.MateriasHorariosService;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.model.Salones;
import mx.unam.pa.sige.webapp.service.ProfesoresService;
import mx.unam.pa.sige.webapp.service.GruposService;
import mx.unam.pa.sige.webapp.service.MateriasService;
import mx.unam.pa.sige.webapp.service.SalonesService;

@Controller
@SessionAttributes("usuarioFirmado")
public class AltaMateriaController {
	@Autowired
	private MateriasService materiasServicio;
	@Autowired
	private SalonesService salonesServicio;
	@Autowired
	private MateriasHorariosService materiasHorariosServicio;
	@Autowired
	private GruposService gruposServicio;
	
	@GetMapping("/altaMateria")
	public ModelAndView mostrarFormatoAltaMateria() {	
		
		ModelAndView view = new ModelAndView("registro-materia","altaMateriaFrm",new AltaMateriaForm());
		
		List<Materias> materiasDisponibles = materiasServicio.listarMaterias();
		List<Grupos> gruposDisponibles = gruposServicio.listarGrupos();
		List<Salones> salonesDisponibles = salonesServicio.listarSalones();		
		
		view.addObject("materiasDisponiblesFirmado",materiasDisponibles);
		view.addObject("gruposDisponiblesFirmado",gruposDisponibles);
		view.addObject("salonesDisponiblesFirmado",salonesDisponibles);
		
		return view;
	}
	
	@RequestMapping(value="/materiaRegistrada", method=RequestMethod.POST)
	public ModelAndView grupoCambiado(@Valid @ModelAttribute("altaMateriaFrm") AltaMateriaForm formAltaMateria,
			@ModelAttribute("usuarioFirmado") Profesores profesor, BindingResult resultado, ModelAndView view) {
		if(resultado.hasErrors()) {
			view.setViewName("registro-materia");
			return view;
		}
		
		materiasHorariosServicio.guardarMateriaHorario(formAltaMateria, profesor);
		
		view.setViewName("home-profesor");
	
		return view;
		
	}

}
