/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author jorge
 */
@Entity
public class Grupos implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_grupo")
    private Integer idGrupos;
    
    private int grado;

    @Override
    public String toString() {
        return "Grupos{" + "idGrupos=" + idGrupos + ", grado=" + grado + '}';
    }
    
    

    public Grupos() {
    }

    public Grupos(Integer idGrupo) {
        this.idGrupos = idGrupo;
    }

    public Integer getIdGrupo() {
        return idGrupos;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupos = idGrupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idGrupos);
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
        final Grupos other = (Grupos) obj;
        if (!Objects.equals(this.idGrupos, other.idGrupos)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
}
