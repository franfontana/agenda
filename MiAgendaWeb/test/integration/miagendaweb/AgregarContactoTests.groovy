package miagendaweb

import static java.util.UUID.randomUUID;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import grails.test.*;

class AgregarContactoTests extends GroovyTestCase {
	CreateService createService;
	String nombreTest = randomUUID() as String;
	String apellidoTest = randomUUID() as String;
	String emailTest = randomUUID() as String;
	String movilTest = randomUUID() as String;
	
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testAltaDeContacto() {
		createService = new CreateService();
		createService.dataService = new DataService();
		createService.searchService = new SearchService();

//		createService.searchService.metaClass {buscarUnContacto() {String email -> return null}};
		
		assertTrue(createService.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		assertEquals(1, createService.dataService.listaDeContactos.size());
    }
}
