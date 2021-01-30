<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro de usuario</title>
<link href="../../css/estilo.css" rel="stylesheet">
</head>
<body>
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
				<td colspan="2"><input type="submit" value="Registrar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>