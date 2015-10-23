<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Agenda Personal</title>
</head>
<body>
  <div class="body">
AGENDA PERSONAL
<br>
<br>
MENU DE OPCIONES:
<br>
<br>
Ingrese la opcion a realizar:
<br>
<g:link controller="create" action="index" id=""> 1..Nuevo Contacto </g:link><br>
<g:link controller="create" action="index" id=""> 2..Buscar Contacto </g:link><br>
<g:link controller="create" action="index" id=""> 3..Modificar Contacto </g:link><br>
<g:link controller="create" action="index" id=""> 4..Eliminar Contacto </g:link><br>
<g:link controller="create" action="index" id=""> 5..Listado de Contactos </g:link><br>
<g:link controller="create" action="index" id=""> 6..Eliminar TODOS los contactos de la Agenda </g:link><br>
<g:link controller="create" action="index" id=""> 0..Salir de la Agenda </g:link><br>  
  </div>
</body>
</html>