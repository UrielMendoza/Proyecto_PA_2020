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
            <li><a href="http://localhost:8080/Sige-WebApp/spring/materiasProfesor/listar">Materias impartidas</a></li>
            <li><a href="#">Información de la escuela </a></li>
          </ul>
        </td>        
      </tr>
    </table>
    <p>Profesor ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf},</p>
    <table>
			<thead>
					<tr>
					<td>Num Cuenta</td>
					<td>${profesor.idProf}</td>
					</tr>
					
					<tr>
					<td>Nombre</td>
					<td>${profesor.nombreProf}</td>
					</tr>
					
					<tr>
					<td>Apellido</td>
					<td>${profesor.apellidoProf}</td>
					</tr>
					
					<tr>
					<td>Fecha de nacimiento </td>
					<td>${profesor.fechaNac}</td>
					</tr>
					
					<tr>
					<td>Sexo</td>
					<td>${profesor.sexoProf}</td>
					</tr>
					
					
					<tr>
					<td>Correo</td>
					<td>${profesor.correoProf}</td>
					</tr>
					
					<tr>
					<td>Telefono</td>
					<td>${profesor.telefonoProf}</td>
					</tr>
					
					<tr>
					<td>Direccion</td>
					<td>${profesor.direccionProf}</td>
					</tr>
					
					<tr>
					<td>CP</td>
					<td>${profesor.cpProf}</td>
					</tr>
					
			</thead>
		
			
		
		</table>
</body>
</html>