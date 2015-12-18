package miagendaweb

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

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
	
	void testBusquedaDeContactosExistentesPorEmailConIgualNombreYApellido(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String atributoTest = emailTest;
		Contacto contacto = new Contacto(nombreTest, nombreTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		String contactosEncontrados = searchService.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
	}
	
	void testBusquedaDeContactosExistentesPorMovilConIgualNombreYApellido(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String atributoTest = movilTest;
		Contacto contacto = new Contacto(nombreTest, nombreTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		String contactosEncontrados = searchService.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
	}
	
	void testBusquedaDeContactosExistentesPorApellidoConIgualNombreYApellido(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String atributoTest = apellidoTest;
		Contacto contacto = new Contacto(apellidoTest, apellidoTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		String contactosEncontrados = searchService.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
	}
	
	void testNoEncuentraContactosInexistentesMedianteExpresion(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		String expresionTest = nombreTest;
		assertEquals(0, searchService.dataService.listaDeContactos.size());

		assertEquals(0, searchService.buscarContactosMedianteAlgunAtributo(expresionTest).size());		//Se modifico assert respecto a app Java original por no arrojar resultado esperado en groovy		
//		assertEquals(0, contactosEncontrados.length());
	}
	
	void testNoEncuentraContactosInexistentesSinExpresion(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		assertEquals(0, searchService.dataService.listaDeContactos.size());
		assertEquals(0, searchService.buscarContactosMedianteAlgunAtributo(null).size());
	}
	
	void testNoEncuentraContactosExistentesMedianteExpresionNULL(){
		searchService = new SearchService();
		searchService.dataService = new DataService();
		Contacto contacto = new Contacto(apellidoTest, apellidoTest, emailTest, movilTest);
		searchService.dataService.listaDeContactos.add(contacto);
		assertEquals(1, searchService.dataService.listaDeContactos.size());
		assertEquals(0, searchService.buscarContactosMedianteAlgunAtributo(null).size());
	}
}
