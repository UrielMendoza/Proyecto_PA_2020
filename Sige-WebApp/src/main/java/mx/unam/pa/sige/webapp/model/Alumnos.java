package mx.unam.pa.sige.webapp.model;

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
@Table(name="alumnos")
public class Alumnos {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_numCuenta")
    private Integer idAlumno;
	
	@Column(name="nombre")
	private String nombre;
    
	@Column(name="apellido")
    private String apellido;
    
	@Column(name="sexo")
    private String sexo;
    
    @Column(name="fechaNacAlum")
    private String fechaNac;
    
    @Column(name="promedio")
    private float promedio;
    
    @JoinColumn(name="id_grupo1",referencedColumnName="id_grupo",nullable=true)
    @ManyToOne(cascade = CascadeType.ALL)
    private Grupos grupo;
    
    @Column(name="estatus")
    private String estatus;
    
    @Column(name="generacion")
    private String generacion;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="cp")
    private String cp;
    
    @Column(name="telefono")
    private String telefono;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="passwords")
    private String password;
    
    @Override
    public String toString() {
        return "Alumnos{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechaNac=" + fechaNac + ", promedio=" + promedio + ", grupo=" + grupo + ", estatus=" + estatus + ", generacion=" + generacion + ", direccion=" + direccion + ", cp=" + cp + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

    public Alumnos() {
    }

    public Alumnos(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    public Alumnos(String correo, String nombre, String apellido, String telefono, String sexo, 
			String direccion, String cp, String fechaNac, String password, Grupos grupo) {
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.sexo = sexo;
		this.direccion = direccion;
		this.cp = cp;
		this.fechaNac = fechaNac;
		this.password = password;
		this.grupo = grupo;
		this.estatus = "alumno";
		this.generacion = "2021";
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Grupos getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getPassword() {
    	return password;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.idAlumno);
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
        final Alumnos other = (Alumnos) obj;
        if (!Objects.equals(this.idAlumno, other.idAlumno)) {
            return false;
        }
        return true;
    }
}