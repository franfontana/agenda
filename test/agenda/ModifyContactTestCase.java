package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Test;

public class ModifyContactTestCase {
	
	@Test
	public void testModificaAtributosDeContactoExistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String emailDeContactoAModificar = emailTest;
		String[] atributoAModificar = {"Nombre", "Apellido", "Email", "Movil"};
		int numRandom = (int) Math.round(Math.random());
		String nuevoValorDeAtributo = UUID.randomUUID().toString();
		assertTrue(agenda.modificarContacto(emailDeContactoAModificar, atributoAModificar[numRandom], nuevoValorDeAtributo));
		System.out.println("Modifica contacto existente");
	}
	
	@Test
	public void testNoModificaAtributosDeContactoInexistente(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String emailDeContactoAModificar = UUID.randomUUID().toString();
		String atributoAModificar = UUID.randomUUID().toString();
		String nuevoValorDeAtributo = UUID.randomUUID().toString();
		assertFalse(agenda.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		System.out.println("No Modifica contacto inexistente");
	}

	@Test
	public void testModificaAtributosDeContacto_Nombre(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Nombre";
		String nuevoValorDeAtributo = UUID.randomUUID().toString();
		assertTrue(agenda.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getNombre(), nuevoValorDeAtributo);
		System.out.println("Modifica el atributo Nombre del contacto");
	}
	
	@Test
	public void testModificaAtributosDeContacto_Apellido(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Apellido";
		String nuevoValorDeAtributo = UUID.randomUUID().toString();
		assertTrue(agenda.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getApellido(), nuevoValorDeAtributo);
		System.out.println("Modifica el atributo Apellido del contacto");
	}
	
	@Test
	public void testModificaAtributosDeContacto_Email(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Email";
		String nuevoValorDeAtributo = UUID.randomUUID().toString();
		assertTrue(agenda.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getEmail(), nuevoValorDeAtributo);
		System.out.println("Modifica el atributo Email del contacto");
	}
	
	@Test
	public void testModificaAtributosDeContacto_Movil(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String emailDeContactoAModificar = emailTest;
		String atributoAModificar = "Movil";
		String nuevoValorDeAtributo = UUID.randomUUID().toString();
		assertTrue(agenda.modificarContacto(emailDeContactoAModificar, atributoAModificar, nuevoValorDeAtributo));
		assertEquals(contacto.getMovil(), nuevoValorDeAtributo);
		System.out.println("Modifica el atributo Movil del contacto");
	}

}
