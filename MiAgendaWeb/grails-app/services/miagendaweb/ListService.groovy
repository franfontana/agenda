package miagendaweb

class ListService {

    static transactional = true;

    def public String mostrarTodosLosContactos(){
		String retorno;
		String listaAMostrar = "";
		if(contador > 0){
			for(Contacto c : this.listaDeContactos){			
				listaAMostrar+="Nombre:" + c.getNombre() + "\t" + "Apellido:" + c.getApellido() + "\t" + "Email:" + c.getEmail() + "\t" + "Movil:" + c.getMovil() + "\n";	
			}
			retorno = listaAMostrar;
		}else retorno = null;
		return retorno;
	}
}
