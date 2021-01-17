package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface AlumnoMateriasService {
    
    public List<AlumnoMaterias> listarAlumnoMaterias();
    
    public void guardar(AlumnoMaterias alumnoMaterias);
    
    public void eliminar(AlumnoMaterias alumnoMaterias);
    
    public AlumnoMaterias encontrarAlumnoMaterias(AlumnoMaterias alumnoMaterias);
}
