package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface AlumnosService {
    
    public List<Alumnos> listarAlumnos();
    
    public void guardar(Alumnos alumno);
    
    public void eliminar(Alumnos alumno);
    
    public Alumnos encontrarAlumnos(Alumnos alumno);
}
