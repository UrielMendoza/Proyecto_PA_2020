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
@SessionAttributes("usuarioFirmado")
public class BajaAlumnoController {
	@Autowired
	private AlumnosService alumnoServicio;
	
	@GetMapping("/bajaAlmuno")
	public ModelAndView mostrarFormatoBajaMateria(@ModelAttribute("usuarioFirmado") Alumnos alumno) {	
		
		ModelAndView view = new ModelAndView("baja-alumno");

		return view;               
	}
	
	@RequestMapping(value="/alumnoBaja", method=RequestMethod.POST)
	public ModelAndView materiaBaja(@ModelAttribute("usuarioFirmado") Alumnos alumno, ModelAndView view) {
		
		//Alumnos alumnoEliminar = alumnoServicio.obtenerAlumnos(alumno.getIdAlumno());
		
		alumnoServicio.eliminar(alumno.getIdAlumno());
		
		view.setViewName("alumno-bajado");
	
		return view;
		
	}

}
