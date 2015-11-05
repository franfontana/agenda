package miagendaweb

class ModifyService {

    static transactional = true;
	SearchService searchService;
	public static String emailDeContactoAModificar;

    def boolean modificarContacto(String emailDeContactoAModificar, String atributoAModificar, String nuevoValorDeAtributo) {
		boolean retorno = false;
		int opcion = 0;
		if(atributoAModificar.equals("Nombre")) opcion = 1;
		if(atributoAModificar.equals("Apellido")) opcion = 2;
		if(atributoAModificar.equals("Email")) opcion = 3;
		if(atributoAModificar.equals("Movil")) opcion = 4;
		Contacto contactoAModificar = searchService.buscarUnContacto(emailDeContactoAModificar);
		if(contactoAModificar != null){
			switch(opcion){
			case 1:
				contactoAModificar.setNombre(nuevoValorDeAtributo);
				retorno = true;
				break;
			case 2:
				contactoAModificar.setApellido(nuevoValorDeAtributo);
				retorno = true;
				break;
			case 3:
				contactoAModificar.setEmail(nuevoValorDeAtributo);
				retorno = true;
				break;
			case 4:
				contactoAModificar.setMovil(nuevoValorDeAtributo);
				retorno = true;
				break;
			}
		}else retorno = false;
		return retorno;
	}
}
