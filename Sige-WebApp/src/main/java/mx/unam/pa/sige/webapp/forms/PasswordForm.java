package mx.unam.pa.sige.webapp.forms;
//import mx.unam.pa.sige.webapp.model.Grupos;

public class PasswordForm extends RegistroForm{
	private String tipoUsuario="A";
	
	private String password;
	
	public PasswordForm() {}

	public PasswordForm(String correo, String nombre, String apellido, String telefono, String sexo, 
			String direccion, String cp, String fechaNac, String nuevoPassword,Integer idGrupo, String estatus, String generacion) {
		super(correo, nombre, apellido, telefono, sexo, direccion, cp, fechaNac, idGrupo, estatus, generacion);
		this.password = nuevoPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PasswordForm [password=").append(password).append(", getCorreo()=")
				.append(getCorreo()).append(", getNombre()=").append(getNombre()).append(", getApellido()=")
				.append(getApellido()).append(", getTelefono()=")
				.append(getTelefono()).append("]");
		return builder.toString();
	}
}
