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
public class GruposSalon implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_gruposSalon")
    private Integer idGruposSalon;
    
    @JoinColumn(name="id_salon1",referencedColumnName="id_salon")
    @ManyToOne(cascade = CascadeType.ALL)
    private Salones salones;

    @Override
    public String toString() {
        return "GruposSalon{" + "idGruposSalon=" + idGruposSalon + ", salones=" + salones + '}';
    }
    
    

    public GruposSalon() {
    }

    public GruposSalon(Integer idGruposSalon) {
        this.idGruposSalon = idGruposSalon;
    }

    public Integer getIdGruposSalon() {
        return idGruposSalon;
    }

    public void setIdGruposSalon(Integer idGruposSalon) {
        this.idGruposSalon = idGruposSalon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idGruposSalon);
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
        final GruposSalon other = (GruposSalon) obj;
        if (!Objects.equals(this.idGruposSalon, other.idGruposSalon)) {
            return false;
        }
        return true;
    }
    
    
    
}
