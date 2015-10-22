package miagendaweb;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Contacto> listaDeContactos= new ArrayList<Contacto>();
	int contador = 0;
	
	public Agenda() {

	}

	public Agenda(ArrayList<Contacto> lista) {
		this.listaDeContactos = lista;
	}
	
}
