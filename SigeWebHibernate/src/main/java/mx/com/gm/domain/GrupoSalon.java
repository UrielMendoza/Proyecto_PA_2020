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
public class GrupoSalon implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_gruposSalon")
    private Integer idGrupoSalon;

    public GrupoSalon() {
    }

    public GrupoSalon(Integer idGrupoSalon) {
        this.idGrupoSalon = idGrupoSalon;
    }

    public Integer getIdGrupoSalon() {
        return idGrupoSalon;
    }

    public void setIdGrupoSalon(Integer idGrupoSalon) {
        this.idGrupoSalon = idGrupoSalon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idGrupoSalon);
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
        final GrupoSalon other = (GrupoSalon) obj;
        if (!Objects.equals(this.idGrupoSalon, other.idGrupoSalon)) {
            return false;
        }
        return true;
    }
    
    
    
}
