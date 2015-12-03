package miagendaweb

class DeleteController {
	
	def DataService dataService;
	def ValidationService validationService;
	def DeleteService deleteService;
	def SearchService searchService;
	String informeEliminacionDeContactos = new String();
	String informeContactoEliminado = new String();
	String infoNombre;
	String infoApellido;
	String infoEmail;
	String infoMovil;
	String email = params.Email;

    def index = {}
	
	def eliminarContacto = {}
	
	def eliminarContactoConResultado = {
		
		def contacto = searchService.buscarUnContacto(email);
		if(contacto){
			infoNombre = "Nombre:";
			infoApellido = "Apellido:";
			infoEmail = "Email:";
			infoMovil = "Movil:";
			[Nombre:contacto.getNombre(), Apellido:contacto.getApellido(), Email:contacto.getEmail(), Movil:contacto.getMovil(), infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil, existeContacto:true]
		}else{
			informeContactoEliminado = "No se encuentra el contacto a eliminar.";
			[InformeContactoEliminado:informeContactoEliminado]
		}
	}
	
	def eliminarContactoConResultadoYValidacion = {
		if(validationService.validateDeleteContact(params.Afirmacion)){
			deleteService.eliminarContacto(email);
			informeContactoEliminado = "El contacto se ha eliminado de la agenda.";
			[InformeContactoEliminado:informeContactoEliminado]
		}else{
			redirect(controller:"home", action:"index");
		}
	}
	
	def eliminarTodosLosContactos = {
		[ListaDeContactos:dataService.listaDeContactos]
	}
	
	def eliminarTodosLosContactosOK = {
				
		if(validationService.validateDeleteAllContacts(params.Afirmacion)){
			deleteService.eliminarTodosLosContactos();
			informeEliminacionDeContactos = "Todos los contactos han sido eliminados."
		}else{
			if(params.Afirmacion.equals("N")){
				redirect(controller:"home" , action:"index");
			}
			redirect(action:"eliminarTodosLosContactos");
		}
				
		[InformeEliminacionDeContactos:informeEliminacionDeContactos, ListaDeContactos:dataService.listaDeContactos]
	}
	
	def deleteAllContacts = {
		if(validationService.validateDeleteAllContacts(params.Afirmacion)){
			deleteService.eliminarTodosLosContactos();
		}
	}
	
	def deleteContactForEmail = {
		if(validationService.validateDeleteContact(params.Afirmacion)){
			deleteService.eliminarContacto(email);
		}
	}
}
