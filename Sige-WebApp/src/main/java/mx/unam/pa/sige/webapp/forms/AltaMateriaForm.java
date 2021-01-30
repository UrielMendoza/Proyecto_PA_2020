package mx.unam.pa.sige.webapp.forms;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

//import mx.unam.pa.sige.webapp.model.Grupos;

public class AltaMateriaForm {
	private static final String REGEX_SOLO_LETRAS = "^[\\pL\\pM\\p{Zs}.-]+$";
	
	private Integer idMateria;
	
	private String horario;
	
	private String dias;
	
	private Integer idGrupos;	

	
	private Integer idSalon;	

	
	public AltaMateriaForm() { }
	
	/**
	 * Constructor con argumentos
	 * @param correo
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 * @param sexo
	 * @param direccion
	 * @param cp
	 * @param fechaNac
	 */
	public AltaMateriaForm(Integer idMateria, String horario, String dias, Integer idGrupos, Integer idSalon) {
		this.idMateria = idMateria;
		this.horario = horario;
		this.dias = dias;
		this.idGrupos = idGrupos;
		this.idSalon = idSalon;
		
	}

	public Integer getIdMateria() {
		return idMateria;
	}
	
	public void setidMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getDias() {
		return dias;
	}
	
	public void setDias(String dias) {
		this.dias = dias;
	}
	
	public Integer getIdGrupos() {
		return idGrupos;
	}
	
	public void setIdGrupos(Integer idGrupos) {
		this.idGrupos = idGrupos;
	}
	
	public Integer getIdSalon() {
		return idSalon;
	}
	
	public void setIdSalon(Integer idSalon) {
		this.idSalon = idSalon;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AltaMateriaForm [idMateria=").append(idMateria).append(", idGrupo=").append(idGrupos).append(", idSalon=")
				.append(idSalon).append("]");
		return builder.toString();
	}
}
