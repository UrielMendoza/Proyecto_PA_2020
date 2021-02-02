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
	<div style="position: relative;">
	    <div style="position: absolute; top: 0; right: 0;"><a href="http://localhost:8080/Sige-WebApp/spring/login"><button>Inicio</button></a></div>
	</div>	
	<h2>Registro para profesores y alumnos</h2>
	<form:form method="POST" action="registroUsuario" modelAttribute="formUserRegistro">
		<%-- Si hay errores en la validación de la forma, se mostrarán en esta etiqueta --%>
		<%--form:errors path="*" cssClass="errorblock" element="div" --%>
		<table>
			<tr>
				<td><form:label path="nombre">Nombre</form:label></td>
				<td><form:input path="nombre" /></td>
				<td><form:errors path="nombre" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="apellido">Apellido</form:label></td>
				<td><form:input path="apellido" /></td>
				<td><form:errors path="apellido" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="fechaNac">Fecha de Nacimiento</form:label></td>
				<td><form:input path="fechaNac" /></td>
				<td><form:errors path="fechaNac" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Sexo</td>
				<td><form:radiobutton path="sexo" value="M"/>Masculino</td>
				<td><form:radiobutton path="sexo" value="F"/>Femenino</td>
			</tr>
			<tr>
				<td><form:label path="direccion">Dirección</form:label></td>
				<td><form:input path="direccion" /></td>
				<td><form:errors path="direccion" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="cp">C&oacute;digo Postal</form:label></td>
				<td><form:input path="cp" /></td>
				<td><form:errors path="cp" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="correo">Correo</form:label></td>
				<td><form:input path="correo" /></td>
				<td><form:errors path="correo" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="telefono">Tel&eacute;fono</form:label></td>
				<td><form:input path="telefono" /></td>
				<td><form:errors path="telefono" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Tipo de Usuario</td>
				<td><form:radiobutton path="tipoUsuario" value="A"/>Alumno</td>
				<td><form:radiobutton path="tipoUsuario" value="P"/>Profesor</td>
			</tr>
			<tr>
				<td><form:label path="password">Contraseña</form:label></td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<table>
			<thead>
				<tr>
					<td>Grupo</td>
					<td>Grado</td>
				</tr>
			</thead>
			<c:forEach var="grupoPrimeroFirmado" items="${gruposPrimeroFirmado}">
				<tr>
					<td><form:radiobutton path="idGrupo" value="${grupoPrimeroFirmado.idGrupo}"/>Grupo</td>
					<td>${grupoPrimeroFirmado.idGrupo}</td>
					<td>${grupoPrimeroFirmado.grado}</td>
					<!--  	
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
					<tr>
						<td>${materiaHorariosPrimeroFirmado.idMateriasHorarios}</td>
						<td>${materiaHorariosPrimeroFirmado.materia.nombre}</td>
						<td>${materiaHorariosPrimeroFirmado.profesor.nombreProf}</td>
						<td>${materiaHorariosPrimeroFirmado.salon.edificio}</td>
						<td>${materiaHorariosPrimeroFirmado.materia.laboratorio}</td>
						<td>${materiaHorariosPrimeroFirmado.horario}</td>
						<td>${materiaHorariosPrimeroFirmado.dias}</td>
					</tr>
					-->
				</tr>
			</c:forEach>
			</table>
			<tr>
				<td colspan="2"><input type="submit" value="Registrar" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>