package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface GruposService {
    
    public List<Grupos> listarGrupos();
    
    public void guardar(Grupos grupos);
    
    public void eliminar(Grupos grupos);
    
    public Grupos encontrarGrupos(Grupos grupos);
}
