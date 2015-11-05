<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Submenu Modificar Contacto</title>
</head>
<body>
  <div class="body">
Indique que atributo desea modificar del siguiente contacto:
	<br>
	<br>
	<g:link controller="modify" action="modificarNombre" id=""> Nombre: </g:link>${Nombre}<br>
	<g:link controller="modify" action="modificarApellido" id=""> Apellido: </g:link>${Apellido}<br>
	<g:link controller="modify" action="modificarEmail" id=""> Email: </g:link>${Email}<br>
	<g:link controller="modify" action="modificarMovil" id=""> Movil: </g:link>${Movil}<br>	
  </div>
  <br><br>
  <g:link controller="modify" action="modificarContacto" id=""> Volver a ingresar el email del contacto </g:link><br>
</body>
</html>