/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author jorge
 */
@Entity
public class AlumnoMaterias implements Serializable {
    private static final long serialVersionUID=1L;
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_alumnoMaterias")
    private Integer idAlumnoMaterias;
    
    @JoinColumn(name="id_numCuenta1",referencedColumnName="id_numCuenta")
    @ManyToOne(cascade = CascadeType.ALL)
    private Alumnos alumno;
    
    @JoinColumn(name="id_materiasHorarios1",referencedColumnName="id_materiasHorarios")
    @ManyToOne(cascade = CascadeType.ALL)
    private MateriasHorarios materiaHorario;
    
    @Column(name="calificacion")
    private float calificacion;

    @Override
    public String toString() {
        return "AlumnoMaterias{" + "idAlumnoMaterias=" + idAlumnoMaterias + ", alumno=" + alumno + ", materiaHorario=" + materiaHorario + ", calificacion=" + calificacion + '}';
    }

   
    public AlumnoMaterias() {
    }

    public AlumnoMaterias(Integer id_alumnoMaterias) {
        this.idAlumnoMaterias = id_alumnoMaterias;
    }

    public Integer getIdAlumnoMaterias() {
        return idAlumnoMaterias;
    }

    public void setIdAlumnoMaterias(Integer idAlumnoMaterias) {
        this.idAlumnoMaterias = idAlumnoMaterias;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public MateriasHorarios getMateriaHorario() {
        return materiaHorario;
    }

    public void setMateriaHorario(MateriasHorarios materiaHorario) {
        this.materiaHorario = materiaHorario;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idAlumnoMaterias);
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
        final AlumnoMaterias other = (AlumnoMaterias) obj;
        if (!Objects.equals(this.idAlumnoMaterias, other.idAlumnoMaterias)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
