package agenda;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Contacto> listaDeContactos= new ArrayList<Contacto>();
	int index;
	
	public Agenda() {

	}

	public Agenda(ArrayList<Contacto> lista) {
		this.listaDeContactos = lista;
	}

	public boolean agregarContacto(String nombre, String apellido, String email, String movil){
		boolean retorno;
		if(buscarUnContacto(email) == null){
			Contacto unContacto1 = new Contacto(nombre, apellido, email, movil);
			if(this.listaDeContactos.add(unContacto1)) retorno = true; else retorno = false;				
		}else retorno = false;		
		return retorno;
	}
	
	public boolean eliminarContacto(String email){
		boolean retorno;
		if(this.listaDeContactos.remove(buscarUnContacto(email))) retorno = true; else retorno = false;
		return retorno;
	}
	
	public Contacto buscarUnContacto(String email){
		Contacto contactoEncontrado = null;
		for(Contacto c : listaDeContactos){
			if(c.getEmail().equals(email)) contactoEncontrado = c; else contactoEncontrado = null;
		}
		return contactoEncontrado;
	}
	
	public ArrayList<Contacto> buscarContactosMedianteAlgunAtributo(String busqueda){
		ArrayList<Contacto> auxList = new ArrayList<Contacto>();
		String mostrarBusqueda = "";
		for(Contacto c : listaDeContactos) {
			if((c.getNombre().equals(busqueda)) || (c.getNombre().equals(c.getApellido())) && !(c.getEmail().equals(busqueda)) && !(c.getMovil().equals(busqueda))) {
				mostrarBusqueda += "Nombre:" + c.getNombre();
				mostrarBusqueda += "\tApellido:" + c.getApellido();
				mostrarBusqueda += "\tEmail:" + c.getEmail();
				mostrarBusqueda += "\tMovil:" + c.getMovil()  + "\n";
				Contacto unContacto3 =  new Contacto(c.getNombre(), c.getApellido(), c.getEmail(), c.getMovil());
				auxList.add(unContacto3);
			}
			if((c.getApellido().equals(busqueda)) && (!c.getApellido().equals(c.getNombre()))) {
				mostrarBusqueda += "Nombre:" + c.getNombre();
				mostrarBusqueda += "\tApellido:" + c.getApellido();
				mostrarBusqueda += "\tEmail:" + c.getEmail();
				mostrarBusqueda += "\tMovil:" + c.getMovil()  + "\n";
				Contacto unContacto3 =  new Contacto(c.getNombre(), c.getApellido(), c.getEmail(), c.getMovil());
				auxList.add(unContacto3);
			}				
			if(c.getEmail().equals(busqueda)) {
				mostrarBusqueda += "Nombre:" + c.getNombre();
				mostrarBusqueda += "\tApellido:" + c.getApellido();
				mostrarBusqueda += "\tEmail:" + c.getEmail();
				mostrarBusqueda += "\tMovil:" + c.getMovil() + "\n";
				Contacto unContacto3 =  new Contacto(c.getNombre(), c.getApellido(), c.getEmail(), c.getMovil());
				auxList.add(unContacto3);
			}
			if(c.getMovil().equals(busqueda)) {
				mostrarBusqueda += "Nombre:" + c.getNombre();
				mostrarBusqueda += "\tApellido:" + c.getApellido();
				mostrarBusqueda += "\tEmail:" + c.getEmail();
				mostrarBusqueda += "\tMovil:" + c.getMovil() + "\n";
				Contacto unContacto3 =  new Contacto(c.getNombre(), c.getApellido(), c.getEmail(), c.getMovil());
				auxList.add(unContacto3);	
			}
		}		
		if(auxList.size() != 0){
			System.out.println("\nContactos Encontrados:");
			System.out.println(mostrarBusqueda);
		}
		return auxList;
	}
	
	public boolean modificarContacto(String nombre, String apellido, String email, String movil, String nuevoNombre, String nuevoApellido, String nuevoEmail, String nuevoMovil) {
		ArrayList<Contacto> auxList2 = new ArrayList<Contacto>();
		boolean retorno = false;
		auxList2 = buscarContacto(nuevoEmail);
			if(auxList2.size() == 0 || nuevoEmail == email){
				eliminarContacto(nombre, apellido, email, movil);
			}else{
				retorno = false;
			}			
		retorno = agregarContacto(nuevoNombre, nuevoApellido, nuevoEmail, nuevoMovil);
		if(retorno == false){
			System.out.println("\nNo se ha modificado el contacto.");
		}
		return retorno;
	}
	
	public boolean mostrarTodosLosContactos(){
		boolean retorno;
		if(listaDeContactos.size() > 0){
			retorno = true;			
			for(Contacto c : listaDeContactos){
				System.out.println("Nombre:" + c.getNombre() + "\t" + "Apellido:" + c.getApellido() + "\t" + "Email:" + c.getEmail() + "\t" + "Movil:" + c.getMovil());
			}
		}else{
			retorno  = false;
		}
		return retorno;
	}
	
	public boolean eliminarTodosLosContactos(){
		boolean retorno;
		if(listaDeContactos.size() > 0){
			retorno = true;
			listaDeContactos.removeAll(listaDeContactos);
			System.out.println("Todos los contactos han sido eliminados.");
		}else{
			retorno = false;
		}
		return retorno;
	}
	
}
