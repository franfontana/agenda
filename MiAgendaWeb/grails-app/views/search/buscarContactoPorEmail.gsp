<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Busqueda Mediante Email</title>
</head>
<body>
  <div class="body">
  <form action="buscarContactoPorEmailConResultado">
  Ingrese el email del contacto a buscar:	<input type="text" name="Email" /><br><br>
  <input type="submit" value="Buscar Contacto"/>
  </form>
  <br>
  <br>
  ${informeBusquedaDeContacto}
  <br>
  ${infoNombre} ${Nombre} <br> ${infoApellido} ${Apellido} <br> ${infoEmail} ${Email} <br> ${infoMovil} ${Movil}
  </div>
  <g:link controller="search" action="menuDeBusqueda" id=""> Volver al Menu de Busqueda </g:link><br>
</body>
</html>