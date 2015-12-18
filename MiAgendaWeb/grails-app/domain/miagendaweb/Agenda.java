package miagendaweb;

import java.util.ArrayList;

public class Agenda {

	protected ArrayList<Contacto> listaDeContactos= new ArrayList<Contacto>();
	protected int contador = 0;
	
	public Agenda() {

	}

	public Agenda(ArrayList<Contacto> lista) {
		this.listaDeContactos = lista;
	}
	
}
