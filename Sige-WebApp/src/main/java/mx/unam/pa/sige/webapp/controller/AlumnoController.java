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
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import mx.unam.pa.sige.webapp.service.AlumnosService;
import mx.unam.pa.sige.webapp.forms.MateriaCalificarForm;
import mx.unam.pa.sige.webapp.forms.PasswordForm;
import mx.unam.pa.sige.webapp.forms.EditForm;
import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.Grupos;
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
@RequestMapping("/Alumno")
@SessionAttributes("usuarioFirmado")
public class AlumnoController {
	@Autowired
	private AlumnosService alumnosServicio;
	
	/**
	 * Listado de todos los libros. 
	 * Para acceder a esta funcionalidad y manteniendo las suposiciones descritas 
	 * anteriormente, el usuario deberá ingresar en su navegador web la URL
	 * 
	 * http://localhost:8080/web-biblioteca/spring/libro/listar
	 * @return
	 */
	
	@GetMapping(value="/listar")
    public ModelAndView listar(@ModelAttribute("usuarioFirmado") Alumnos alumno){
		ModelAndView view = new ModelAndView();
		Alumnos alumnos = alumnosServicio.obtenerAlumnos(alumno.getIdAlumno());	
        
		view.addObject("alumnos", alumnos);
		view.setViewName("alumno");
		return view;
    }
	
	
	@RequestMapping(value="/editarAlumno")
	public ModelAndView editar(@ModelAttribute("usuarioFirmado") Alumnos alumno){
		ModelAndView view = new ModelAndView("editar-info","formUserEdit", new EditForm());
		
		return view;
    }
	
	@RequestMapping(value="/alumnoEditado", method=RequestMethod.POST)
	public ModelAndView editarAlumno(@Valid @ModelAttribute("formUserEdit") EditForm formEdit, 
			@ModelAttribute("usuarioFirmado") Alumnos alumno, BindingResult resultado,ModelAndView view) {
		if(resultado.hasErrors()) {
			view.setViewName("editar-info");
		}
		
		alumno.setNombre(formEdit.getNombre());
		alumno.setApellido(formEdit.getApellido());
		alumno.setFechaNac(formEdit.getFechaNac());
		alumno.setDireccion(formEdit.getDireccion());
		alumno.setCp(formEdit.getCp());
		alumno.setCorreo(formEdit.getCorreo());
		alumno.setTelefono(formEdit.getTelefono());
		
		alumnosServicio.editar(alumno);
		
		view.addObject("usuarioFirmado", alumno);
		view.setViewName("home-alumno");
		
		return view;
	}
	
	@GetMapping(value="/homeAlumno")
    public ModelAndView home(@ModelAttribute("usuarioFirmado") Alumnos alumno){
		ModelAndView view = new ModelAndView();
		
		view.setViewName("home-alumno");
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
	@GetMapping("/listar/{isbn}")
	public ModelAndView listarDetalleGrupo(
			@PathVariable(name="isbn") String isbn
			) {
		System.out.println("Dentro de listarDetalleGrupo()");
		System.out.println("ISBN a buscar: " + isbn);
		
		return null;
	}*/
}