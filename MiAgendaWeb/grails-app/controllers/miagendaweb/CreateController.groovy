package miagendaweb

class CreateController {
	
	CreateService createService;
	ValidationService validationService;
	DataService dataService;
//	int tamanioDeLista = dataService.listaDeContactos.size();
	String informeIngresoDeContacto = new String();
	String infoNombre;
	String infoApellido;
	String infoEmail;
	String infoMovil;

//    def index = {}
	
//	  def home = {}
	
	def agregarContacto = {}
	
	def agregarContactoConResultado = {
		
			if(validationService.validarNombre(params.Nombre) && validationService.validarApellido(params.Apellido) && validationService.validarEmail(params.Email) && validationService.validarTelMovil(params.Movil)){
					createService.agregarContacto(params.Nombre, params.Apellido, params.Email, params.Movil);
					informeIngresoDeContacto = "Se ha agregado el siguiente contacto a la agenda:";
					infoNombre = "Nombre:";
					infoApellido = "Apellido:";
					infoEmail = "Email:";
					infoMovil = "Movil:";
					[Nombre:dataService.listaDeContactos[dataService.contador-1].getNombre(), Apellido:dataService.listaDeContactos[dataService.contador-1].getApellido(), Email:dataService.listaDeContactos[dataService.contador-1].getEmail(), Movil:dataService.listaDeContactos[dataService.contador-1].getMovil(), informeIngresoDeContacto:informeIngresoDeContacto, infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil]
			}else{
				informeIngresoDeContacto = "Los datos no se ingresaron correctamente, por favor reingrese los atributos del contacto.";
				[informeIngresoDeContacto:informeIngresoDeContacto]
			}
	}
}
//[Nombre:createServiceEnCreateController.agendaEnCreateService.listaDeContactos[agendaEnCreateController.contador].getNombre(), en GIT
//dataServiceEnCreateController.listaDeContactos[createServiceEnCreateController.dataServiceEnCreateService.contador].getNombre(), LOCAL ANTES
//OK [Nombre:createServiceEnCreateController.dataServiceEnCreateService.listaDeContactos[dataServiceEnCreateController.contador].getNombre(), Apellido:createServiceEnCreateController.dataServiceEnCreateService.listaDeContactos[dataServiceEnCreateController.contador].getApellido(), Email:createServiceEnCreateController.dataServiceEnCreateService.listaDeContactos[dataServiceEnCreateController.contador].getEmail(), Movil:createServiceEnCreateController.dataServiceEnCreateService.listaDeContactos[dataServiceEnCreateController.contador].getMovil(), informeIngresoDeContacto:informeIngresoDeContacto, infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil]
//DEBERIA FUNCIONAR [Nombre:dataServiceEnCreateController.listaDeContactos[dataServiceEnCreateController.contador].getNombre(), Apellido:dataServiceEnCreateController.listaDeContactos[dataServiceEnCreateController.contador].getApellido(), Email:dataServiceEnCreateController.listaDeContactos[dataServiceEnCreateController.contador].getEmail(), Movil:dataServiceEnCreateController.listaDeContactos[dataServiceEnCreateController.contador].getMovil(), informeIngresoDeContacto:informeIngresoDeContacto, infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil]