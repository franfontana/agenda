package miagendaweb

import grails.converters.JSON

class ListController {
	
	DataService dataService;
	String informeNoHayContactos = new String();

    def index = {}
	
	def mostrarTodosLosContactos = {
		
		if(dataService.listaDeContactos.size() > 0){
			[informeDeLista:dataService.listaDeContactos]
		}else{
			informeNoHayContactos = "No existen contactos en la agenda.";
			[informeNoHayContactos:informeNoHayContactos]
		}
	}
	
	def listContacts = {
		if(dataService.listaDeContactos.size() > 0){
			[listarContactos:dataService.listaDeContactos as JSON]
		}
	}
}
