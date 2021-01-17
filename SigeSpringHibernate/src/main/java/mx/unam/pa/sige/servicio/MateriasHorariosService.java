package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface MateriasHorariosService {
    
    public List<MateriasHorarios> listarMateriasHorarios();
    
    public void guardar(MateriasHorarios materiasHorarios);
    
    public void eliminar(MateriasHorarios materiasHorarios);
    
    public MateriasHorarios encontrarMateriasHorarios(MateriasHorarios materiasHorarios);
}
