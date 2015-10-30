<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Listado De Contactos</title>
</head>
<body>
  <div class="body">
<%--  <g:if test="${informeDeLista.size() > 0}">--%>
	  <g:each in="${informeDeLista}" var="contact" >
	  	<li>Nombre:	${contact.nombre}&nbsp;&nbsp;Apellido: ${contact.apellido}&nbsp;&nbsp;Email: ${contact.email}&nbsp;&nbsp;Movil: ${contact.movil}
	  </g:each>
<%--  </g:if>--%>
<%--  <g:else>--%>
<%--		No existen contactos en la agenda.  	--%>
<%--  </g:else>--%>
	  ${informeNoHayContactos}
  </div>
  <br><br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>
</body>
</html>