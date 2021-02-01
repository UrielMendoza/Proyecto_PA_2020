<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cambiar grupo</title>
<link href="../../css/estilo.css" rel="stylesheet">
</head>
<body>	
    <p>Grupo inscrito de ${usuarioFirmado.nombre} ${usuarioFirmado.apellido}</p>
	<p>Grupo: ${usuarioFirmado.grupo.idGrupo}</p>
	<p>Grado: ${usuarioFirmado.grupo.grado}</p>
	<h2>Grupos disponibles</h2>
	<form:form method="POST" action="grupoCambiado" modelAttribute="cambioGrupoFrm">
		<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
		<%--form:errors path="*" cssClass="errorblock" element="div" --%>
		<table>					 	
			<thead>
				<tr>
					<td>Grupo</td>
					<td>Grado</td>
				</tr>
			</thead>
			<c:forEach var="grupoDisponibleFirmado" items="${gruposDisponiblesFirmado}">
				<tr>
					<td><form:radiobutton path="idGrupo" value="${grupoDisponibleFirmado.idGrupo}"/></td>
					<td>${grupoDisponibleFirmado.idGrupo}</td>
					<td>${grupoDisponibleFirmado.grado}</td>
				</tr>
			</c:forEach>
			</table>
			<tr>
				<td colspan="2"><input type="submit" value="Cambiar" /></td>
			</tr>
		
	</form:form>
</body>
</html>