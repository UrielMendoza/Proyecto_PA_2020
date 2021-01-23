package mx.unam.pa.sige.webapp.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginForm {
	
	@NotNull
	//@Pattern(regexp = "[0-9]{1,5}", message = "Número de cuenta. Solo números, longitud de 1 a 5 dígitos")
	private Integer numCuenta;
	
	@NotNull
	//@Size(min = 2, max = 45, message = "Logintud requerida de 2 a 45 caracteres")
	private String password;
	
	private String tipoUsuario;
	
	public LoginForm() {}
	
	public LoginForm(Integer numCuenta, String password, String tipoUsuario) {
		this.numCuenta = numCuenta;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
	}
	
	public Integer getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(Integer numCuenta) {
		this.numCuenta = numCuenta;
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
		builder.append("LoginFrm [correo=").append(numCuenta).append(", passwd=").append(password).append("]");
		return builder.toString();
	}
}
