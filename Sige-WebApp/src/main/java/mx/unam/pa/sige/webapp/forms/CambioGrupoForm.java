package mx.unam.pa.sige.webapp.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CambioGrupoForm {
	
	@NotNull
	//@Pattern(regexp = "[0-9]{1,5}", message = "Número de cuenta. Solo números, longitud de 1 a 5 dígitos")
	private Integer idGrupo;	
	
	public CambioGrupoForm() {}
	
	public CambioGrupoForm(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	public Integer getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginFrm [idGrupo=").append(idGrupo).append("]");
		return builder.toString();
	}
}
