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
@Table(name="materiasHorarios")
public class MateriasHorarios {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_materiasHorarios")
    private Integer idMateriasHorarios;
    
    @JoinColumn(name="id_materia1",referencedColumnName="id_materia")
    @ManyToOne(cascade = CascadeType.ALL)
    private Materias materia;
    
    private String horario;
    
    private String dias;
    
    @JoinColumn(name="id_numCuentaProf1",referencedColumnName="id_numCuentaProf")
    @ManyToOne(cascade = CascadeType.ALL)
    private Profesores profesor;
    
    @JoinColumn(name="id_grupo2",referencedColumnName="id_grupo")
    @ManyToOne(cascade = CascadeType.ALL)
    private Grupos grupo;
    
    @JoinColumn(name="id_salon1",referencedColumnName="id_salon")
    @ManyToOne(cascade = CascadeType.ALL)
    private Salones salon;

    @Override
    public String toString() {
        return "MateriasHorarios{" + "idMateriasHorarios=" + idMateriasHorarios + ", materia=" + materia + ", horario=" + horario + ", dias=" + dias + ", profesor=" + profesor + ", grupo=" + grupo + ", salon=" + salon + '}';
    }

  
    public MateriasHorarios() {
    }

    public MateriasHorarios(Integer idMateriasHorarios) {
        this.idMateriasHorarios = idMateriasHorarios;
    }

    public Integer getIdMateriasHorarios() {
        return idMateriasHorarios;
    }

    public void setIdMateriasHorarios(Integer idMateriasHorarios) {
        this.idMateriasHorarios = idMateriasHorarios;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    public Grupos getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }

    public Salones getSalon() {
        return salon;
    }

    public void setSalon(Salones salon) {
        this.salon = salon;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idMateriasHorarios);
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
        final MateriasHorarios other = (MateriasHorarios) obj;
        if (!Objects.equals(this.idMateriasHorarios, other.idMateriasHorarios)) {
            return false;
        }
        return true;
    }
}