/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

/**
 *
 * @author jorge
 */
@Entity
public class Alumnos implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_numCuenta")
    private Integer idAlumno;
//    
   
    
//   @JoinColumn(name="id_grupo1",referencedColumnName="id_grupo")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Grupos grupo;
//   
//   @OneToMany(mappedBy="alumnos")
//    private List<Asistencias> asistencias;
//   
//   @OneToMany(mappedBy="alumnos")
//    private List<AlumnoMaterias> alumnoMaterias;
    
    private String nombre;
    
    private String apellido;
    
    private String sexo;
    
    private int edad;
    
    private float promedio;
    
    private String estatus;
    
    private int generacion;

    @JoinColumn(name="id_contacto",referencedColumnName="id_contacto")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contacto contacto;

    @Override
    public String toString() {
        return "Alumnos{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", promedio=" + promedio + ", estatus=" + estatus + ", generacion=" + generacion + ", contacto=" + contacto + '}';
    }
    
    
    
    

    public Alumnos() {
    }

    public Alumnos(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

//    public List<AlumnoMaterias> getAlumnoMaterias() {
//        return alumnoMaterias;
//    }
//
//    public void setAlumnoMaterias(List<AlumnoMaterias> alumnoMaterias) {
//        this.alumnoMaterias = alumnoMaterias;
//    }

    
    
//    public Contacto getContacto() {
//        return contacto;
//    }
//
//    public void setContacto(Contacto contacto) {
//        this.contacto = contacto;
//    }

//    public Grupos getGrupo() {
//        return grupo;
//    }
//
//    public void setGrupo(Grupos grupo) {
//        this.grupo = grupo;
//    }
//
//    public List<Asistencias> getAsistencias() {
//        return asistencias;
//    }
//
//    public void setAsistencias(List<Asistencias> asistencias) {
//        this.asistencias = asistencias;
//    }

    
    
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idAlumno);
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
