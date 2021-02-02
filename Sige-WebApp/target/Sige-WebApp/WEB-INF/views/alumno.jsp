<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Informacion Alumno</title>

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
	<!--<p>${usuarioFirmado.grupo},</p>-->
	<%--
	<p>&iquest;Qu&eacute; deseas hacer?</p>
	<p><a href="/web-biblioteca/spring/libro/listar">Buscar libros</a></p>
	<p><a href="/web-biblioteca/spring/sesion/mostrar">Mostrar que hay en sesión</a></p> --%>
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
					<td>Num Cuenta</td>
					<td>${alumnos.idAlumno}</td>
					</tr>
					
					<tr>
					<td>Nombre</td>
					<td>${alumnos.nombre}</td>
					</tr>
					
					<tr>
					<td>Apellido</td>
					<td>${alumnos.apellido}</td>
					</tr>
					
					<tr>
					<td>Fecha de nacimiento </td>
					<td>${alumnos.fechaNac}</td>
					</tr>
					
					<tr>
					<td>Sexo</td>
					<td>${alumnos.sexo}</td>
					</tr>
					
					<tr>
					<td>Grupo</td>
<<<<<<< HEAD
					<td>${usuarioFirmado.grupo.idGrupo}</td>
=======
					<td>${alumnos.grupo.idGrupo}</td>
>>>>>>> 8dc009f3dda818512ae69b41aa304e5f15771c33
					</tr>
					
					<tr>
					<td>Grado</td>
					<td>${alumnos.grupo.grado}</td>
					</tr>
					
					<tr>
					<td>Promedio</td>
					<td>${alumnos.promedio}</td>
					</tr>
					
					<tr>
					<td>Estatus</td>
					<td>${alumnos.estatus}</td>
					</tr>
					
					<tr>
					<td>Generacion</td>
					<td>${alumnos.generacion}</td>
					</tr>
					
					<tr>
					<td>Correo</td>
					<td>${alumnos.correo}</td>
					</tr>
					
					<tr>
					<td>Telefono</td>
					<td>${alumnos.telefono}</td>
					</tr>
					
					<tr>
					<td>Direccion</td>
					<td>${alumnos.direccion}</td>
					</tr>
					
					<tr>
					<td>CP</td>
					<td>${alumnos.cp}</td>
					</tr>
					
					<tr>
						<td><a href="http://localhost:8080/Sige-WebApp/spring/Alumno/editarAlumno"><button>Editar</button></a></td>
					</tr>
					
			</thead>
		
			
		
		</table>
</body>
</html>