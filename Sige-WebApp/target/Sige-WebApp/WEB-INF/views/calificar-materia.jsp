<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calificar Materias</title>
</head>
<body>
	<!--<p>${usuarioFirmado.grupo},</p>-->
	<%--
	<p>&iquest;Qu&eacute; deseas hacer?</p>
	<p><a href="/web-biblioteca/spring/libro/listar">Buscar libros</a></p>
	<p><a href="/web-biblioteca/spring/sesion/mostrar">Mostrar que hay en sesión</a></p> --%>
    </table>
    <p>Profesor ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf}</p>
    <p>Materia ${alumnoMateriasCaliFirmado.materiaHorario.materia.nombre}</p>
    <table>
			<thead>
				<tr>
					<td>alumno</td>
				</tr>
			</thead>
		<c:forEach var="alumnoMateriaCaliFirmado" items="${alumnoMateriasCaliFirmado}">
			<tr>
				<td>${alumnoMateriaCaliFirmado.alumno.idAlumno}</td>
				<td>${alumnoMateriaCaliFirmado.alumno.nombre}</td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>