package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Test;

public class SearchTestCase {
	
	@Test
	public void testAltaDeContacto(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String name = UUID.randomUUID().toString();
		String lastname = UUID.randomUUID().toString();
		String email = UUID.randomUUID().toString();
		String phone = UUID.randomUUID().toString();
		String nombreTest = new String(name);
		String apellidoTest = new String(lastname);
		String emailTest = new String(email);
		String movilTest = new String(phone);
		assertTrue(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		assertEquals(1, miLista.size());
		System.out.println("Guarda un nuevo contacto y corrobora en lista");
	}
	
	@Test
	public void testEliminacionDeContacto(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String name = UUID.randomUUID().toString();
		String lastname = UUID.randomUUID().toString();
		String email = UUID.randomUUID().toString();
		String phone = UUID.randomUUID().toString();
		String nombreTest = new String(name);
		String apellidoTest = new String(lastname);
		String emailTest = new String(email);
		String movilTest = new String(phone);
		assertTrue(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		assertEquals(1,miLista.size());
		assertTrue(agenda.eliminarContacto(name, lastname, email, phone));
		assertEquals(0,miLista.size());
		System.out.println("Elimina un contacto generado y corrobora en lista");
	}
	
	@Test
	public void testBusquedaContactoExistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String name = UUID.randomUUID().toString();
		String nombreTest = new String(name);
		String apellidoTest = new String("b");
		String emailTest = new String("c");
		String movilTest = new String("d");
		assertTrue(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		Contacto contacto = miLista.get(0);
		ArrayList<Contacto> contactosEncontrados = agenda.buscarContacto(name);
		assertEquals(1, contactosEncontrados.size());			
		assertEquals(contactosEncontrados.get(0).getNombre(), contacto.getNombre());
		assertEquals(contactosEncontrados.get(0).getApellido(), contacto.getApellido());
		assertEquals(contactosEncontrados.get(0).getEmail(), contacto.getEmail());
		assertEquals(contactosEncontrados.get(0).getMovil(), contacto.getMovil());
		System.out.println("\nEncuentra contacto existente");
	}
	
	@Test
	public void testBusquedaContactoInexistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String name = UUID.randomUUID().toString();
		String lastname = UUID.randomUUID().toString();
		String email = UUID.randomUUID().toString();
		String phone = UUID.randomUUID().toString();
		String nombreTest = new String(name);
		String apellidoTest = new String(lastname);
		String emailTest = new String(email);
		String movilTest = new String(phone);
		assertTrue(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		String atributoTest = UUID.randomUUID().toString();
		ArrayList<Contacto> contactosEncontrados = agenda.buscarContacto(atributoTest);
		assertTrue(contactosEncontrados.size() == 0);
		System.out.println("No encuentra contacto inexistente");
	}
	
	@Test
	public void testNoPermiteContactoDuplicado(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);		
		String name = UUID.randomUUID().toString();
		String lastname = UUID.randomUUID().toString();
		String email = UUID.randomUUID().toString();
		String phone = UUID.randomUUID().toString();
		String nombreTest = new String(name);
		String apellidoTest = new String(lastname);
		String emailTest = new String(email);
		String movilTest = new String(phone);
		assertTrue(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		Contacto contacto1 = miLista.get(0);
		ArrayList<Contacto> contactosEncontrados1 = agenda.buscarContacto(email);
		assertEquals(1, contactosEncontrados1.size());			
		assertEquals(contactosEncontrados1.get(0).getNombre(), contacto1.getNombre());
		assertEquals(contactosEncontrados1.get(0).getApellido(), contacto1.getApellido());
		assertEquals(contactosEncontrados1.get(0).getEmail(), contacto1.getEmail());
		assertEquals(contactosEncontrados1.get(0).getMovil(), contacto1.getMovil());	
		assertFalse(agenda.agregarContacto(name, lastname, email, phone));		
		System.out.println("No se permite agregar contacto duplicado");
	}

}
