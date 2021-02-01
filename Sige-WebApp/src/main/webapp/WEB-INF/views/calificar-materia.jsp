<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calificar Materias</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>	
	<div style="position: relative;">
	    <div style="position: absolute; top: 0; right: 0;"><a href="http://localhost:8080/Sige-WebApp/spring/login"><button>Cerrar sesion</button></a></div>
	</div>

    <p>Profesor ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf}</p>
    
    <table>
			<thead>
				<tr>
					<td>Num. cuenta</td>
					<td>Alumno</td>
					<td>Materia</td>
					<td>Grupo</td>
					<td>Estatus</td>
					<td>Calificacion Actual</td>
				</tr>
			</thead>

		<c:forEach var="alumnoMateriaCaliFirmado" items="${alumnoMateriasCaliFirmado}">
		<form:form method="POST" action="materiaCalificada" modelAttribute="caliMateriaForm">
			<tr>
				<td>${alumnoMateriaCaliFirmado.alumno.idAlumno}</td>
				<td>${alumnoMateriaCaliFirmado.alumno.nombre} ${alumnoMateriaCaliFirmado.alumno.apellido}</td>
				<td>${alumnoMateriaCaliFirmado.materiaHorario.materia.nombre}</td>
				<td>${alumnoMateriaCaliFirmado.materiaHorario.grupo.idGrupo}</td>
				<td>${alumnoMateriaCaliFirmado.alumno.estatus}</td>
				<td>${alumnoMateriaCaliFirmado.calificacion}</td>

				<td><form:radiobutton path="idAlumnoMaterias" value="${alumnoMateriaCaliFirmado.idAlumnoMaterias}"/></td>
				<td><form:label path="calificacion">Calificacion</form:label></td>
				<td><form:input path="calificacion" /></td>
				<td><form:errors path="calificacion" cssClass="error" /></td>
				<td colspan="2"><input type="submit" value="Calificar" /></td>
		
			</tr>
		</form:form>
		</c:forEach>


		</table>

</body>
</html>