/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import org.hibernate.annotations.Type;

/**
 *
 * @author jorge
 */
@Entity
public class Asistencias implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_asistencia")
    private Integer idAsistencias;
    
    @Column(name="fecha")
    @Type(type="timestamp")
    private Date fecha;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
