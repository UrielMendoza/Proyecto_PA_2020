<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<title>Home de usuario</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue-grey.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html, body, h1, h2, h3, h4, h5 {font-family: "Open Sans", sans-serif}
</style>
<body class="w3-theme-l5">

<!-- Navbar -->
<div class="w3-top">
 <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
  <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2"><i class="fa fa-bars"></i></a>
  <a href="#" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="w3-margin-right"></i>Inicio de sesión</a>
 </div>
</div>

<!-- Page Container -->
<div class="w3-container w3-content" style="max-width:1400px;margin-top:80px">    
  <!-- The Grid -->
  <div class="w3-row">
    <!-- Left Column -->
    <div class="w3-col m3">
    
    <!-- End Left Column -->
    </div>
    
    <!-- Middle Column -->
    <div class="w3-col m7">
    
      <div class="w3-row-padding">
        <div class="w3-col m12">
          <div class="w3-card w3-round w3-white">
            <div class="w3-container w3-padding">
    <h2>Registro para profesores y alumnos</h2>
	<form:form method="POST" action="registroUsuario" modelAttribute="formUserRegistro">
		<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
		<%--form:errors path="*" cssClass="errorblock" element="div" --%>
			<p>
            	<form:input class="w3-input" style="width:90%" path="nombre" />
				<form:label path="nombre">Nombre</form:label>
				<form:errors path="nombre" cssClass="error" />
			</p>
			<p>
            	<form:input class="w3-input" style="width:90%" path="apellido" />
				<form:label path="apellido">Apellido</form:label>
				<form:errors path="apellido" cssClass="error" />
			</p>
			<p>
            	<form:input class="w3-input" style="width:90%" path="fechaNac" />
				<form:label path="fechaNac">Fecha de Nacimiento</form:label>
				<form:errors path="fechaNac" cssClass="error" />
			</p>
            <table>
			<tr>
				<td>Sexo</td>
				<td><form:radiobutton  path="sexo" value="M"/>Masculino</td>
				<td><form:radiobutton  path="sexo" value="F"/>Femenino</td>
			</tr>
            </table>
			<p>
            	<form:input class="w3-input" style="width:90%" path="direccion" />
				<form:label path="direccion">Dirección</form:label>
				<form:errors path="direccion" cssClass="error" />
			</p>
			<p>
            	<form:input class="w3-input" style="width:90%" path="cp" />
				<form:label path="cp">C&oacute;digo Postal</form:label>
				<form:errors path="cp" cssClass="error" />
			</p>
			<p>
            	<form:input class="w3-input" style="width:90%" path="correo" />
				<form:label path="correo">Correo</form:label>
				<form:errors path="correo" cssClass="error" />
			</p>
			<p>
            	<form:input class="w3-input" style="width:90%" path="telefono" />
				<form:label path="telefono">Tel&eacute;fono</form:label>
				<form:errors path="telefono" cssClass="error" />
			</p>
            <table>
			<tr>
				<td>Tipo de Usuario</td>
				<td><form:radiobutton path="tipoUsuario" value="A"/>Alumno</td>
				<td><form:radiobutton path="tipoUsuario" value="P"/>Profesor</td>
			</tr>
            </table>
			<p>
            	<form:input class="w3-input" type="password" style="width:90%" path="password" />
				<form:label path="password">Contraseña</form:label>
				<form:errors path="password" cssClass="error" />
			</p>
			<table>
			<thead>
				<tr>
					<td>Grupo</td>
					<td>Grado</td>
				</tr>
			</thead>
			<c:forEach var="grupoPrimeroFirmado" items="${gruposPrimeroFirmado}">
				<tr>
					<td><form:radiobutton path="idGrupo" value="${grupoPrimeroFirmado.idGrupo}"/>Grupo</td>
					<td>${grupoPrimeroFirmado.idGrupo}</td>
					<td>${grupoPrimeroFirmado.grado}</td>
				</tr>
			</c:forEach>
			</table>
			<p>
				<input type="submit" class="w3-button w3-theme" value="Registrar" />
			</p>
	</form:form>
            </div>
          </div>
        </div>
      </div>
      
    <!-- End Middle Column -->
    
    
  <!-- End Grid -->
  </div>
  
<!-- End Page Container -->
</div>
<br>

<footer class="w3-container w3-theme-d5">
  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
</footer>

</body>
</html>  