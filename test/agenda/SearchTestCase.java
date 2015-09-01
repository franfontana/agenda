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
	
//	@Test
//	public void testEliminacionDeContacto(){
//		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
//		Agenda agenda = new Agenda(miLista);
//		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
//		assertEquals(1,miLista.size());
//		assertTrue(agenda.eliminarContacto("a", "b", "c", "d"));
//		assertEquals(0,miLista.size());
//		System.out.println("Elimina un contacto generado y corrobora en lista");
//	}
	
	@Test
	public void testBusquedaContactoExistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		Contacto contacto = miLista.get(0);
		assertEquals("a", contacto.getNombre());
		assertEquals("b", contacto.getApellido());
		assertEquals("c", contacto.getEmail());
		assertEquals("d", contacto.getMovil());
		System.out.println("Encuentra contacto existente");
	}
	
	@Test
	public void testBusquedaContactoInexistente(){
		
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		Contacto contacto = miLista.get(0);
		assertNotSame("v", contacto.getNombre());
		assertNotSame("x", contacto.getApellido());
		assertNotSame("y", contacto.getEmail());
		assertNotSame("z", contacto.getMovil());
		System.out.println("No encuentra contacto inexistente");
	}
	
//	@Test
//	public void testBusquedaContactoValido() {
//		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
//		Agenda agenda = new Agenda(miLista);
//		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
//		Contacto contacto = miLista.get(0);
//		System.out.println(contacto.getEmail());
//		assertEquals(true, agenda.contactoEnAgenda(contacto.getEmail()));
//		boolean resultadoFuncion = agenda.contactoEnAgenda(contacto.getEmail());
//		System.out.println(resultadoFuncion);
//		System.out.println("Encuentra contacto con Email");
//	}
	
//	@Test
//	public void testBusquedaContactoInvalido(){
//		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
//		Agenda agenda = new Agenda(miLista);
//		assertTrue(agenda.agregarContacto("a", "b", "", "d"));
//		assert(agenda.contactoEnAgenda("") | false);
//		System.out.println("Encuentra contacto sin Email");
//	}
	
	@Test
	public void testContactoDuplicado(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		assertTrue(agenda.agregarContacto("a", "b", "c", "d"));
		Contacto contacto1 = miLista.get(0);
		Contacto contacto2 = miLista.get(1);
		assertEquals(contacto1.getEmail(), contacto2.getEmail());
		System.out.println("Contacto Duplicado");
	}

}
