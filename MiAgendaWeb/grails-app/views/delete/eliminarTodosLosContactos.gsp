<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Eliminar Contactos</title>
</head>
<body>
  <div class="body">
  <g:if test="${ListaDeContactos.size().equals(0)}">
  	No existen contactos en la agenda a eliminar.
  </g:if>
  <g:else>
    <form action="eliminarTodosLosContactosOK">
	  Esta seguro de que desea eliminar TODOS los contactos de la agenda (S/N):	<input type="text" name="Afirmacion" /><br><br>
  	<input type="submit" value="Enviar Solicitud"/>
  </form>
  </g:else>
  </div>
  <br><br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>
</body>
</html>