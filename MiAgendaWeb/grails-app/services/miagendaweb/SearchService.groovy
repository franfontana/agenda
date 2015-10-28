package miagendaweb

class SearchService {

	static transactional = true;
	DataService dataService;
	
	def Contacto buscarUnContacto(String email) {
		
			Contacto contactoEncontrado = null;
			for(Contacto c : dataService.listaDeContactos){
				if(c.getEmail().equals(email)) contactoEncontrado = c;
//				else contactoEncontrado = null;
			}
			return contactoEncontrado;
	}
}
