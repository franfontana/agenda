package miagendaweb
import java.util.ArrayList;

class DataService {
	
	static transactional = true;
	
	public ArrayList<Contacto> listaDeContactos;

	public int contador;
	
	def incrementoContador() {
		contador = contador+1;
	}

	public DataService() {
		listaDeContactos = new ArrayList<Contacto>();
	}

	public DataService(ArrayList<Contacto> lista) {
		listaDeContactos = lista;
	}
}
