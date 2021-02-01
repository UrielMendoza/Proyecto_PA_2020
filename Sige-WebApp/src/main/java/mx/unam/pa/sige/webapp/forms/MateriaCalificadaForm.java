package mx.unam.pa.sige.webapp.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MateriaCalificadaForm {
	
	//@NotNull
	//@Pattern(regexp = "[0-9]{1,5}", message = "Número de cuenta. Solo números, longitud de 1 a 5 dígitos")
	private float calificacion;	
	
	public MateriaCalificadaForm() {}
	
	public MateriaCalificadaForm(float calificacion) {
		this.calificacion = calificacion;
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
		builder.append("MateriaCalificadaForm [calificacion=").append(calificacion).append("]");
		return builder.toString();
	}
}
