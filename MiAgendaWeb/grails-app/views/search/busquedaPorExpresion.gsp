<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Busqueda Mediante Expresion Textual</title>
</head>
<body>
  <div class="body">
    <form action="busquedaPorExpresionConResultado">
	  Ingrese la expresion a buscar como atributo del contacto:	<input type="text" name="Expresion" /><br><br>
  	<input type="submit" value="Buscar Contacto"/>
  </form>
  </div>
  <br><br>
  <g:link controller="search" action="menuDeBusqueda" id=""> Volver al Menu de Busqueda </g:link><br>
</body>
</html>