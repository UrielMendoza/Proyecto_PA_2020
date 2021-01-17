package mx.unam.pa.sige.web;

import lombok.extern.slf4j.Slf4j;
import mx.unam.pa.sige.domain.*;
import mx.unam.pa.sige.servicio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private AlumnosService alumnoService;
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var alumnos = alumnoService.listarAlumnos();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("alumnos", alumnos);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar_1";
    }
    
    @GetMapping("/agrega")
    public String agregar(Alumnos alumno){
        return "modificar_1_1";
    }
    
    
    
    @PostMapping("/guardar")
    public String guardar(Alumnos alumno){
        alumnoService.guardar(alumno);
        return "redirect:/";
    }
    
    @PostMapping("/guardar1")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idAlumno}")
    public String editar(Alumnos alumno, Model model){
        alumno = alumnoService.encontrarAlumnos(alumno);
        model.addAttribute("alumno", alumno);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Alumnos alumno){
        alumnoService.eliminar(alumno);
        return "redirect:/";
    }
}

