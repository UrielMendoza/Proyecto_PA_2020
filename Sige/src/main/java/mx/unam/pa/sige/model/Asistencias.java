package mx.unam.pa.sige.model;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asistencias")
public class Asistencias {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_asistencia")
    private Integer idAsistencias;
    
    @JoinColumn(name="id_numCuenta2",referencedColumnName="id_numCuenta")
    @ManyToOne(cascade = CascadeType.ALL)
    private Alumnos alumno;
    
    @JoinColumn(name="id_materiasHorarios2",referencedColumnName="id_materiasHorarios")
    @ManyToOne(cascade = CascadeType.ALL)
    private MateriasHorarios materiasHorarios;
    
    @Column(name="fecha")
    private String fecha;
    
    private int asistencia;

    @Override
    public String toString() {
        return "Asistencias{" + "idAsistencias=" + idAsistencias + ", fecha=" + fecha + ", asistencia=" + asistencia + '}';
    }
    
    

    public Asistencias() {
    }

    public Asistencias(Integer idAsistencias) {
        this.idAsistencias = idAsistencias;
    }

    public Integer getIdAsistencias() {
        return idAsistencias;
    }

    public void setIdAsistencias(Integer idAsistencias) {
        this.idAsistencias = idAsistencias;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idAsistencias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asistencias other = (Asistencias) obj;
        if (!Objects.equals(this.idAsistencias, other.idAsistencias)) {
            return false;
        }
        return true;
    }
}