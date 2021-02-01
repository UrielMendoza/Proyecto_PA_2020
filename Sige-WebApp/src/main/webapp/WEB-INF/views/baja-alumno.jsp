<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Baja Alumno</title>
<link href="../../css/estilo.css" rel="stylesheet">
</head>
<body>
	<div style="position: relative;">
	    <div style="position: absolute; top: 0; right: 0;"><a href="http://localhost:8080/Sige-WebApp/spring/login"><button>Cerrar sesion</button></a></div>
	</div>
	<p>Dar de baja ${usuarioFirmado.nombre} ${usuarioFirmado.apellido},</p>	
	<form:form method="POST" action="alumnoBaja">	
		<tr>
			<td colspan="2"><input type="submit" value="Baja" /></td>
		</tr>
	</table>
	</form:form>
</body>
</html>