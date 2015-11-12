package miagendaweb
import java.util.ArrayList;

class DataService {
	
	static transactional = true;
	
	public ArrayList<Contacto> listaDeContactos = new ArrayList<Contacto>();
	public int contador;

	def public DataService(ArrayList<Contacto> lista) {
		this.listaDeContactos = lista;
	}
	
	def public incrementoContador() {
		contador = contador+1;
	}
}
