/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jorge
 */
@Entity
public class ProfesoresMaterias implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_profesoresMaterias")
    private Integer idProfesoresMaterias;

    public ProfesoresMaterias() {
    }

    public ProfesoresMaterias(Integer idProfesoresMaterias) {
        this.idProfesoresMaterias = idProfesoresMaterias;
    }

    public Integer getIdProfesoresMaterias() {
        return idProfesoresMaterias;
    }

    public void setIdProfesoresMaterias(Integer idProfesoresMaterias) {
        this.idProfesoresMaterias = idProfesoresMaterias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idProfesoresMaterias);
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
        final ProfesoresMaterias other = (ProfesoresMaterias) obj;
        if (!Objects.equals(this.idProfesoresMaterias, other.idProfesoresMaterias)) {
            return false;
        }
        return true;
    }
    
    
    
}
