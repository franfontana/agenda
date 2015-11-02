package miagendaweb

class DeleteService {

    static transactional = true;
	def DataService dataService;

    def boolean eliminarTodosLosContactos(){
		boolean retorno;
		if(dataService.listaDeContactos.size() > 0){
			dataService.listaDeContactos.removeAll(dataService.listaDeContactos);
			dataService.contador = 0;
			retorno = true;
		}else retorno = false;
		return retorno;
	}
}
