package miagendaweb

class ModifyController {
	
	ModifyService modifyService;
	SearchService searchService;
	ValidationService validationService;
	String informeDeExistencia = new String();
	String informeContactoModificado = new String();
	Contacto contacto = new Contacto("","","","");
	
    def index = {}
	
	def modificarContacto = {}
	
	def modificarContactoConInforme = {
		modifyService.emailDeContactoAModificar = params.Email;
		if(!searchService.buscarUnContacto(modifyService.emailDeContactoAModificar).equals(null)) redirect(action:"submenuModificarContacto");
		else{
			informeDeExistencia = "No existe contacto con dicho atributo.";
			[InformeDeExistencia:informeDeExistencia]
		}
	}
	
	def submenuModificarContacto = {
		Contacto contactoEnSubMenu = searchService.buscarUnContacto(modifyService.emailDeContactoAModificar);
		[Nombre:contactoEnSubMenu.getNombre(), Apellido:contactoEnSubMenu.getApellido(), Email:contactoEnSubMenu.getEmail(), Movil:contactoEnSubMenu.getMovil()]
	}
	
	def modificarNombre = {}
	
	def modificarNombreConResultado = {
		if(validationService.validarNombre(params.Nombre)){
			if(modifyService.modificarContacto(modifyService.emailDeContactoAModificar, "Nombre", params.Nombre)){
				informeContactoModificado = "Se ha modificado el contacto, los atributos son los siguientes:";
				contacto = searchService.buscarUnContacto(modifyService.emailDeContactoAModificar);
				[Informe:informeContactoModificado, infoNombre:"Nombre: ", infoApellido:"Apellido: ", infoEmail:"Email: ", infoMovil:"Movil: ", Nombre:contacto.getNombre(), Apellido:contacto.getApellido(), Email:contacto.getEmail(), Movil:contacto.getMovil()]
			}
		}else{
			informeContactoModificado = "NO Se ha modificado el contacto, la expresion del atributo no es valida. Por favor, reingrese el atributo.";
			[Informe:informeContactoModificado]
		}
	}
	
	def modificarApellido = {}
	
	def modificarApellidoConResultado = {
		if(validationService.validarApellido(params.Apellido)){
			if(modifyService.modificarContacto(modifyService.emailDeContactoAModificar, "Apellido", params.Apellido)){
				informeContactoModificado = "Se ha modificado el contacto, los atributos son los siguientes:";
				contacto = searchService.buscarUnContacto(modifyService.emailDeContactoAModificar);
				[Informe:informeContactoModificado, infoNombre:"Nombre: ", infoApellido:"Apellido: ", infoEmail:"Email: ", infoMovil:"Movil: ", Nombre:contacto.getNombre(), Apellido:contacto.getApellido(), Email:contacto.getEmail(), Movil:contacto.getMovil()]
			}
		}else{
			informeContactoModificado = "NO Se ha modificado el contacto, la expresion del atributo no es valida. Por favor, reingrese el atributo.";
			[Informe:informeContactoModificado]
		}
	}
	
	def modificarEmail = {}
	
	def modificarEmailConResultado = {
		if(!searchService.buscarUnContacto(params.Email)){
			if(validationService.validarEmail(params.Email)){
				if(modifyService.modificarContacto(modifyService.emailDeContactoAModificar, "Email", params.Email)){
					modifyService.emailDeContactoAModificar = params.Email;
					informeContactoModificado = "Se ha modificado el contacto, los atributos son los siguientes:";
					contacto = searchService.buscarUnContacto(modifyService.emailDeContactoAModificar);
					[Informe:informeContactoModificado, infoNombre:"Nombre: ", infoApellido:"Apellido: ", infoEmail:"Email: ", infoMovil:"Movil: ", Nombre:contacto.getNombre(), Apellido:contacto.getApellido(), Email:contacto.getEmail(), Movil:contacto.getMovil()]
				}
			}else{
				informeContactoModificado = "NO se ha modificado el contacto, la expresion del atributo no es valida. Por favor, reingrese el atributo.";
				[Informe:informeContactoModificado]
			}
		}else{
			informeContactoModificado = "NO se ha modificado ya que existe un contacto con dicho atributo. NO es posible duplicarlo";
			[Informe:informeContactoModificado]
		}
	}
	
	def modificarMovil = {}
	
	def modificarMovilConResultado = {
		if(validationService.validarTelMovil(params.Movil)){
			if(modifyService.modificarContacto(modifyService.emailDeContactoAModificar, "Movil", params.Movil)){
				informeContactoModificado = "Se ha modificado el contacto, los atributos son los siguientes:";
				contacto = searchService.buscarUnContacto(modifyService.emailDeContactoAModificar);
				[Informe:informeContactoModificado, infoNombre:"Nombre: ", infoApellido:"Apellido: ", infoEmail:"Email: ", infoMovil:"Movil: ", Nombre:contacto.getNombre(), Apellido:contacto.getApellido(), Email:contacto.getEmail(), Movil:contacto.getMovil()]
			}
		}else{
			informeContactoModificado = "NO Se ha modificado el contacto, la expresion del atributo no es valida. Por favor, reingrese el atributo.";
			[Informe:informeContactoModificado]
		}
	}
	
//	def modifyContact = {
//		if(params.Atributo == "Nombre" && validationService.validarNombre(params.Valor)){
//			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
//		}
//		if(params.Atributo == "Apellido" && validationService.validarApellido(params.Valor)){
//			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
//		}
//		if(params.Atributo == "Email" && validationService.validarEmail(params.Valor)){
//			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
//		}
//		if(params.Atributo == "Movil" && validationService.validarTelMovil(params.Valor)){
//			modifyService.modificarContacto(params.Email, params.Atributo, params.Valor)
//		}
//	}
}
