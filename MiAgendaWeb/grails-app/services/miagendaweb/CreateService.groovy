package miagendaweb

class CreateService {

    static transactional = true;
	SearchService searchService;
	DataService dataService;

    def boolean agregarContacto(String nombre, String apellido, String email, String movil) {
		boolean retorno;
		if(searchService.buscarUnContacto(email) == null){
			Contacto unContacto1 = new Contacto(nombre, apellido, email, movil);
			if(dataService.listaDeContactos.add(unContacto1)){
				retorno = true;
				dataService.incrementoContador();
			}else retorno = false;
		}else retorno = false;
		return retorno;
    }
}
