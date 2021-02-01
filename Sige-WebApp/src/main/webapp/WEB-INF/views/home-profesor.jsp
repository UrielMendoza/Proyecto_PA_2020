<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home de usuario</title>
</head>
<body>
	<p>¡Bienvenido ${usuarioFirmado.nombreProf}</p>
    <table>
      <tr>
        <td>
          <ul style="list-style-type:none">
            <li><a href="http://localhost:8080/Sige-WebApp/spring/materiasProfesor">Materias impartidas</a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Escuela/listarp">Información de la escuela </a></li>
            <li><a href="http://localhost:8080/Sige-WebApp/spring/Profesor/listar">Información personal</a></li>
          </ul>
        </td>
        
      </tr>
    </table>
</body>
</html>