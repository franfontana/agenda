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
Elija la opcion a realizar:
<br>
<g:link controller="create" action="agregarContacto" id=""> Nuevo Contacto </g:link><br>
<g:link controller="search" action="menuDeBusqueda" id=""> Buscar Contacto </g:link><br>
<g:link controller="create" action="index" id=""> Modificar Contacto </g:link><br>
<g:link controller="create" action="index" id=""> Eliminar Contacto </g:link><br>
<g:link controller="list" action="mostrarTodosLosContactos" id=""> Listado de Contactos </g:link><br>
<g:link controller="delete" action="eliminarTodosLosContactos" id=""> Eliminar TODOS los contactos de la Agenda </g:link><br>
<g:link controller="create" action="index" id=""> Salir de la Agenda </g:link><br>  
  </div>
</body>
</html>