package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Test;

public class SearchTestCase {
	
//	@Test
	public void testBusquedaDeContactosExistentes(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		ArrayList<Contacto> contactosEncontrados = agenda.buscarContacto(nombreTest);
		assertEquals(1, contactosEncontrados.size());			
		assertEquals(contactosEncontrados.get(0).getNombre(), contacto.getNombre());
		assertEquals(contactosEncontrados.get(0).getApellido(), contacto.getApellido());
		assertEquals(contactosEncontrados.get(0).getEmail(), contacto.getEmail());
		assertEquals(contactosEncontrados.get(0).getMovil(), contacto.getMovil());
		System.out.println("\nEncuentra contactos existentes");
	}
	
//	@Test
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
		ArrayList<Contacto> contactosEncontrados = agenda.buscarContacto(atributoTest);
		assertEquals(0, contactosEncontrados.size());
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
