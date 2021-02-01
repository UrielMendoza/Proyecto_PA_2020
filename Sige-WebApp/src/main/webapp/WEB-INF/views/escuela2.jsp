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
	
	<table>
      <tr>
        <td>
          <ul style="list-style-type:none">
            <li><a href="http://localhost:8080/Sige-WebApp/spring/materiasProfesor">Materias impartidas</a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Profesor/listar">Información personal</a></li>
          </ul>
        </td>
        <td><!-- Desplegar tabla de alumnos --></td>
      </tr>
    </table>
    <p>Profesor ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf},</p>
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
		<a href="http://localhost:8080/Sige-WebApp/spring/login"><button>CERRAR SESION </button></a>
</body>
</html>