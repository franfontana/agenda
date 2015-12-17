<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>API Agenda</title>
</head>
<body>
  <div class="body">
API REST AGENDA
<br>
<br>
OPCIONES:
<br>
<br>
<br>
<form action="contact" method="post">
	  Nombre:	<input type="text" name="Nombre" /><br><br>
	  Apellido:	<input type="text" name="Apellido" /><br><br>
	  Email:	<input type="text" name="Email" /><br><br>
	  Movil:	<input type="text" name="Movil" /><br><br>
<input type="submit" value="Create Contact"/>
</form>
<g:link controller="contact" action="searchContactForEmail" id=""> Buscar Contacto </g:link><br>
<g:link controller="contact" action="modifyContact" id=""> Modificar Contacto </g:link><br>
<g:link controller="contact" action="deleteContactForEmail" id=""> Eliminar Contacto </g:link><br>
<g:link controller="contacts" action="listContacts" id=""> Listado de Contactos </g:link><br>
<g:link controller="contacts" action="deleteAllContacts" id=""> Eliminar TODOS los contactos de la Agenda </g:link><br>
  </div>
</body>
</html>