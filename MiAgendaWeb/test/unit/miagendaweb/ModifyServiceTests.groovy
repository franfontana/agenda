package miagendaweb

import grails.test.*
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.util.UUID.randomUUID;
import static java.util.Random.*;

class ModifyServiceTests extends GrailsUnitTestCase {
	
	String nombreTest = randomUUID() as String;
	String apellidoTest = randomUUID() as String;
	String emailTest = randomUUID() as String;
	String movilTest = randomUUID() as String;
	ModifyService modifyService;
	
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testModificaAtributosDeContactoExistente() {

		modifyService = new ModifyService();
		modifyService.searchService = new SearchService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		String emailDeContactoAModificar = emailTest;
		
		String[] atributoAModificar = ["Nombre", "Apellido", "Email", "Movil"];
		
		int numRandom = Math.round(Math.random());
		
		String nuevoValorDeAtributo = randomUUID() as String;
		modifyService.searchService.metaClass {buscarUnContacto() {String email -> return contacto}};
		assertTrue(modifyService.modificarContacto(emailDeContactoAModificar, atributoAModificar[numRandom], nuevoValorDeAtributo));
    }
	
	void testNoModificaAtributosDeContactoInexistente(){
		modifyService = new ModifyService();
		modifyService.searchService = new SearchService();
		String emailDeContactoAModificar = randomUUID() as String;
		
		String[] atributoAModificar = ["Nombre", "Apellido", "Email", "Movil"];		//Distinto en app Java donde este atributo es un string random
		
		int numRandom = Math.round(Math.random());
		String nuevoValorDeAtributo = randomUUID() as String;
		modifyService.searchService.metaClass {buscarUnContacto() {String email -> return null}};
		assertFalse(modifyService.modificarContacto(emailDeContactoAModificar, atributoAModificar[numRandom], nuevoValorDeAtributo));
	}
	
	void testModificaAtributosDeContacto_Nombre(){
		modifyService = new ModifyService();
		modifyService.searchService = new SearchService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Nombre";
		String nuevoValorDeAtributo = randomUUID() as String;
		modifyService.searchService.metaClass {buscarUnContacto() {String email -> return contacto}};
		assertTrue(modifyService.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getNombre(), nuevoValorDeAtributo);
	}
	
	void testModificaAtributosDeContacto_Apellido(){
		modifyService = new ModifyService();
		modifyService.searchService = new SearchService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Apellido";
		String nuevoValorDeAtributo = randomUUID() as String;
		modifyService.searchService.metaClass {buscarUnContacto() {String email -> return contacto}};
		assertTrue(modifyService.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getApellido(), nuevoValorDeAtributo);
	}
	
	void testModificaAtributosDeContacto_Email(){
		modifyService = new ModifyService();
		modifyService.searchService = new SearchService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Email";
		String nuevoValorDeAtributo = randomUUID() as String;
		modifyService.searchService.metaClass {buscarUnContacto() {String email -> return contacto}};
		assertTrue(modifyService.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getEmail(), nuevoValorDeAtributo);
	}
	
	void testModificaAtributosDeContacto_Movil(){
		modifyService = new ModifyService();
		modifyService.searchService = new SearchService();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Movil";
		String nuevoValorDeAtributo = randomUUID() as String;
		modifyService.searchService.metaClass {buscarUnContacto() {String email -> return contacto}};
		assertTrue(modifyService.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getMovil(), nuevoValorDeAtributo);
	}
}
