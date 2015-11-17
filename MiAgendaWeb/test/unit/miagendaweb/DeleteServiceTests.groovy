package miagendaweb

import grails.test.*
import static java.util.UUID.randomUUID;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class DeleteServiceTests extends GrailsUnitTestCase {
    
	String nombreTest = randomUUID() as String;
	String apellidoTest = randomUUID() as String;
	String emailTest = randomUUID() as String;
	String movilTest = randomUUID() as String;
	DeleteService deleteService;
	
	protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testEliminacionDeContacto() {
		deleteService = new DeleteService();
		deleteService.searchService = new SearchService();
		deleteService.dataService = new DataService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		deleteService.dataService.listaDeContactos.add(contacto);
		assertEquals(1,deleteService.dataService.listaDeContactos.size());
		deleteService.searchService.metaClass {buscarUnContacto() {String email -> return contacto}}		
		assertTrue(deleteService.eliminarContacto(emailTest));
		assertEquals(0,deleteService.dataService.listaDeContactos.size());
    }
	
	void testEliminarTodosLosContactos(){
		deleteService = new DeleteService();
		deleteService.dataService = new DataService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		deleteService.dataService.listaDeContactos.add(contacto);
		assertEquals(1, deleteService.dataService.listaDeContactos.size());
		assertTrue(deleteService.eliminarTodosLosContactos());
		assertEquals(0, deleteService.dataService.listaDeContactos.size());
	}
}
