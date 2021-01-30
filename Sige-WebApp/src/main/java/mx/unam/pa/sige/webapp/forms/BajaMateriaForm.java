package mx.unam.pa.sige.webapp.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BajaMateriaForm {
	
	@NotNull
	//@Pattern(regexp = "[0-9]{1,5}", message = "Número de cuenta. Solo números, longitud de 1 a 5 dígitos")
	private Integer idMateriasHorarios;	
	
	public BajaMateriaForm() {}
	
	public BajaMateriaForm(Integer idMateriasHorarios) {
		this.idMateriasHorarios = idMateriasHorarios;
	}
	
	public Integer getIdMateriasHorarios() {
		return idMateriasHorarios;
	}
	public void setIdMateriasHorarios(Integer idMateriasHorarios) {
		this.idMateriasHorarios = idMateriasHorarios;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BajaMateriaForm [idMateriasHorarios=").append(idMateriasHorarios).append("]");
		return builder.toString();
	}
}
