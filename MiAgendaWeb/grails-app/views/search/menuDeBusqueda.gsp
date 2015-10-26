<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Menu de Busqueda</title>
</head>
<body>
  <div class="body">
OPCIONES DE BUSQUEDA:
<br>
<br>
Indique como desea buscar el contacto:
<br>
<g:link controller="search" action="buscarContactoPorEmail" id=""> Mediante Email </g:link><br>
<g:link controller="search" action="busquedaPorExpresion" id=""> Mediante expresion textual que identifique cualquier atributo del contacto </g:link><br>
  </div>
  <br><br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>
</body>
</html>