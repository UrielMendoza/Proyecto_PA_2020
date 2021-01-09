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
public class MateriasGrupo implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_materiasGrupo")
    private Integer idMateriaGrupo;

    public MateriasGrupo() {
    }

    public MateriasGrupo(Integer idMateriaGrupo) {
        this.idMateriaGrupo = idMateriaGrupo;
    }

    public Integer getIdMateriaGrupo() {
        return idMateriaGrupo;
    }

    public void setIdMateriaGrupo(Integer idMateriaGrupo) {
        this.idMateriaGrupo = idMateriaGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idMateriaGrupo);
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
        final MateriasGrupo other = (MateriasGrupo) obj;
        if (!Objects.equals(this.idMateriaGrupo, other.idMateriaGrupo)) {
            return false;
        }
        return true;
    }
    
    
    
}
