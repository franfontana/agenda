package miagendaweb

class SearchService {

	static transactional = true;
	DataService dataServiceEnSearchService = new DataService();
	
	def Contacto buscarUnContacto(String email) {
		
			Contacto contactoEncontrado = null;
			for(Contacto c : dataServiceEnSearchService.listaDeContactos){
				if(c.getEmail().equals(email)) contactoEncontrado = c; else contactoEncontrado = null;
			}
			return contactoEncontrado;
	}
}
