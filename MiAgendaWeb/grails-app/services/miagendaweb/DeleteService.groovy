package miagendaweb

class DeleteService {

    static transactional = true;
	def DataService dataService;
	def SearchService searchService;

    def boolean eliminarTodosLosContactos(){
		boolean retorno;
		if(dataService.listaDeContactos.size() > 0){
			dataService.listaDeContactos.removeAll(dataService.listaDeContactos);
			dataService.contador = 0;
			retorno = true;
		}else retorno = false;
		return retorno;
	}
	
	def boolean eliminarContacto(String email){
		boolean retorno;
		if(dataService.listaDeContactos.remove(searchService.buscarUnContacto(email))){
			dataService.contador = dataService.contador-1;
			retorno = true;
		}else retorno = false;
		return retorno;
	}
}
