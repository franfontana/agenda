package miagendaweb

class SearchService {

	static transactional = true;
	Agenda agendaEnSearchService = new Agenda();
	
	def Contacto buscarUnContacto(String email) {
		
			Contacto contactoEncontrado = null;
			for(Contacto c : agendaEnSearchService.listaDeContactos){
				if(c.getEmail().equals(email)) contactoEncontrado = c; else contactoEncontrado = null;
			}
			return contactoEncontrado;
	}
}
