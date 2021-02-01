<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Materias Profesor</title>
<link href="../../css/estilo.css" rel="stylesheet">
</head>
<body>
	<table>
      <tr>
        <td>
          <ul style="list-style-type:none">
            <li><a href="http://localhost:8080/Sige-WebApp/spring/materiasProfesor/listar">Materias impartidas</a></li>
            <li><a href="#">Información de la escuela </a></li>
            <li><a href="#">Información personal</a></li>
          </ul>
        </td>        
      </tr>
    </table>
    <p>Materias del profesor ${usuarioFirmado.nombreProf} ${usuarioFirmado.apellidoProf},</p>
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
		<form:form method="POST" action="materiaCalificar" modelAttribute="caliMateriaForm">
		<c:forEach var="profesorMateriaFirmado" items="${profesorMateriasFirmado}">
			<tr>
				<td>${profesorMateriaFirmado.idMateriasHorarios}</td>
				<td>${profesorMateriaFirmado.materia.nombre}</td>
				<td>${profesorMateriaFirmado.grupo.idGrupo}</td>
				<td>${profesorMateriaFirmado.profesor.nombreProf} ${profesorMateriaFirmado.profesor.apellidoProf}</td>
				<td>${profesorMateriaFirmado.salon.edificio}${profesorMateriaFirmado.salon.idSalon}</td>
				<td>${profesorMateriaFirmado.materia.laboratorio}</td>
				<td>${profesorMateriaFirmado.horario}</td>
				<td>${profesorMateriaFirmado.dias}</td>
				<td>
				<td><form:radiobutton path="idMateriaHorario" value="${profesorMateriaFirmado.idMateriasHorarios}"/></td>
				<td colspan="2"><input type="submit" value="Calificar" /></td>
				<!--<button path="idMateriaHorario" type="submit" value="${profesorMateriaFirmado.idMateriasHorarios}">Calificar</button> -->	
				</td>
			</tr>
		</c:forEach>
	    </form:form>
	</table>

		<a href="http://localhost:8080/Sige-WebApp/spring/altaMateria"><button>Alta materia</button></a>
		<a href="http://localhost:8080/Sige-WebApp/spring/bajaMateria"><button>Baja materia</button></a>
</body>
</html>