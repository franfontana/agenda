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
	  Nombre:	<input type="text" name="Nombre" /><br>
	  Apellido:	<input type="text" name="Apellido" /><br>
	  Email:	<input type="text" name="Email" /><br>
	  Movil:	<input type="text" name="Movil" /><br>
<input type="submit" value="Create Contact"/>
</form>
<br>
<form action="contact" method="get">
	  Email:	<input type="text" name="Email" /><br>
<input type="submit" value="Search Contact"/>
</form>
<br>
<form action="contact" method="put">
	  Email:	<input type="text" name="Email" /><br>
	  Atributo a modificar (Nombre-Apellido-Email-Movil):	<input type="text" name="Atributo" /><br>
	  Nuevo Valor:	<input type="text" name="Valor" /><br>
<input type="submit" value="Modify Contact"/>
</form>
<br>
<form action="contact" method="delete">
	  Email:	<input type="text" name="Email" /><br>
<input type="submit" value="Delete Contact"/>
</form>
<br>
<form action="contacts" method="get">
<input type="submit" value="List Contacts"/>
</form>
<br>
<form action="contacts" method="delete">
	  Afirmacion:	<input type="text" name="Afirmacion" /><br>
<input type="submit" value="Delete All Contacts"/>
</form>
<br>
  </div>
</body>
</html>