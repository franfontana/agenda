<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Modificar Contacto</title>
</head>
<body>
  <div class="body">
  	<form action="modificarContactoConInforme">
	  Ingrese el email del contacto a modificar:	<input type="text" name="Email" /><br><br>
  	<input type="submit" value="Modificar Contacto"/>
  	</form>
  </div>
  <br><br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>
</body>
</html>