package agenda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Test;

public class ModifyContactTestCase {

	@Test
	public void testModificaAtributosDeContacto(){
		ArrayList<Contacto> miLista = new ArrayList<Contacto>();
		Agenda agenda = new Agenda(miLista);
		String nombreTest = UUID.randomUUID().toString();
		String apellidoTest = UUID.randomUUID().toString();
		String emailTest = UUID.randomUUID().toString();
		String movilTest = UUID.randomUUID().toString();
		Contacto contacto = new Contacto(nombreTest, apellidoTest, emailTest, movilTest);
		miLista.add(contacto);
		assertEquals(1, miLista.size());
		String nuevoNombreTest = UUID.randomUUID().toString();
		String nuevoApellidoTest = UUID.randomUUID().toString();
		String nuevoEmailTest = UUID.randomUUID().toString();
		String nuevoMovilTest = UUID.randomUUID().toString();
		assertTrue(agenda.modificarContacto(nombreTest, apellidoTest, emailTest, movilTest, nuevoNombreTest, nuevoApellidoTest, nuevoEmailTest, nuevoMovilTest));
		System.out.println("Modifica los atributos del contacto");
	}

}
