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
		
		
		
		
		
		"/api/contacts" (controller: "contacts", parseRequest:true){
			action = [GET:"listContacts"]
		}
		
		"/api/allcontacts/$Afirmacion" (controller: "allContacts", parseRequest:true){
			action = [DELETE:"deleteAllContacts"]							//Parametro "Afirmacion"
		}
		
		"/api/contact/$Email" (controller: "contact", parseRequest:true){
			action = [GET:"searchContactForEmail"]							//Parametro "Email"
		}
		
		"/api/contact/$Expresion" (controller: "contact", parseRequest:true){
			action = [GET:"searchContactForExpresion"]						//Parametro "Expresion"
		}
		
		"/api/contact/$Email/$Afirmacion" (controller: "contact", parseRequest:true){
			action = [DELETE:"deleteContactForEmail"]						//Parametro "Afirmacion""Email"
		}
		
		"/api/contact/$Nombre/$Apellido/$Email/$Movil" (controller: "contact", parseRequest:true){
			action = [POST:"createContact"]									//Parametro "Nombre""Apellido""Email""Movil"
		}
		
		"/api/contact/$Email/$Atributo/$Valor" (controller: "contact", parseRequest:true){
			action = [PUT:"modifyContact"]									//Parametro "Email""Atributo""Valor"
		}
		
		
		
		
		"/api/contact" (controller: "contact", parseRequest:true){
			action = [GET:"searchContactForEmail", POST:"createContact", PUT:"modifyContact", DELETE:"deleteContactForEmail"]									//Parametro "Email""Atributo""Valor"
		}
		
<<<<<<< HEAD
		"/api/contacts" (controller: "contacts", parseRequest:true){
			action = [DELETE:"deleteAllContacts"]							//Parametro "Afirmacion"
=======
		"/api/allcontacts" (controller: "allContacts", parseRequest:true){
			action = [GET:"listContacts", DELETE:"deleteAllContacts"]							//Parametro "Afirmacion"
>>>>>>> 0deccef... Refactor del nombre de ContactsController a AllContactsController y modificacion de URIs en URLMappings para poder accionar por REST sobre todos los contactos
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
