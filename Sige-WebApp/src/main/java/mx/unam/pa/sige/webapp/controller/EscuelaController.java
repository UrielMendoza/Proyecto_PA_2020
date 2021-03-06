package mx.unam.pa.sige.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import mx.unam.pa.sige.webapp.service.AlumnosService;
import mx.unam.pa.sige.webapp.service.GruposService;
import mx.unam.pa.sige.webapp.service.MateriasService;
import mx.unam.pa.sige.webapp.service.ProfesoresService;
import mx.unam.pa.sige.webapp.service.SalonesService;
import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.Grupos;
import mx.unam.pa.sige.webapp.model.Materias;
import mx.unam.pa.sige.webapp.model.Profesores;
import mx.unam.pa.sige.webapp.model.Salones;


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
@RequestMapping("/Escuela")
@SessionAttributes("usuarioFirmado")
public class EscuelaController {
	@Autowired
	private AlumnosService alumnosServicio;
	@Autowired
	private ProfesoresService profesoresServicio;
	@Autowired
	private GruposService grupoServicio;
	@Autowired
	private MateriasService materiasServicio;
	@Autowired
	private SalonesService salonesServicio;
	
	
	/**
	 * Listado de todos los libros. 
	 * Para acceder a esta funcionalidad y manteniendo las suposiciones descritas 
	 * anteriormente, el usuario deberá ingresar en su navegador web la URL
	 * 
	 * http://localhost:8080/web-biblioteca/spring/libro/listar
	 * @return
	 */
	
	@GetMapping(value="/listara")
    public ModelAndView listara(@ModelAttribute("usuarioFirmado") Alumnos alumno){
		int [] contadores=new int [6];
		ModelAndView view = new ModelAndView();
		
		List<Alumnos> Alu = alumnosServicio.listarAlumnos();	
		contadores[0]=Alu.size();
		
		List<Profesores> prof= profesoresServicio.listarProfesores();
		contadores[1]=prof.size();
		
		List<Grupos> grup=grupoServicio.listarGrupos();
		contadores[2]=grup.size();
		
		List<Materias> mat=materiasServicio.listarMaterias();
		contadores[3]=mat.size();
		
		List<Salones> salo=salonesServicio.listarSalones();
		contadores[4]=salo.size();
		
		view.addObject("contadores", contadores);
		view.setViewName("escuela");
		return view;
    }
	
	@GetMapping(value="/listarp")
    public ModelAndView listarp(@ModelAttribute("usuarioFirmado") Profesores profesores){
		int [] contadores=new int [6];
		ModelAndView view = new ModelAndView();
		
		List<Alumnos> Alu = alumnosServicio.listarAlumnos();	
		contadores[0]=Alu.size();
		
		List<Profesores> prof= profesoresServicio.listarProfesores();
		contadores[1]=prof.size();
		
		List<Grupos> grup=grupoServicio.listarGrupos();
		contadores[2]=grup.size();
		
		List<Materias> mat=materiasServicio.listarMaterias();
		contadores[3]=mat.size();
		
		List<Salones> salo=salonesServicio.listarSalones();
		contadores[4]=salo.size();
		
		view.addObject("contadores", contadores);
		view.setViewName("escuela2");
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