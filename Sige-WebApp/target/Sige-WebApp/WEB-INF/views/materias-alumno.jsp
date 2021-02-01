<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Materias Alumno</title>
</head>
<body>
	<!--<p>${usuarioFirmado.grupo},</p>-->
	<%--
	<p>&iquest;Qu&eacute; deseas hacer?</p>
	<p><a href="/web-biblioteca/spring/libro/listar">Buscar libros</a></p>
	<p><a href="/web-biblioteca/spring/sesion/mostrar">Mostrar que hay en sesión</a></p> --%>
	<table>
      <tr>
        <td>
          <ul style="list-style-type:none">
            <li><a href="http://localhost:8080/Sige-WebApp/spring/gruposAlumno/listar">Grupo inscrito</a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/materiasAlumno/listar">Historial</a></li>
            <li><a href="#">Información de la escuela </a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Alumno/listar">Información personal</a></li>
          </ul>
        </td>        
      </tr>
    </table>
    <p>Materias de ${usuarioFirmado.nombre} ${usuarioFirmado.apellido},</p>
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
		</table>
</body>
</html>