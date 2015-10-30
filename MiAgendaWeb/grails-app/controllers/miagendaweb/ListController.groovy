package miagendaweb

class ListController {
	
	ListService listService;
	DataService dataService;
	String informeDeLista = new String();

    def index = {}
	
	def mostrarTodosLosContactos = {
				
		if(dataService.listaDeContactos.size() > 0){
			informeDeLista = listService.mostrarTodosLosContactos();
			[informeDeLista:informeDeLista]
		}else{
			informeDeLista = "No existen contactos en la agenda.";
			[informeDeLista:informeDeLista]
		}
	}
}
