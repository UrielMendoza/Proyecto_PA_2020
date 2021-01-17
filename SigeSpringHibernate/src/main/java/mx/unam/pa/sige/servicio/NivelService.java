package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface NivelService {
    
    public List<Nivel> listarNiveles();
    
    public void guardar(Nivel nivel);
    
    public void eliminar(Nivel nivel);
    
    public Nivel encontrarNiveles(Nivel nivel);
}
