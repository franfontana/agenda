<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Modificar Movil</title>
</head>
<body>
  <div class="body">
  	<form action="modificarMovilConResultado">
  	Ingrese el nuevo movil del contacto:	<input type="text" name="Movil" /><br><br>
  	<input type="submit" value="Modificar Contacto"/>
  	</form>
  </div>
  <br><br>
  <g:link controller="modify" action="submenuModificarContacto" id=""> Volver a elegir el atributo a modificar </g:link><br>
  <br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>  
</body>
</html>