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
@Table(name="profesores")
public class Profesores {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_numCuentaProf")
    private Integer idProf;
    
    private String nombreProf;
    
    private String apellidoProf;
    
    private String sexoProf;
    
    @Column(name="fechaNacProf")
    private String fechaNac;
    
    @JoinColumn(name="id_nivel1",referencedColumnName="id_nivel")
    @ManyToOne(cascade = CascadeType.ALL)
    private Nivel nivel;
    
    private String direccionProf;
    
    private int cpProf;
    
    private String telefonoProf;
    
    private String correoProf;

    @Override
    public String toString() {
        return "Profesores{" + "idProf=" + idProf + ", nombreProf=" + nombreProf + ", apellidoProf=" + apellidoProf + ", sexoProf=" + sexoProf + ", fechaNac=" + fechaNac + ", nivel=" + nivel + ", direccionProf=" + direccionProf + ", cpProf=" + cpProf + ", telefonoProf=" + telefonoProf + ", correoProf=" + correoProf + '}';
    }

    
    public Profesores() {
    }

    public Profesores(Integer idProf) {
        this.idProf = idProf;
    }

    public Integer getIdProf() {
        return idProf;
    }

    public void setIdProf(Integer idProf) {
        this.idProf = idProf;
    }

    public String getNombreProf() {
        return nombreProf;
    }

    public void setNombreProf(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    public String getApellidoProf() {
        return apellidoProf;
    }

    public void setApellidoProf(String apellidoProf) {
        this.apellidoProf = apellidoProf;
    }

    public String getSexoProf() {
        return sexoProf;
    }

    public void setSexoProf(String sexoProf) {
        this.sexoProf = sexoProf;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccionProf() {
        return direccionProf;
    }

    public void setDireccionProf(String direccionProf) {
        this.direccionProf = direccionProf;
    }

    public int getCpProf() {
        return cpProf;
    }

    public void setCpProf(int cpProf) {
        this.cpProf = cpProf;
    }

    public String getTelefonoProf() {
        return telefonoProf;
    }

    public void setTelefonoProf(String telefonoProf) {
        this.telefonoProf = telefonoProf;
    }

    public String getCorreoProf() {
        return correoProf;
    }

    public void setCorreoProf(String correoProf) {
        this.correoProf = correoProf;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idProf);
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
        final Profesores other = (Profesores) obj;
        if (!Objects.equals(this.idProf, other.idProf)) {
            return false;
        }
        return true;
    }
}