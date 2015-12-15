package miagendaweb

import grails.converters.JSON

class ContactsController {
	
	DataService dataService;
	ValidationService validationService;
	DeleteService deleteService;
	SearchService searchService;

//    def index = { }
	
	def listContacts = {
		if(dataService.listaDeContactos.size() > 0){
			[listarContactos:dataService.listaDeContactos as JSON]
		}
    }
	
	def deleteAllContacts = {
		if(validationService.validateDeleteAllContacts(params.Afirmacion)){
			deleteService.eliminarTodosLosContactos();
		}
	}
}
