class UrlMappings {

	static mappings = {
		
//		"/list" (controller:"list", parseRequest:true){
//			action = [GET:"mostrarTodosLosContactos"]	//Sin Parametro
//		}
//		
//		"/search" (controller:"search", parseRequest:true){
//			action = [GET:"buscarContactoPorEmailConResultado"]		//Parametro "Email"
//		}
//		
//		"/search" (controller:"search", parseRequest:true){
//			action = [GET:"busquedaPorExpresionConResultado"]		//Parametro "Expresion"
//		}
//		
//		"/create" (controller:"create", parseRequest:true){
//			action = [POST:"agregarContactoConResultado"]			//Parametro "Nombre""Apellido""Email""Movil"
//		}
//		
//		"/deleteall" (controller:"delete", parseRequest:true){
//			action = [DELETE:"eliminarTodosLosContactosOK"]			//Parametro "Afirmacion"
//		}
//		
//		"/delete" (controller:"delete", parseRequest:true){
//			action = [DELETE:"eliminarContactoConResultadoYValidacion"]		//Parametro "Afirmacion""Email"
//		}
		
		
		
		
//		"/listcontacts" (controller:"list", parseRequest:true){
//			action = [GET:"listContacts"]									//Sin Parametro
//		}
		
//		"/searchcontactforexpresion" (controller:"search", parseRequest:true){
//			action = [GET:"searchContactForExpresion"]						//Parametro "Expresion"
//		}
		
//		"/searchcontactforemail" (controller:"search", parseRequest:true){
//			action = [GET:"searchContactForEmail"]							//Parametro "Email"
//		}
		
//		"/createcontact" (controller:"create", parseRequest:true){
//			action = [POST:"createContact"]									//Parametro "Nombre""Apellido""Email""Movil"
//		}
		
//		"/modifycontact" (controller:"modify", parseRequest:true){
//			action = [PUT:"modifyContact"]									//Parametro "Email""Atributo""Valor"
//		}
		
//		"/deleteallcontacts" (controller:"delete", parseRequest:true){
//			action = [DELETE:"deleteAllContacts"]							//Parametro "Afirmacion"
//		}
		
//		"/deletecontactforemail" (controller: "delete", parseRequest:true){
//			action = [DELETE:"deleteContactForEmail"]						//Parametro "Afirmacion""Email"
//		}
		
		
		
		
		
		"/contacts" (controller: "contacts", parseRequest:true){
			action = [GET:"listContacts"]
		}
		
		"/contacts/$Afirmacion" (controller: "contacts", parseRequest:true){
			action = [DELETE:"deleteAllContacts"]							//Parametro "Afirmacion"
		}
		
		"/contact/$Email" (controller: "contact", parseRequest:true){
			action = [GET:"searchContactForEmail"]							//Parametro "Email"
		}
		
		"/contact/$Expresion" (controller: "contact", parseRequest:true){
			action = [GET:"searchContactForExpresion"]						//Parametro "Expresion"
		}
		
		"/contact/$Email/$Afirmacion" (controller: "contact", parseRequest:true){
			action = [DELETE:"deleteContactForEmail"]						//Parametro "Afirmacion""Email"
		}
		
		"/contact/$Nombre/$Apellido/$Email/$Movil" (controller: "contact", parseRequest:true){
			action = [POST:"createContact"]									//Parametro "Nombre""Apellido""Email""Movil"
		}
		
		"/contact/$Email/$Atributo/$Valor" (controller: "contact", parseRequest:true){
			action = [PUT:"modifyContact"]									//Parametro "Email""Atributo""Valor"
		}
		
		
		
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/home/index")
		"500"(view:'/error')
	}
}
