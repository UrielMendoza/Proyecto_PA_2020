package mx.unam.pa.sige.webapp.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesores")
public class Profesores {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_numCuentaProf")
    private Integer idProf;
    
	@Column(name="nombreProf")
    private String nombreProf;
    
	@Column(name="apellidoProf")
    private String apellidoProf;
    
	@Column(name="sexoProf")
    private String sexoProf;
    
    @Column(name="fechaNacProf")
    private String fechaNac;
    
	@Column(name="direccionProf")
    private String direccionProf;
    
	@Column(name="cpProf")
    private String cpProf;
    
	@Column(name="telefonoProf")
    private String telefonoProf;
    
	@Column(name="correoProf")
    private String correoProf;
    
    @Column(name="passwords")
    private String password;

    @Override
    public String toString() {
        return "Profesores{" + "idProf=" + idProf + ", nombreProf=" + nombreProf + ", apellidoProf=" + apellidoProf + ", sexoProf=" + sexoProf + ", fechaNac=" + fechaNac + ", direccionProf=" + direccionProf + ", cpProf=" + cpProf + ", telefonoProf=" + telefonoProf + ", correoProf=" + correoProf + '}';
    }

    
    public Profesores() {
    }

    public Profesores(Integer idProf) {
        this.idProf = idProf;
    }
    
    public Profesores(String correoProf, String nombreProf, String apellidoProf, String telefonoProf, 
    		String sexoProf, String direccionProf, String cpProf, String fechaNac, String password) {
		this.correoProf = correoProf;
		this.nombreProf = nombreProf;
		this.apellidoProf = apellidoProf;
		this.telefonoProf = telefonoProf;
		this.sexoProf = sexoProf;
		this.direccionProf = direccionProf;
		this.cpProf = cpProf;
		this.fechaNac = fechaNac;
		this.password = password;
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

    public String getCpProf() {
        return cpProf;
    }

    public void setCpProf(String cpProf) {
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

    public void setPassword(String password) {
    	this.password = password;
    }
    
    public String getPassword() {
    	return password;
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