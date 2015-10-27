package miagendaweb

class CreateService {

    static transactional = true;
	SearchService searchServiceEnCreateService = new SearchService();
	DataService dataServiceEnCreateService = new DataService();

    def boolean agregarContacto(String nombre, String apellido, String email, String movil) {
		boolean retorno;
		if(searchServiceEnCreateService.buscarUnContacto(email) == null){
			Contacto unContacto1 = new Contacto(nombre, apellido, email, movil);
			if(dataServiceEnCreateService.listaDeContactos.add(unContacto1)){
				retorno = true;
				dataServiceEnCreateService.contador = dataServiceEnCreateService.contador+1;
			}else retorno = false;
		}else retorno = false;
		return retorno;
    }
}
