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
import mx.unam.pa.sige.webapp.forms.BajaMateriaForm;
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
@SessionAttributes(names = {"usuarioFirmado","profesorMateriasFirmado"})
public class BajaMateriaController {
	@Autowired
	private MateriasHorariosService materiasHorariosServicio;
	
	@GetMapping("/bajaMateria")
	public ModelAndView mostrarFormatoBajaMateria(@ModelAttribute("usuarioFirmado") Profesores profesor,
			@ModelAttribute("profesorMateriasFirmado") List<MateriasHorarios> profesorMaterias) {	
		
		ModelAndView view = new ModelAndView("baja-materia","bajaMateriaFrm",new BajaMateriaForm());
		
		/*
		List<Materias> materiasDisponibles = materiasServicio.listarMaterias();
		List<Grupos> gruposDisponibles = gruposServicio.listarGrupos();
		List<Salones> salonesDisponibles = salonesServicio.listarSalones();		
		
		view.addObject("materiasDisponiblesFirmado",materiasDisponibles);
		view.addObject("gruposDisponiblesFirmado",gruposDisponibles);
		view.addObject("salonesDisponiblesFirmado",salonesDisponibles);
		*/
		
		return view;
	}
	
	@RequestMapping(value="/materiaBaja", method=RequestMethod.POST)
	public ModelAndView materiaBaja(@Valid @ModelAttribute("bajaMateriaFrm") BajaMateriaForm formBajaMateria,
			@ModelAttribute("usuarioFirmado") Profesores profesor, BindingResult resultado, ModelAndView view) {
		if(resultado.hasErrors()) {
			view.setViewName("baja-materia");
			return view;
		}		
		
		materiasHorariosServicio.eliminar(formBajaMateria);
		
		view.setViewName("home-profesor");
	
		return view;
		
	}

}
