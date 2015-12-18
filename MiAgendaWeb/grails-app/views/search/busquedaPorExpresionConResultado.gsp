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
  <g:if test="${listaEncontradaPorExpresion.size() > 0}">
	  <g:each in="${listaEncontradaPorExpresion}" var="contact">
	  	<li>Nombre:	${contact.nombre}&nbsp;&nbsp;Apellido: ${contact.apellido}&nbsp;&nbsp;Email: ${contact.email}&nbsp;&nbsp;Movil: ${contact.movil}
	  </g:each>
  </g:if>
  <g:else>No existen contactos que contengan dicha expresion.</g:else>
  </div>
  <br><br>
  <g:link controller="search" action="menuDeBusqueda" id=""> Volver al Menu de Busqueda </g:link><br>
</body>
</html>