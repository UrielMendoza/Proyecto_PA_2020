package mx.unam.pa.sige.webapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import mx.unam.pa.sige.webapp.service.ProfesoresService;
import mx.unam.pa.sige.webapp.service.AlumnoMateriasService;
import mx.unam.pa.sige.webapp.forms.AltaMateriaForm;
import mx.unam.pa.sige.webapp.forms.MateriaCalificarForm;
import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;
import mx.unam.pa.sige.webapp.model.Profesores;


/**
 * <p>Definición de un controlador para exponer la funcionalidad
 * a un cliente web.</p>
 * 
 * <p>Para efectos de ejemplo, se asume lo siguiente:</p>
 * <p>
 * 	<ul>
 * 		<li>Protocolo es http</li>
 * 		<li>Nombre del servidor es localhost</li>
 * 		<li>Puerto de escucha es 8080</li>
 * 		<li>Nombre de la aplicación (context root) es web-biblioteca</li>
 * 	</ul>
 * </p>
 * 
 * <p>Por lo tanto, para acceder a este controlador, el usuario deberá 
 * ingresar en el navegador la URL:<br>
 * 
 * http://localhost:8080/web-biblioteca/spring/libro
 * </p>
 *
 * <p>Clase: Programación Avanzada 2020-I</p>
 * @author Gabriel González G.
 * @date Sep 7, 2019, 1:56:59 PM
 *
 */
@Controller
@RequestMapping("/materiasProfesor")
@SessionAttributes(names = {"usuarioFirmado","profesorMateriasFirmado"})
public class MateriasProfesorController {
	@Autowired
	private ProfesoresService profesoresServicio;
	@Autowired
	private AlumnoMateriasService alumnoMateriasServicio;
	
	/**
	 * Listado de todos los libros. 
	 * Para acceder a esta funcionalidad y manteniendo las suposiciones descritas 
	 * anteriormente, el usuario deberá ingresar en su navegador web la URL
	 * 
	 * http://localhost:8080/web-biblioteca/spring/libro/listar
	 * @return
	 */
	
	@GetMapping(value="/listar")
    public ModelAndView listar(@ModelAttribute("usuarioFirmado") Profesores profesor){
		ModelAndView view = new ModelAndView();
		List<MateriasHorarios> profesorMaterias = profesoresServicio.listarMateriasProfesor(profesor.getIdProf());	
        
		view.addObject("profesorMateriasFirmado", profesorMaterias);
		view.setViewName("materias-profesor");
		return view;
    }
	
	
	@RequestMapping(value="/calificar", method=RequestMethod.POST)
	public ModelAndView grupoCambiado(@Valid @ModelAttribute("caliMateriaForm") MateriaCalificarForm formCaliMateria,
			@ModelAttribute("usuarioFirmado") Profesores profesor,@ModelAttribute("profesorMateriasFirmado") MateriasHorarios profesorMaterias,
			BindingResult resultado, ModelAndView view) {
		if(resultado.hasErrors()) {
			view.setViewName("materias-profesor");
			return view;
		}
		
		List<AlumnoMaterias> alumnoMateriasCali = alumnoMateriasServicio.listarAllAlumnosMateriasByIdMateriasHorarios(formCaliMateria.getIdMateriaHorario());
		
		view.addObject("alumnoMateriasCaliFirmado", alumnoMateriasCali);
		view.setViewName("calificar-materia");
	
		return view;
		
	}
	
	
	/**
	@GetMapping("/MateriasAlumno")
	public ModelAndView listar() {
		ModelAndView view = new ModelAndView();
		
		Alumnos alumno = new Alumnos();		
		
		List<AlumnoMaterias> materias = alumnosServicio.listarMateriasAlumno(alumno);		
		
		view.addObject("materias", materias);
		view.setViewName("materias-alumno");
		return view;
	}
	
	
	 * Listado del detalle de un libro asociado a su ISBN.
	 * 
	 * Para acceder a esta funcionalidad y manteniendo las suposiciones descritas 
	 * anteriormente, el usuario deberá ingresar en su navegador web la URL
	 * 
	 * http://localhost:8080/web-biblioteca/spring/libro/listar/{isbn}
	 * 
	 * Donde {isbn} será el valor de la variable que el controlador de Spring MVC 
	 * tomará de la URL, e.g.
	 *  
	 * http://localhost:8080/web-biblioteca/spring/libro/listar/1451678193
	 * 
	 * Devolverá los detalles de "Crónicas marcianas"
	 * 
	 * @param isbn
	 * @return
	 *
	*/
	/*
	@GetMapping("/listar/calificar")
	public ModelAndView listarDetalleGrupo() {
		ModelAndView view = new ModelAndView();
		List<MateriasHorarios> profesorMaterias = profesoresServicio.listarMateriasProfesor(profesor.getIdProf());	
        
		view.addObject("profesorMateriasFirmado", profesorMaterias);
		view.setViewName("materias-profesor");
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
		
	}*/
}