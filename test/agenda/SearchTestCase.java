package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Test;

public class SearchTestCase {
	
	@Test
	public void testBusquedaDeContactosExistentesPorNombre(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String atributoTest = nombreTest;
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String contactosEncontrados = agenda.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);			
		System.out.println("\nEncuentra contactos existentes por nombre");
	}
	
	@Test
	public void testBusquedaDeContactosExistentesPorApellido(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String atributoTest = apellidoTest;
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String contactosEncontrados = agenda.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);			
		System.out.println("\nEncuentra contactos existentes por apellido");
	}
	
	@Test
	public void testBusquedaDeContactosExistentesPorNombreConIgualNombreYApellido(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String atributoTest = nombreTest;
		Contacto contacto = new Contacto(nombreTest, nombreTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String contactosEncontrados = agenda.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);			
		System.out.println("\nEncuentra contactos existentes con identico nombre y apellido buscado por nombre");
	}
	
	@Test
	public void testBusquedaDeContactosExistentesPorEmailConIgualNombreYApellido(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String atributoTest = emailTest;
		Contacto contacto = new Contacto(nombreTest, nombreTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String contactosEncontrados = agenda.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
		System.out.println("\nEncuentra contactos existentes con identico nombre y apellido buscado por nombre");
	}
	
	@Test
	public void testBusquedaDeContactosExistentesPorMovilConIgualNombreYApellido(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String atributoTest = movilTest;
		Contacto contacto = new Contacto(nombreTest, nombreTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String contactosEncontrados = agenda.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
		System.out.println("\nEncuentra contactos existentes con identico nombre y apellido buscado por nombre");
	}
	
	@Test
	public void testBusquedaDeContactosExistentesPorApellidoConIgualNombreYApellido(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String atributoTest = apellidoTest;
		Contacto contacto = new Contacto(apellidoTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String contactosEncontrados = agenda.buscarContactosMedianteAlgunAtributo(atributoTest);
		assertTrue(contactosEncontrados.length()>0);
		System.out.println("\nEncuentra contactos existentes con identico nombre y apellido buscado por apellido");
	}
	
	@Test
	public void testBusquedaContactoInexistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String atributoTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());		
		assertEquals(null, agenda.buscarUnContacto(atributoTest));
		System.out.println("No encuentra contacto inexistente");
	}
	
	@Test 
	public void testBusquedaContactoExistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		assertEquals(contacto, agenda.buscarUnContacto(emailTest));	
		System.out.println("Encuentra contacto mediante email");
	}

}
