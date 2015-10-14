package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Test;

public class NewContactTestCase {

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
		assertEquals(1, agenda.contador);
		System.out.println("Guarda un nuevo contacto y corrobora en lista");
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
		agenda.contador = 1;
		assertEquals(1, miLista.size());
		assertFalse(agenda.agregarContacto(nombreTest, apellidoTest, emailTest, movilTest));	
		assertEquals(1, agenda.contador);
		System.out.println("No se permite agregar contacto duplicado");
	}

}
