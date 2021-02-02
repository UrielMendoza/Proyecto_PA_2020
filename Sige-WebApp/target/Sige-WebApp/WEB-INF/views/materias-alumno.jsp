<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <a href="http://localhost:8080/Sige-WebApp/spring/Alumno/homeAlumno" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Página princial</a>
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
<table>
			<thead>
				<tr>
					<td>idAlumnoMaterias</td>
					<td>alumno</td>
					<td>grupo</td>
					<td>grado</td>
					<td>idMateriasHorarios</td>
					<td>materia</td>
					<td>profesor</td>
					<!--<td>laboratorio</td>
					<td>horario</td>
					<td>dias</td>
					<td>idSalon</td>  -->
					<td>calificacion</td>
				</tr>
			</thead>
		<c:forEach var="alumnoMateria" items="${alumnoMaterias}">
			<tr>
				<td>${alumnoMateria.idAlumnoMaterias}</td>
				<td>${alumnoMateria.alumno.nombre} ${alumnoMateria.alumno.apellido}</td>			
				<td>${alumnoMateria.alumno.grupo.idGrupo}</td>
				<td>${alumnoMateria.alumno.grupo.grado}</td>
				<td>${alumnoMateria.materiaHorario.idMateriasHorarios}</td>
				<td>${alumnoMateria.materiaHorario.materia.nombre}</td>
				<td>${alumnoMateria.materiaHorario.profesor.nombreProf} ${alumnoMateria.materiaHorario.profesor.apellidoProf}</td>
				<!--<td>${alumnoMateria.materiaHorario.materia.laboratorio}</td>
				<td>${alumnoMateria.materiaHorario.horario}</td>
				<td>${alumnoMateria.materiaHorario.dias}</td>				
				<td>${alumnoMateria.materiaHorario.salon.idSalon}</td>-->
				<td>${alumnoMateria.calificacion}</td>
			</tr>
		</c:forEach>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td>Promedio actual: ${promedio}</td>
		</table>
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