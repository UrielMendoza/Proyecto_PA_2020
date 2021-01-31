package mx.unam.pa.sige.webapp.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MateriaCalificarForm {
	
	@NotNull
	//@Pattern(regexp = "[0-9]{1,5}", message = "Número de cuenta. Solo números, longitud de 1 a 5 dígitos")
	private Integer idMateriaHorario;	
	
	public MateriaCalificarForm() {}
	
	public MateriaCalificarForm(Integer idMateriaHorario) {
		this.idMateriaHorario = idMateriaHorario;
	}
	
	public Integer getIdMateriaHorario() {
		return idMateriaHorario;
	}
	public void setIdMateriaHorario(Integer idMateriaHorario) {
		this.idMateriaHorario = idMateriaHorario;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MateriaCalificarForm [idMateriaHorario=").append(idMateriaHorario).append("]");
		return builder.toString();
	}
}
