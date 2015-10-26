package miagendaweb

class SearchController {
	
	SearchService searchServiceEnSearchController = new SearchService();
	ValidationService validationServiceEnSearchController = new ValidationService();
	Agenda agendaEnSearchController = new Agenda();
	Contacto contactoEnSearchController = new Contacto();
	String informeBusquedaDeContacto = new String();
	String infoNombre;
	String infoApellido;
	String infoEmail;
	String infoMovil;

//    def index = {}
	
	def menuDeBusqueda = {}
	
	def buscarContactoPorEmail = {}
	
	def buscarContactoPorEmailConResultado = {
		
	if(validationServiceEnSearchController.validarEmail(params.Email)){
		contactoEnSearchController = searchServiceEnSearchController.buscarUnContacto(params.Email);
		if(!contactoEnSearchController.equals(null)){	
			informeBusquedaDeContacto = "Contacto encontrado:";
			infoNombre = "Nombre:";
			infoApellido = "Apellido:";
			infoEmail = "Email:";
			infoMovil = "Movil:";
			[Nombre:contactoEnSearchController.getNombre(), Apellido:contactoEnSearchController.getApellido(), Email:contactoEnSearchController.getEmail(), Movil:contactoEnSearchController.getMovil(), informeBusquedaDeContacto:informeBusquedaDeContacto, infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil]
		}else{
			informeBusquedaDeContacto = "No existe el contacto.";
			[informeBusquedaDeContacto:informeBusquedaDeContacto]
		}
	}else{
		informeBusquedaDeContacto = "El email no se ingreso correctamente, por favor reingrese el atributo del contacto.";
		[informeBusquedaDeContacto:informeBusquedaDeContacto]
	}
		
	}
	
	def busquedaPorExpresion = {
		
	}
}
