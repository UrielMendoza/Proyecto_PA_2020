package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
