package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SearchTestCase {
	
	@Test
	public void testAltaDeContacto(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		assertEquals(1, miLista.size());
		System.out.println("Guarda un nuevo contacto y corrobora en lista");
	}
	
	@Test
	public void testEliminacionDeContacto(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		assertEquals(1,miLista.size());
		assertTrue(agenda.eliminarContacto("a", "b", "c", "d"));
		assertEquals(0,miLista.size());
		System.out.println("Elimina un contacto generado y corrobora en lista");
	}
	
	@Test
	public void testBusquedaContactoExistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		Contacto contacto = miLista.get(0);
		Contacto contactoEncontrado = agenda.buscarContacto("a", "b", "c", "d");		
		assertEquals(contactoEncontrado.getNombre(), contacto.getNombre());
		assertEquals(contactoEncontrado.getApellido(), contacto.getApellido());
		assertEquals(contactoEncontrado.getEmail(), contacto.getEmail());
		assertEquals(contactoEncontrado.getMovil(), contacto.getMovil());
		System.out.println("Encuentra contacto existente");
	}
	
	@Test
	public void testBusquedaContactoInexistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		Contacto contactoEncontrado = agenda.buscarContacto("e", "f", "g", "h");
		assertNull(contactoEncontrado);
		assertNull(contactoEncontrado);
		assertNull(contactoEncontrado);
		assertNull(contactoEncontrado);
		System.out.println("No encuentra contacto inexistente");
	}
	
	@Test
	public void testNoPermiteContactoDuplicado(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);		
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		Contacto contacto1 = miLista.get(0);
		Contacto contactoEncontrado1 = agenda.buscarContacto("a", "b", "c", "d");
		assertEquals(contacto1, contactoEncontrado1);		
		assertFalse(agenda.agregarContacto("a", "b", "c", "d"));		
		System.out.println("No se permite agregar contacto duplicado");
	}

}
