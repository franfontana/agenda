<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Agregar Contacto</title>
</head>
<body>
  <div class="body">
  <form action="agregarContactoConResultado">
	  Ingrese el nombre del nuevo contacto:	<input type="text" name="Nombre" /><br><br>
	  Ingrese el apellido del nuevo contacto:	<input type="text" name="Apellido" /><br><br>
	  Ingrese el email del nuevo contacto:	<input type="text" name="Email" /><br><br>
	  Ingrese el movil del nuevo contacto:	<input type="text" name="Movil" /><br><br>
  	<input type="submit" value="Agregar Contacto"/>
  </form>
  </div>
  <br><br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>
</body>
</html>