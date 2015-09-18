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
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		assertTrue(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		assertEquals(1, miLista.size());
		System.out.println("Guarda un nuevo contacto y corrobora en lista");
	}
	
	@Test
	public void testEliminacionDeContacto(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);		
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1,miLista.size());
		assertTrue(agenda.eliminarContacto(nombreTest, apellidoTest, emailTest, movilTest));
		assertEquals(0,miLista.size());
		System.out.println("Elimina un contacto generado y corrobora en lista");
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
		ArrayList<Contacto> contactosEncontrados = agenda.buscarContacto(nombreTest);
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
	public void testNoPermiteContactoDuplicado(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);		
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		assertFalse(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));			
		System.out.println("No se permite agregar contacto duplicado");
	}

}
