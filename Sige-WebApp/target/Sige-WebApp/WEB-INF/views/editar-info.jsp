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
	<h2>Editar información de usuario</h2>
	<c:choose>
	<c:when test="${usuarioFirmado['class'].name == 'mx.unam.pa.sige.webapp.model.Alumnos'}">
		<form:form method="POST" action="alumnoEditado" modelAttribute="formUserEdit">
			<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
			<%--form:errors path="*" cssClass="errorblock" element="div" --%>
			<table>
				<tr>
					<td><form:label path="nombre">Nombre</form:label></td>
					<td><form:input path="nombre" value="${usuarioFirmado.nombre}" /></td>
					<td><form:errors path="nombre" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="apellido">Apellido</form:label></td>
					<td><form:input path="apellido" value ="${usuarioFirmado.apellido}"/></td>
					<td><form:errors path="apellido" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="fechaNac">Fecha de Nacimiento</form:label></td>
					<td><form:input path="fechaNac" value="${usuarioFirmado.fechaNac}"/></td>
					<td><form:errors path="fechaNac" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="direccion">Dirección</form:label></td>
					<td><form:input path="direccion" value="${usuarioFirmado.direccion}" /></td>
					<td><form:errors path="direccion" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="cp">C&oacute;digo Postal</form:label></td>
					<td><form:input path="cp" value="${usuarioFirmado.cp}" /></td>
					<td><form:errors path="cp" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="correo">Correo</form:label></td>
					<td><form:input path="correo" value="${usuarioFirmado.correo}" /></td>
					<td><form:errors path="correo" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="telefono">Tel&eacute;fono</form:label></td>
					<td><form:input path="telefono" value="${usuarioFirmado.telefono}" /></td>
					<td><form:errors path="telefono" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Confirmar" /></td>
				</tr>
			</table>
		</form:form>
		</c:when>
		<c:when test="${usuarioFirmado['class'].name == 'mx.unam.pa.sige.webapp.model.Profesores'}">
			<form:form method="POST" action="profesorEditado" modelAttribute="formUserEdit">
			<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
			<%--form:errors path="*" cssClass="errorblock" element="div" --%>
			<table>
				<tr>
					<td><form:label path="nombre">Nombre</form:label></td>
					<td><form:input path="nombre" value="${usuarioFirmado.nombreProf}" /></td>
					<td><form:errors path="nombre" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="apellido">Apellido</form:label></td>
					<td><form:input path="apellido" value ="${usuarioFirmado.apellidoProf}"/></td>
					<td><form:errors path="apellido" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="fechaNac">Fecha de Nacimiento</form:label></td>
					<td><form:input path="fechaNac" value="${usuarioFirmado.fechaNac}"/></td>
					<td><form:errors path="fechaNac" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="direccion">Dirección</form:label></td>
					<td><form:input path="direccion" value="${usuarioFirmado.direccionProf}" /></td>
					<td><form:errors path="direccion" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="cp">C&oacute;digo Postal</form:label></td>
					<td><form:input path="cp" value="${usuarioFirmado.cpProf}" /></td>
					<td><form:errors path="cp" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="correo">Correo</form:label></td>
					<td><form:input path="correo" value="${usuarioFirmado.correoProf}" /></td>
					<td><form:errors path="correo" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="telefono">Tel&eacute;fono</form:label></td>
					<td><form:input path="telefono" value="${usuarioFirmado.telefonoProf}" /></td>
					<td><form:errors path="telefono" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Confirmar" /></td>
				</tr>
			</table>
		</form:form>
		</c:when>
	</c:choose>
</body>
</html>