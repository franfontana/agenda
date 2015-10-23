package miagendaweb

class CreateController {
	
	CreateService createServiceEnCreateController = new CreateService();
	Agenda agendaEnCreateController = new Agenda();
	String contactoAgregado = new String();
	String infoNombre = "Nombre:";
	String infoApellido = "Apellido:";
	String infoEmail = "Email:";
	String infoMovil = "Movil:";

    def index = { }
	
	def agregarContacto = {
		
	}
	
	def agregarContactoConResultado = {
		
		if(createServiceEnCreateController.agregarContacto(params.Nombre, params.Apellido, params.Email, params.Movil)){
			contactoAgregado = "Se ha agregado el siguiente contacto a la agenda:";
			
			[Nombre:createServiceEnCreateController.agendaEnCreateService.listaDeContactos[agendaEnCreateController.contador].getNombre(), Apellido:createServiceEnCreateController.agendaEnCreateService.listaDeContactos[agendaEnCreateController.contador].getApellido(), Email:createServiceEnCreateController.agendaEnCreateService.listaDeContactos[agendaEnCreateController.contador].getEmail(), Movil:createServiceEnCreateController.agendaEnCreateService.listaDeContactos[agendaEnCreateController.contador].getMovil(), ContactoAgregado:contactoAgregado, infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil]
		}
		
		
	}
}
