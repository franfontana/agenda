package miagendaweb

class CreateController {
	
	CreateService createServiceEnCreateController = new CreateService();
	ValidationService validationServiceEnCreateController = new ValidationService();
	Agenda agendaEnCreateController = new Agenda();
	String informeIngresoDeContacto = new String();
	String infoNombre;
	String infoApellido;
	String infoEmail;
	String infoMovil;

//    def index = {}
	
//	  def home = {}
	
	def agregarContacto = {}
	
	def agregarContactoConResultado = {
		
			if(validationServiceEnCreateController.validarNombre(params.Nombre) && validationServiceEnCreateController.validarApellido(params.Apellido) && validationServiceEnCreateController.validarEmail(params.Email) && validationServiceEnCreateController.validarTelMovil(params.Movil)){
					createServiceEnCreateController.agregarContacto(params.Nombre, params.Apellido, params.Email, params.Movil);
					informeIngresoDeContacto = "Se ha agregado el siguiente contacto a la agenda:";
					infoNombre = "Nombre:";
					infoApellido = "Apellido:";
					infoEmail = "Email:";
					infoMovil = "Movil:";
					[Nombre:createServiceEnCreateController.listaDeContactos[agendaEnCreateController.contador].getNombre(), Apellido:createServiceEnCreateController.listaDeContactos[agendaEnCreateController.contador].getApellido(), Email:createServiceEnCreateController.listaDeContactos[agendaEnCreateController.contador].getEmail(), Movil:createServiceEnCreateController.listaDeContactos[agendaEnCreateController.contador].getMovil(), informeIngresoDeContacto:informeIngresoDeContacto, infoNombre:infoNombre, infoApellido:infoApellido, infoEmail:infoEmail, infoMovil:infoMovil]
			}else{
				informeIngresoDeContacto = "Los datos no se ingresaron correctamente, por favor reingrese los atributos del contacto.";
				[informeIngresoDeContacto:informeIngresoDeContacto]
			}
	}
}
