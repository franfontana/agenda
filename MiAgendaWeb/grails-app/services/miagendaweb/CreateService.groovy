package miagendaweb

class CreateService {

    static transactional = true;
	SearchService searchServiceEnCreateService = new SearchService();
	Agenda agendaEnCreateService = new Agenda();

    def boolean agregarContacto(String nombre, String apellido, String email, String movil) {
		boolean retorno;
		if(searchServiceEnCreateService.buscarUnContacto(email) == null){
			Contacto unContacto1 = new Contacto(nombre, apellido, email, movil);
			if(agendaEnCreateService.listaDeContactos.add(unContacto1)){
				retorno = true;
				agendaEnCreateService.contador = agendaEnCreateService.contador+1;
			}else retorno = false;
		}else retorno = false;
		return retorno;
    }
}
