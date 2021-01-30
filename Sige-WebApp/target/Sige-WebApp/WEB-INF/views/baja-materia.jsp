<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Baja materia</title>
<link href="../../css/estilo.css" rel="stylesheet">
</head>
<body>
	<p>Materias del profesor ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf},</p>
	<form:form method="POST" action="materiaBaja" modelAttribute="bajaMateriaFrm">
		 <table>
			<thead>
				<tr>
					<td>idMateriaHorarios</td>
					<td>materia</td>
					<td>grupo</td>
					<td>profesor</td>
					<td>salon</td>
					<td>laboratorio</td>
					<td>horario</td>
					<td>dias</td>
				</tr>
			</thead>
		<c:forEach var="profesorMateriaFirmado" items="${profesorMateriasFirmado}">
			<tr>
				<td><form:radiobutton path="idMateriasHorarios" value="${profesorMateriaFirmado.idMateriasHorarios}"/></td>
				<td>${profesorMateriaFirmado.idMateriasHorarios}</td>
				<td>${profesorMateriaFirmado.materia.nombre}</td>
				<td>${profesorMateriaFirmado.grupo.idGrupo}</td>
				<td>${profesorMateriaFirmado.profesor.nombreProf} ${profesorMateriaFirmado.profesor.apellidoProf}</td>
				<td>${profesorMateriaFirmado.salon.edificio}${profesorMateriaFirmado.salon.idSalon}</td>
				<td>${profesorMateriaFirmado.materia.laboratorio}</td>
				<td>${profesorMateriaFirmado.horario}</td>
				<td>${profesorMateriaFirmado.dias}</td>
			</tr>
		</c:forEach>
		</table>
		<tr>
			<td colspan="2"><input type="submit" value="Baja" /></td>
		</tr>
	</form:form>
</body>
</html>