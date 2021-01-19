package mx.unam.pa.sige;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mx.unam.pa.sige.config.HibernateConfig;
import mx.unam.pa.sige.model.Alumnos;
import mx.unam.pa.sige.service.AlumnosService;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HibernateConfig.class) ){
			
			AlumnosService servicio = context.getBean(AlumnosService.class);
			
			/*
			List<Autor> listadoAutores = servicio.listarAutores();
			m.printAutores(listadoAutores);
			*/
			
			System.out.println("Creando nuevo usuario");
			Alumnos alumno = new Alumnos();
			servicio.guardar(alumno);
			
			List<Alumnos> listadoAlumnos = servicio.listarAlumnos();
			m.printAlumnos(listadoAlumnos);
			
		}
	}
	
	public void printAlumnos(List<Alumnos> alumnos) {
		for(Alumnos alumno : alumnos) {
			System.out.println(alumno);
		}
	}

}