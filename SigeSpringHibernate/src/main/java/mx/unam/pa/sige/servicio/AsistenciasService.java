package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface AsistenciasService {
    
    public List<Asistencias> listarAsistencias();
    
    public void guardar(Asistencias asistencias);
    
    public void eliminar(Asistencias asistencias);
    
    public Asistencias encontrarAsistencias(Asistencias asistencias);
}
