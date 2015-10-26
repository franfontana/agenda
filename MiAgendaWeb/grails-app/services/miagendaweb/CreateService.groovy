package miagendaweb

class CreateService extends Agenda {

    static transactional = true;
	SearchService searchServiceEnCreateService = new SearchService();

    def boolean agregarContacto(String nombre, String apellido, String email, String movil) {
		boolean retorno;
		if(searchServiceEnCreateService.buscarUnContacto(email) == null){
			Contacto unContacto1 = new Contacto(nombre, apellido, email, movil);
			if(listaDeContactos.add(unContacto1)){
				retorno = true;
				contador = contador+1;
			}else retorno = false;
		}else retorno = false;
		return retorno;
    }
}
