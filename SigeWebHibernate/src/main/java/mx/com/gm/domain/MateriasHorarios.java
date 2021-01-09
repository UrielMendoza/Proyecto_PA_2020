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
public class MateriasHorarios implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_materiasHorarios")
    private Integer idMateriasHorarios;
    
    private String horario;
    
    private String dias;

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
