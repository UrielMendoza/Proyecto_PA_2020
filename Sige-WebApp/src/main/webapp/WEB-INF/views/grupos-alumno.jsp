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
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Escuela/listara">Información de la escuela </a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Alumno/listar">Información personal</a></li>
          </ul>
        </td>        
      </tr>
    </table>
    <p>Grupo inscrito de ${usuarioFirmado.nombre} ${usuarioFirmado.apellido}</p>
	<p>Grupo: ${usuarioFirmado.grupo.idGrupo}</p>
	<p>Grado: ${usuarioFirmado.grupo.grado}</p>
    <table>
			<thead>
				<tr>
					<td>idMateriaHorarios</td>
					<td>materia</td>
					<td>profesor</td>
					<td>salon</td>
					<td>laboratorio</td>
					<td>horario</td>
					<td>dias</td>
				</tr>
			</thead>
		<c:forEach var="grupoAlumno" items="${gruposAlumno}">
			<tr>
				<td>${grupoAlumno.idMateriasHorarios}</td>
				<td>${grupoAlumno.materia.nombre}</td>
				<td>${grupoAlumno.profesor.nombreProf} ${grupoAlumno.profesor.apellidoProf}</td>
				<td>${grupoAlumno.salon.edificio}${grupoAlumno.salon.idSalon}</td>
				<td>${grupoAlumno.materia.laboratorio}</td>
				<td>${grupoAlumno.horario}</td>
				<td>${grupoAlumno.dias}</td>
			</tr>
		</c:forEach>
		</table>
		<a href="http://localhost:8080/Sige-WebApp/spring/cambiarGrupo"><button>Cambiar grupo</button></a>
</body>
</html>