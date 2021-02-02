<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Informacion Escuela</title>

<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
	<!--<p>${usuarioFirmado.grupo},</p>-->
	<%--
	<p>&iquest;Qu&eacute; deseas hacer?</p>
	<p><a href="/web-biblioteca/spring/libro/listar">Buscar libros</a></p>
	<p><a href="/web-biblioteca/spring/sesion/mostrar">Mostrar que hay en sesión</a></p> --%>
	<div style="position: absolute; top: 0; right: 0;"><a href="http://localhost:8080/Sige-WebApp/spring/login"><button>Cerrar sesion</button></a></div>
	<table>
      <tr>
        <td>
          <ul style="list-style-type:none">
            <li><a href="http://localhost:8080/Sige-WebApp/spring/gruposAlumno/listar">Grupo inscrito</a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/materiasAlumno/listar">Historial</a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Escuela/listara">Información de la escuela </a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Alumno/listar">Información personal</a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/bajaAlumno">Darme de baja</a></li>
          </ul>
        </td>
      </tr>
    </table>
    <p>Alumno ${usuarioFirmado.nombre} ${usuarioFirmado.apellido}</p>
    <table>
			<thead>
					<tr>
					<td>Num de Estudiantes</td>
					<td>${contadores[0]}</td>
					</tr>

					<tr>
					<td>Num de Profesores</td>
					<td>${contadores[1]}</td>
					</tr>

					<tr>
					<td>Num de Materias</td>
					<td>${contadores[3]}</td>
					</tr>

					<tr>
					<td>Num de Grupos</td>
					<td>${contadores[2]}</td>
					</tr>

					<tr>
					<td>Num de Salones</td>
					<td>${contadores[4]}</td>
					</tr>
					
			</thead>



		</table>
</body>
</html> 