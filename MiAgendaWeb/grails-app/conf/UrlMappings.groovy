class UrlMappings {

	static mappings = {
		
//		"/list" (controller:"list", parseRequest:true){
//			action = [GET:"mostrarTodosLosContactos", PUT:"update", DELETE:"delete", POST:"save"]	//Sin Parametro
//		}
		
		"/list" (controller:"list", parseRequest:true){
			action = [GET:"mostrarTodosLosContactos"]	//Sin Parametro
		}
		
		"/search" (controller:"search", parseRequest:true){
			action = [GET:"buscarContactoPorEmailConResultado"]		//Parametro "Email"
		}
		
		"/search" (controller:"search", parseRequest:true){
			action = [GET:"busquedaPorExpresionConResultado"]		//Parametro "Expresion"
		}
		
		"/create" (controller:"create", parseRequest:true){
			action = [POST:"agregarContactoConResultado"]			//Parametro "Nombre""Apellido""Email""Movil"
		}
		
//		"/modify" (controller:"modify", parseRequest:true){
//			action = [PUT:"modificarNombreConResultado"]			//Parametro "Nombre"
//		}
		
//		"/modify" (controller:"modify", parseRequest:true){
//			action = [PUT:"modificarContactoConInforme"]			//Parametro "Email"
//		}
		
		"/deleteall" (controller:"delete", parseRequest:true){
			action = [DELETE:"eliminarTodosLosContactosOK"]			//Parametro "Afirmacion"
		}
		
		"/delete" (controller:"delete", parseRequest:true){
			action = [DELETE:"eliminarContactoConResultadoYValidacion"]		//Parametro "Afirmacion""Email"
		}
		
		
		
		
		
		
		
//		"/createContact" (service:"create", parseRequest){
//			action = [POST:"agregarContacto"]
//		}
		
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/home/index")
		"500"(view:'/error')
	}
}
