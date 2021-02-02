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
  <a href="http://localhost:8080/Sige-WebApp/spring/Profesor/homeProfesor" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Página princial</a>
  <a href="http://localhost:8080/Sige-WebApp/spring/login" class="w3-bar-item w3-button w3-hide-small w3-right w3-padding-large w3-hover-white" title="My Account">
    Cerrar Sesión
  </a>
 </div>
</div>

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
              <h2>Alta de materia</h2>
	<form:form method="POST" action="materiaRegistrada" modelAttribute="altaMateriaFrm">
		<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
		<%--form:errors path="*" cssClass="errorblock" element="div" --%>
		<td>Materias</td>
		<table>
			<thead>
				<tr>
					<td>materia</td>
					<td>laboratorio</td>
				</tr>
			</thead>
			    <c:forEach var="materiaDisponiblesFirmado" items="${materiasDisponiblesFirmado}">
				<tr>
					<td><form:radiobutton path="idMateria" value="${materiaDisponiblesFirmado.idMateria}"/></td>
					<td>${materiaDisponiblesFirmado.nombre}</td>
					<td>${materiaDisponiblesFirmado.laboratorio}</td>
				</tr>
			</c:forEach>
		</table>

		<td>Grupos</td>
		<table>
			<thead>
				<tr>
					<td>Grupo</td>
					<td>Grado</td>
				</tr>
			</thead>
			    <c:forEach var="grupoDisponiblesFirmado" items="${gruposDisponiblesFirmado}">
				<tr>
					<td><form:radiobutton path="idGrupos" value="${grupoDisponiblesFirmado.idGrupo}"/></td>
					<td>${grupoDisponiblesFirmado.idGrupo}</td>
					<td>${grupoDisponiblesFirmado.grado}</td>
				</tr>
			</c:forEach>
		</table>
		
		<td>Salones</td>
		<table>
			<thead>
				<tr>
					<td>Salon</td>
					<td>Edificio</td>
					<td>Laboratorio</td>
					<td>Cupo</td>
				</tr>
			</thead>
			    <c:forEach var="salonDisponiblesFirmado" items="${salonesDisponiblesFirmado}">
				<tr>
					<td><form:radiobutton path="idSalon" value="${salonDisponiblesFirmado.idSalon}"/></td>
					<td>${salonDisponiblesFirmado.idSalon}</td>
					<td>${salonDisponiblesFirmado.edificio}</td>
					<td>${salonDisponiblesFirmado.laboratorio}</td>
					<td>${salonDisponiblesFirmado.cupo}</td>
				</tr>
			</c:forEach>
		</table>
		
		<td>Horario</td>
		<table>	
			<tr>
				<td><form:radiobutton path="horario" value="7:00-8:30"/></td>
				<td>7:00-8:30</td>
				<td><form:radiobutton path="horario" value="8:30-10:00"/></td>
				<td>8:30-10:00</td>
				<td><form:radiobutton path="horario" value="10:00-11:30"/></td>
				<td>10:00-11:30</td>
				<td><form:radiobutton path="horario" value="11:30-13:00"/></td>
				<td>11:30-13:00</td>
			</tr>
		</table>
		
		<td>Dias</td>
		<table>	
			<tr>
				<td><form:radiobutton path="dias" value="L-M-V"/></td>
				<td>L-M-V</td>
				<td><form:radiobutton path="dias" value="M-J"/></td>
				<td>M-J</td>
			</tr>
		</table>
			
			<tr>
				<td colspan="2"><input type="submit" class="w3-button w3-theme" value="Registrar" /></td>
			</tr>
		</table>
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