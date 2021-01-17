package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface ProfesoresService {
    
    public List<Profesores> listarProfesores();
    
    public void guardar(Profesores profesores);
    
    public void eliminar(Profesores profesores);
    
    public Profesores encontrarProfesores(Profesores profesores);
}
