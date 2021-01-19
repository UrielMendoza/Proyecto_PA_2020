package mx.unam.pa.sige.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nivel")
public class Nivel {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_nivel")
    private Integer idNivel;
    
    private String nombreNivel;
    
    private String gradoAcademico;

    @Override
    public String toString() {
        return "Nivel{" + "idNivel=" + idNivel + ", nombreNivel=" + nombreNivel + ", gradoAcademico=" + gradoAcademico + '}';
    }

    
    
    public Nivel() {
    }

    public Nivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idNivel);
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
        final Nivel other = (Nivel) obj;
        if (!Objects.equals(this.idNivel, other.idNivel)) {
            return false;
        }
        return true;
    }
}