package miagendaweb

class ListService {

    static transactional = true;
	DataService dataService;

    def public String mostrarTodosLosContactos(){
		String retorno;
		String listaAMostrar = "";
		if(dataService.listaDeContactos.size() > 0){
			for(Contacto c : dataService.listaDeContactos){			
				listaAMostrar+="Nombre:" + c.getNombre() + "\t" + "Apellido:" + c.getApellido() + "\t" + "Email:" + c.getEmail() + "\t" + "Movil:" + c.getMovil() + "\n";	
			}
			retorno = listaAMostrar;
		}else retorno = null;
		return retorno;
	}
}
