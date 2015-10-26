package miagendaweb

class SearchService extends Agenda {

	static transactional = true;
	
	def Contacto buscarUnContacto(String email) {
		
			Contacto contactoEncontrado = null;
			for(Contacto c : listaDeContactos){
				if(c.getEmail().equals(email)) contactoEncontrado = c; else contactoEncontrado = null;
			}
			return contactoEncontrado;
	}
}
