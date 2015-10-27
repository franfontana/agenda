package miagendaweb
import java.util.ArrayList;

class DataService {
	
	static transactional = true;
	
	ArrayList<Contacto> listaDeContactos= new ArrayList<Contacto>();
	int contador = 0;
	
	 def public Agenda() {

	}

	def public Agenda(ArrayList<Contacto> lista) {
		this.listaDeContactos = lista;
	}

    
    def serviceMethod() {

    }
}
