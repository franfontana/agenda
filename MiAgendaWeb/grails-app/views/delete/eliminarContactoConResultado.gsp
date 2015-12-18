<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<%--<meta name="layout" content="main"/>--%>
<title>Eliminar Contacto</title>
</head>
<body>
  <div class="body">
	<form action="eliminarContactoConResultado">
		Ingrese el email del contacto a eliminar:	<input type="text" name="Email" /><br><br>
	  	<input type="submit" value="Eliminar Contacto"/> 
  	<br>  
	</form>
	<form action="eliminarContactoConResultadoYValidacion">
	 <br>
	 <g:if test="${existeContacto}">
	 	El siguiente contacto se eliminará de la agenda, quiere eliminarlo? (S/N):<input type="text" name="Afirmacion" /><br><br>
	  	<input type="submit" value="Enviar Solicitud"/>
	  	<br>
	  	<br>
	  	${infoNombre} ${Nombre} <br> ${infoApellido} ${Apellido} <br> ${infoEmail} ${Email} <br> ${infoMovil} ${Movil}
		<g:hiddenField name="Email" value="${Email}" />	 
	 </g:if>
	</form>
   	<br>
  	${InformeContactoEliminado}
  	<br>
  </div>
  <br><br>
  <g:link controller="home" action="index" id=""> Volver al Menu Principal </g:link><br>
</body>
</html>