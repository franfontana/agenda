<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Eliminar Contacto</title>
</head>
<body>
  <div class="body">
  <form action="eliminarContactoConResultado">
	  Ingrese el email del contacto a eliminar:	<input type="text" name="Email" /><br><br>
  	<input type="submit" value="Eliminar Contacto"/>
  </form>
  </div>
  <br><br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>
</body>
</html>