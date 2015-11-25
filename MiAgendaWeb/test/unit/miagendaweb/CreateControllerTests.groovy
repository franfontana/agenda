package miagendaweb

import grails.test.*

class CreateControllerTests extends ControllerUnitTestCase {
	
	CreateController createController
	
    protected void setUp() {
        super.setUp()
		createController = new CreateController()
		createController.validationService = new ValidationService()
		createController.createService = new CreateService()
		createController.createService.searchService = new SearchService()
		mockController(CreateController)
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testAgregarContactoConResultadoConParametros() {
		createController.params.Nombre = "Fran"
		createController.params.Apellido = "Fontana"
		createController.params.Email = "fran@gmail.com"
		createController.params.Movil = "1231231231"
		Contacto contacto = new Contacto("Fran","Fontana","fran@gmail.com","1231231231")
		createController.createService.searchService.metaClass {buscarUnContacto() {String email -> contacto}}
		createController.agregarContactoConResultado()
		assertTrue createController.response.contentLength==0
    }
}