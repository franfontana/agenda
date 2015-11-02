package miagendaweb

class DeleteController {
	
	def DataService dataService;
	def ValidationService ValidationService;
	def DeleteService deleteService;
	String informeEliminacionDeContactos = new String();

    def index = {}
	
	def eliminarTodosLosContactos = {
		[ListaDeContactos:dataService.listaDeContactos]
	}
	
	def eliminarTodosLosContactosOK = {
				
		if(ValidationService.validateDeleteAllContacts(params.Afirmacion)){
			deleteService.eliminarTodosLosContactos();
			informeEliminacionDeContactos = "Todos los contactos han sido eliminados."
		}else{
			if(params.Afirmacion.equals("N")){
				redirect(controller: "home" , action:"index");
			}
			redirect(action:"eliminarTodosLosContactos");
		}
				
		[InformeEliminacionDeContactos:informeEliminacionDeContactos, ListaDeContactos:dataService.listaDeContactos]
	}
}
