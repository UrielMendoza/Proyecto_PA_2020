package mx.unam.pa.sige.servicio;

import java.util.List;
import mx.unam.pa.sige.domain.*;

public interface SalonesService {
    
    public List<Salones> listarSaloness();
    
    public void guardar(Salones salones);
    
    public void eliminar(Salones salones);
    
    public Salones encontrarSalones(Salones salones);
}
