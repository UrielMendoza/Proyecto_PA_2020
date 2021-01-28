package mx.unam.pa.sige.webapp.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salones")
public class Salones {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_salon")
    private Integer idSalon;
    
	@Column(name="edificio")
    private String edificio;
    
	@Column(name="laboratorio")
    private String laboratorio;
    
	@Column(name="cupo")
    private int cupo;

    @Override
    public String toString() {
        return "Salones{" + "idSalon=" + idSalon + ", edificio=" + edificio + ", laboratorio=" + laboratorio + ", cupo=" + cupo + '}';
    }
    
   

    public Salones() {
    }

    public Salones(Integer idSalon) {
        this.idSalon = idSalon;
    }

    public Integer getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        this.idSalon = idSalon;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idSalon);
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
        final Salones other = (Salones) obj;
        if (!Objects.equals(this.idSalon, other.idSalon)) {
            return false;
        }
        return true;
        
        
        
    }
}