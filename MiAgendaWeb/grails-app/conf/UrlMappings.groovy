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
		
		
		
		
		
//		"/api/contacts" (controller: "contacts", parseRequest:true){
//			action = [GET:"listContacts"]
//		}
		
		"/api/allcontacts/$Afirmacion" (controller: "allContacts", parseRequest:true){
			action = [DELETE:"deleteAllContacts"]							//Parametro "Afirmacion"
		}
		
		"/api/contacts/$Email" (controller: "contacts", parseRequest:true){
			action = [GET:"searchContactForEmail"]							//Parametro "Email"
		}
		
		"/api/contacts/$Expresion" (controller: "contacts", parseRequest:true){
			action = [GET:"searchContactForExpresion"]						//Parametro "Expresion"
		}
		
		"/api/contacts/$Email/$Afirmacion" (controller: "contacts", parseRequest:true){
			action = [DELETE:"deleteContactForEmail"]						//Parametro "Afirmacion""Email"
		}
		
		"/api/contacts/$Nombre/$Apellido/$Email/$Movil" (controller: "contacts", parseRequest:true){
			action = [POST:"createContact"]									//Parametro "Nombre""Apellido""Email""Movil"
		}
		
		"/api/contacts/$Email/$Atributo/$Valor" (controller: "contacts", parseRequest:true){
			action = [PUT:"modifyContact"]									//Parametro "Email""Atributo""Valor"
		}
		
		
		
		
		"/api/contacts" (controller: "contacts", parseRequest:true){
			action = [GET:"searchContactForEmail", POST:"createContact", PUT:"modifyContact", DELETE:"deleteContactForEmail"]									//Parametro "Email""Atributo""Valor"
		}
		
		"/api/allcontacts" (controller: "allContacts", parseRequest:true){
			action = [GET:"listContacts", DELETE:"deleteAllContacts"]							//Parametro "Afirmacion"
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
