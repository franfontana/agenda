package miagendaweb

import grails.converters.JSON

class SearchController {
	
	SearchService searchService;
	ValidationService validationService;
	Contacto contactoEnSearchController = new Contacto();
	String informeBusquedaDeContacto = new String();
	String infoNombre;
	String infoApellido;
	String infoEmail;
	String infoMovil;

//    def index = {}
	
	def menuDeBusqueda = {}
	
	def buscarContactoPorEmail = {}
	
	def buscarContactoPorEmailConResultado = {
		
	if(validationService.validarEmail(params.Email)){
		contactoEnSearchController = searchService.buscarUnContacto(params.Email);
		if(!contactoEnSearchController.equals(null)){	
			informeBusquedaDeContacto = "Contacto encontrado:";
			infoNombre = "Nombre:";
			infoApellido = "Apellido:";
			infoEmail = "Email:";
			infoMovil = "Movil:";
			[Nombre:contactoEnSearchController.getNombre(), Apellido:contactoEnSearchController.getApellido(), Email:contactoEnSearchController.getEmail(), Movil:contactoEnSearchController.getMovil(), informeBusquedaDeContacto:informeBusquedaDeContacto, infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil]
		}else{
			informeBusquedaDeContacto = "No existe el contacto.";
			[informeBusquedaDeContacto:informeBusquedaDeContacto]
		}
	}else{
		informeBusquedaDeContacto = "El email no se ingreso correctamente, por favor reingrese el atributo del contacto.";
		[informeBusquedaDeContacto:informeBusquedaDeContacto]
	}
		
	}
	
	def busquedaPorExpresion = {}
	
	def busquedaPorExpresionConResultado = {		
		[listaEncontradaPorExpresion:searchService.buscarContactosMedianteAlgunAtributo(params.Expresion)]		
	}
	
	def searchContactForEmail = {
		if(validationService.validarEmail(params.Email)){
			[contactoEnSearchController:searchService.buscarUnContacto(params.Email) as JSON]
		}
	}
	
	def searchContactForExpresion = {
		[listaEncontradaPorExpresion:searchService.buscarContactosMedianteAlgunAtributo(params.Expresion) as JSON]
	}
}
