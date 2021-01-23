package mx.unam.pa.sige.webapp.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;

public class RegistroForm {
	private static final String REGEX_SOLO_LETRAS = "^[\\pL\\pM\\p{Zs}.-]+$";

	@NotNull(message = "Correo electrónico requerido")
	@Email(message = "Correo inválido")
	private String correo;
	
	/**
	 * Expresión regular para validar que la cadena sean letras de la A a la Z incluyendo ñ y acentos
	 */
	@Pattern(regexp = REGEX_SOLO_LETRAS, message = "Nombre requerido. Solo letras")
	private String nombre;
	
	private String sexo = "M";
	
	//@Pattern(regexp = REGEX_SOLO_LETRAS, message = "Fecha requerida")
	private String fechaNac;
	
	private String direccion;
	
	@NotNull
	//@Pattern(regexp = "[0-9]{5}", message = "Código Postal. 5 dígitos")
	private String cp;
	
	@Pattern(regexp = REGEX_SOLO_LETRAS, message = "Apellido. Solo letras")
	private String apellido;
	
	@Pattern(regexp = "[0-9]{8,10}", message = "Teléfono. Solo números, longitud de 8 a 10 dígitos")
	private String telefono;
	
	
	/**
	 * Constructor sin argumentos
	 */
	public RegistroForm() { }
	
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
	public RegistroForm(String correo, String nombre, String apellido, String telefono, String sexo, 
			String direccion, String cp, String fechaNac) {
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.sexo = sexo;
		this.direccion = direccion;
		this.cp = cp;
		this.fechaNac = fechaNac;
	}

	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}

	public String getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	public String getCp() {
		return cp;
	}
	
	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegistroFrm [correo=").append(correo).append(", nombre=").append(nombre).append(", apellido=")
				.append(apellido).append(", apMaterno=").append(telefono).append("]");
		return builder.toString();
	}
}
