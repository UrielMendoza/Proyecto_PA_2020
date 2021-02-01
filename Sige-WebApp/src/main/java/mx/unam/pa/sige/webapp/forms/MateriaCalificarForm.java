package mx.unam.pa.sige.webapp.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MateriaCalificarForm {
	
	//@NotNull
	//@Pattern(regexp = "[0-9]{1,5}", message = "Número de cuenta. Solo números, longitud de 1 a 5 dígitos")
	private Integer idMateriaHorario;
	
	private Integer idAlumnoMaterias;
	
	private float calificacion;	
	
	
	
	public MateriaCalificarForm() {}
	
	public MateriaCalificarForm(Integer idMateriaHorario) {
		this.idMateriaHorario = idMateriaHorario;
	}
	
	public MateriaCalificarForm(Integer idAlumnoMaterias, float calificacion) {
		this.idAlumnoMaterias = idAlumnoMaterias;
		this.calificacion = calificacion;
	}
	
	public Integer getIdMateriaHorario() {
		return idMateriaHorario;
	}
	public void setIdMateriaHorario(Integer idMateriaHorario) {
		this.idMateriaHorario = idMateriaHorario;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MateriaCalificarForm [idMateriaHorario=").append(idMateriaHorario).append("]");
		return builder.toString();
	}
}
