package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Test;

public class ShowContactTestCase {

	@Test
	public void testMuestraTodosLosContactosExistiendoAlMenosUno(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		assertTrue(agenda.mostrarTodosLosContactos().length()>0);
		System.out.println("Muestra todos los contactos");
	}
	
	@Test
	public void testMuestraTodosLosContactosExistiendoMasDeUno(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		String otronombreTest = UUID.randomUUID().toString();
		String otroapellidoTest = UUID.randomUUID().toString();
		String otroemailTest = UUID.randomUUID().toString();
		String otromovilTest = UUID.randomUUID().toString();
		Contacto contacto1 = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto1);
		Contacto contacto2 = new Contacto(otronombreTest, otroapellidoTest, otroemailTest, otromovilTest);
		miLista.add(contacto2);
		assertEquals(2, miLista.size());
		assertTrue(agenda.mostrarTodosLosContactos().length()>0);
		System.out.println("Muestra todos los contactos (mas de dos)");
	}
	
	@Test
	public void testNoExisteAlMenosUnContactoParaMostrar(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		assertEquals(0, miLista.size());
		assertEquals(null, agenda.mostrarTodosLosContactos());
		System.out.println("No existe lista de contactos para mostrar");
	}

}
