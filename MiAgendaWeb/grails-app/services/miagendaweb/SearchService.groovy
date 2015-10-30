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
	
	def ArrayList<Contacto> buscarContactosMedianteAlgunAtributo(String busqueda){
		String mostrarBusqueda = "";
		ArrayList<Contacto> listaEncontradaPorExpresion = new ArrayList<Contacto>();
		for(Contacto c : dataService.listaDeContactos) {
			if((c.getNombre().equals(busqueda)) || (c.getNombre().equals(c.getApellido())) && !(c.getEmail().equals(busqueda)) && !(c.getMovil().equals(busqueda))) {
				listaEncontradaPorExpresion.add(c);
			}
			if((c.getApellido().equals(busqueda)) && (!c.getApellido().equals(c.getNombre()))) {
				listaEncontradaPorExpresion.add(c);
			}
			if(c.getEmail().equals(busqueda)) {
				listaEncontradaPorExpresion.add(c);
			}
			if(c.getMovil().equals(busqueda)) {
				listaEncontradaPorExpresion.add(c);
			}
		}
		return listaEncontradaPorExpresion;
	}
}
