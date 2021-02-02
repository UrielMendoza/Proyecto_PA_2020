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
  <a href="#" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Página princial</a>
  <a href="http://localhost:8080/Sige-WebApp/spring/login" class="w3-bar-item w3-button w3-hide-small w3-right w3-padding-large w3-hover-white" title="My Account">
    Cerrar Sesión
  </a>
 </div>
</div>

<c:choose>
	<c:when test="${usuarioFirmado['class'].name == 'mx.unam.pa.sige.webapp.model.Alumnos'}">
		<!-- Page Container -->
<div class="w3-container w3-content" style="max-width:1400px;margin-top:80px">    
  <!-- The Grid -->
  <div class="w3-row">
    <!-- Left Column -->
    <div class="w3-col m3">
      <!-- Profile -->
      <div class="w3-card w3-round w3-white">
        <div class="w3-container">
         <h4 class="w3-center">Mi perfil</h4>
         <p class="w3-center"><img src="https://www.w3schools.com/w3images/avatar3.png" class="w3-circle" style="height:106px;width:106px" alt="Avatar"></p>
         <hr>
         <p> ${usuarioFirmado.nombre} ${usuarioFirmado.apellido}</p>
        </div>
      </div>
      <br>
      
      <!-- Accordion -->
      <div class="w3-card w3-round">
        <div class="w3-white">
          <a href="http://localhost:8080/Sige-WebApp/spring/gruposAlumno/listar" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Grupo inscrito</button></a>
          
          <a href="http://localhost:8080/Sige-WebApp/spring/materiasAlumno/listar" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Historial</button></a>
          
          <a href="http://localhost:8080/Sige-WebApp/spring/Escuela/listara" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Información de la escuela </button></a>
          
          <a href="http://localhost:8080/Sige-WebApp/spring/Alumno/listar" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Información personal </button></a>
          
          <a href="http://localhost:8080/Sige-WebApp/spring/bajaAlumno" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Darme de baja </button></a>
          
        </div>      
      </div>
      <br>
    
    <!-- End Left Column -->
    </div>
    
    <!-- Middle Column -->
    <div class="w3-col m7">
    
      <div class="w3-row-padding">
        <div class="w3-col m12">
          <div class="w3-card w3-round w3-white">
            <div class="w3-container w3-padding">
<form:form method="POST" action="alumnoEditado" modelAttribute="formUserEdit">
			<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
			<%--form:errors path="*" cssClass="errorblock" element="div" --%>
				<p>
					<form:input class="w3-input" path="nombre" value="${usuarioFirmado.nombre}" />
					<form:label path="nombre">Nombre</form:label>
					<form:errors path="nombre" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="apellido" value ="${usuarioFirmado.apellido}"/>
					<form:label path="apellido">Apellido</form:label>
					<form:errors path="apellido" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="fechaNac" value="${usuarioFirmado.fechaNac}"/>
					<form:label path="fechaNac">Fecha de Nacimiento</form:label>
					<form:errors path="fechaNac" cssClass="error" /></td>
				</p>
				<p>
					<form:input class="w3-input" path="direccion" value="${usuarioFirmado.direccion}" />
					<form:label path="direccion">Dirección</form:label>
					<form:errors path="direccion" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="cp" value="${usuarioFirmado.cp}" />
					<form:label path="cp">C&oacute;digo Postal</form:label>
					<form:errors path="cp" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="correo" value="${usuarioFirmado.correo}" />
					<form:label path="correo">Correo</form:label>
					<form:errors path="correo" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="telefono" value="${usuarioFirmado.telefono}" />
					<form:label path="telefono">Tel&eacute;fono</form:label>
					<form:errors path="telefono" cssClass="error" />
				</p>
				<p>
					<input type="submit" class="w3-button w3-theme" value="Confirmar" />
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
		</c:when>
		<c:when test="${usuarioFirmado['class'].name == 'mx.unam.pa.sige.webapp.model.Profesores'}">
			<!-- Page Container -->
<div class="w3-container w3-content" style="max-width:1400px;margin-top:80px">    
  <!-- The Grid -->
  <div class="w3-row">
    <!-- Left Column -->
    <div class="w3-col m3">
      <!-- Profile -->
      <div class="w3-card w3-round w3-white">
        <div class="w3-container">
         <hr>
         <p> ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf}</p>
        </div>
      </div>
      <br>
      
      <!-- Accordion -->
      <div class="w3-card w3-round">
        <div class="w3-white">
          <a href="http://localhost:8080/Sige-WebApp/spring/materiasProfesor" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Materias impartidas</button></a>
          
          <a href="http://localhost:8080/Sige-WebApp/spring/Escuela/listarp" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Información de la escuela </button></a>
          
          <a href="http://localhost:8080/Sige-WebApp/spring/Profesor/listar" style="text-decoration: none"><button class="w3-button w3-block w3-theme-l1 w3-left-align">Información personal </button></a>
          
        </div>      
      </div>
      <br>
    
    <!-- End Left Column -->
    </div>
    
    <!-- Middle Column -->
    <div class="w3-col m7">
    
      <div class="w3-row-padding">
        <div class="w3-col m12">
          <div class="w3-card w3-round w3-white">
            <div class="w3-container w3-padding">
              <form:form method="POST" action="profesorEditado" modelAttribute="formUserEdit">
			<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
			<%--form:errors path="*" cssClass="errorblock" element="div" --%>
				<p>
					<form:input class="w3-input" path="nombre" value="${usuarioFirmado.nombreProf}" />
					<form:label path="nombre">Nombre</form:label>
					<form:errors path="nombre" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="apellido" value ="${usuarioFirmado.apellidoProf}"/>
					<form:label path="apellido">Apellido</form:label>
					<form:errors path="apellido" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="fechaNac" value="${usuarioFirmado.fechaNac}"/>
					<form:label path="fechaNac">Fecha de Nacimiento</form:label>
					<form:errors path="fechaNac" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="direccion" value="${usuarioFirmado.direccionProf}" />
					<form:label path="direccion">Dirección</form:label>
					<form:errors path="direccion" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="cp" value="${usuarioFirmado.cpProf}" />
					<form:label path="cp">C&oacute;digo Postal</form:label>
					<form:errors path="cp" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="correo" value="${usuarioFirmado.correoProf}" />
					<form:label path="correo">Correo</form:label>
					<form:errors path="correo" cssClass="error" />
				</p>
				<p>
					<form:input class="w3-input" path="telefono" value="${usuarioFirmado.telefonoProf}" />
					<form:label path="telefono">Tel&eacute;fono</form:label>
					<form:errors path="telefono" cssClass="error" />
				</p>
				<p>
					<input type="submit" class="w3-button w3-theme" value="Confirmar" />
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
		</c:when>
	</c:choose>

<footer class="w3-container w3-theme-d5">
  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
</footer>

</body>
</html> 