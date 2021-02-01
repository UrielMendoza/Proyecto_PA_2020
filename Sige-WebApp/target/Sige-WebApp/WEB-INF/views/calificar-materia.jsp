<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calificar Materias</title>
</head>
<body>

    <p>Profesor ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf}</p>
    
    <table>
			<thead>
				<tr>
					<td>numCuenta</td>
					<td>alumno</td>
					<td>materia</td>
					<td>grupo</td>
					<td>estatus</td>
				</tr>
			</thead>
		<form:form method="POST" action="materiaCalificada" modelAttribute="caliMateriaForm">
		<c:forEach var="alumnoMateriaCaliFirmado" items="${alumnoMateriasCaliFirmado}">
			<tr>
				<td>${alumnoMateriaCaliFirmado.alumno.idAlumno}</td>
				<td>${alumnoMateriaCaliFirmado.alumno.nombre} ${alumnoMateriaCaliFirmado.alumno.apellido}</td>
				<td>${alumnoMateriaCaliFirmado.materiaHorario.materia.nombre}</td>
				<td>${alumnoMateriaCaliFirmado.materiaHorario.grupo.idGrupo}</td>
				<td>${alumnoMateriaCaliFirmado.alumno.estatus}</td>
				<td><form:radiobutton path="idAlumnoMaterias" value="${alumnoMateriaCaliFirmado.idAlumnoMaterias}"/></td>
				<td><form:label path="calificacion">Calificacion</form:label></td>
				<td><form:input path="calificacion" /></td>
				<td><form:errors path="calificacion" cssClass="error" /></td>
				<td colspan="2"><input type="submit" value="Calificar" /></td>
			</tr>
		</c:forEach>
		</form:form>
		</table>

</body>
</html>