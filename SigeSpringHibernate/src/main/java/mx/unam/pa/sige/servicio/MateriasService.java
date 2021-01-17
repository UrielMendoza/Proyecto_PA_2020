package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface MateriasService {
    
    public List<Materias> listarMaterias();
    
    public void guardar(Materias materias);
    
    public void eliminar(Materias materias);
    
    public Materias encontrarMaterias(Materias materias);
}
