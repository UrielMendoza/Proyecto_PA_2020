/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.pa.sige.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author jorge
 */
@Data
@Entity
@Table(name = "materias")
public class Materias implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_materia")
    private Integer idMateria;
    
    @Column(name="nombreMateria")
    private String nombre;
    
    private String descripcion;
    
    private String laboratorio;

//    @Override
//    public String toString() {
//        return "Materias{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", laboratorio=" + laboratorio + '}';
//    }
//
//
//    public Materias() {
//    }
//
//    public Materias(Integer idMateria) {
//        this.idMateria = idMateria;
//    }
//
//    public Integer getIdMateria() {
//        return idMateria;
//    }
//
//    public void setIdMateria(Integer idMateria) {
//        this.idMateria = idMateria;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public String getLaboratorio() {
//        return laboratorio;
//    }
//
//    public void setLaboratorio(String laboratorio) {
//        this.laboratorio = laboratorio;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    
//    
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 67 * hash + Objects.hashCode(this.idMateria);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Materias other = (Materias) obj;
//        if (!Objects.equals(this.idMateria, other.idMateria)) {
//            return false;
//        }
//        return true;
//    }
    
    
    
    
}
