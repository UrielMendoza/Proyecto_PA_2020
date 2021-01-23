<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home de usuario</title>
</head>
<body>
	<p>Bienvenido alumno ${usuarioFirmado.nombre} ${usuarioFirmado.apellido},</p>
	<%--
	<p>&iquest;Qu&eacute; deseas hacer?</p>
	<p><a href="/web-biblioteca/spring/libro/listar">Buscar libros</a></p>
	<p><a href="/web-biblioteca/spring/sesion/mostrar">Mostrar que hay en sesión</a></p> --%>
	<table>
      <tr>
        <td>
          <ul style="list-style-type:none">
            <li><a href="#">Grupos</a></li>
            <li><a href="#">Mis materias</a></li>
            <li><a href="#">Información de la escuela </a></li>
            <li><a href="#">Información personal</a></li>
          </ul>
        </td>
        <td><!-- Desplegar tabla de alumnos --></td>
      </tr>
    </table>
</body>
</html>