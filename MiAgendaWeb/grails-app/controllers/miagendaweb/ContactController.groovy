package miagendaweb

import grails.converters.JSON

class ContactController {

	ValidationService validationService;
	SearchService searchService;
	DeleteService deleteService;
	CreateService createService;
	ModifyService modifyService;
	String email = params.Email;
	
//    def index = { }
	
	def searchContactForEmail = {
		if(validationService.validarEmail(email)){
			[contactoEnSearchController:searchService.buscarUnContacto(email) as JSON]
		}
	}
	
	def searchContactForExpresion = {
		[listaEncontradaPorExpresion:searchService.buscarContactosMedianteAlgunAtributo(params.Expresion) as JSON]
	}
	
	def deleteContactForEmail = {
		if(validationService.validateDeleteContact(params.Afirmacion)){
			deleteService.eliminarContacto(email);
		}
	}
	
	def createContact = {
		if(validationService.validarNombre(params.Nombre) && validationService.validarApellido(params.Apellido) && validationService.validarEmail(params.Email) && validationService.validarTelMovil(params.Movil)){
			createService.agregarContacto(params.Nombre, params.Apellido, params.Email, params.Movil)
		}
	}
	
	def modifyContact = {
		if(params.Atributo == "Nombre" && validationService.validarNombre(params.Valor)){
			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
		}
		if(params.Atributo == "Apellido" && validationService.validarApellido(params.Valor)){
			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
		}
		if(params.Atributo == "Email" && validationService.validarEmail(params.Valor)){
			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
		}
		if(params.Atributo == "Movil" && validationService.validarTelMovil(params.Valor)){
			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
		}
	}
}
