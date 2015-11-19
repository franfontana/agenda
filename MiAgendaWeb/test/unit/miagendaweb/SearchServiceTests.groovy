package miagendaweb

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import grails.test.*
import static java.util.UUID.randomUUID;

class SearchServiceTests extends GrailsUnitTestCase {
	
	String nombreTest = randomUUID() as String;
	String apellidoTest = randomUUID() as String;
	String emailTest = randomUUID() as String;
	String movilTest = randomUUID() as String;
	SearchService searchService;
	
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

	void testBusquedaContactoInexistente(){		
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String atributoTest = randomUUID() as String;
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);		
		assertEquals(null, searchService.buscarUnContacto(atributoTest));
	}
	
	void testBusquedaContactoExistente(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		assertEquals(contacto, searchService.buscarUnContacto(emailTest));
	}
	
	void testBusquedaDeContactosExistentesPorNombre(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String atributoTest = nombreTest;
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		String contactosEncontrados = searchService.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
	}
	
	void testBusquedaDeContactosExistentesPorApellido(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String atributoTest = apellidoTest;
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		String contactosEncontrados = searchService.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
	}
	
	void testBusquedaDeContactosExistentesPorNombreConIgualNombreYApellido(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String atributoTest = nombreTest;
		Contacto contacto = new Contacto(nombreTest, nombreTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		String contactosEncontrados = searchService.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
	}
}
