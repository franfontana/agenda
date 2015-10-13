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
	
	public boolean modificarContacto(String emailDeContactoAModificar, String atributoAModificar, String nuevoValorDeAtributo) {
		boolean retorno = false;
		int opcion = 0;
		if(atributoAModificar.equals("Nombre")) opcion = 1;
		if(atributoAModificar.equals("Apellido")) opcion = 2;
		if(atributoAModificar.equals("Email")) opcion = 3;
		if(atributoAModificar.equals("Movil")) opcion = 4;
		Contacto contactoAModificar = buscarUnContacto(emailDeContactoAModificar);
		if(contactoAModificar != null){
			switch(opcion){
			case 1:
				contactoAModificar.setNombre(nuevoValorDeAtributo);
				retorno = true;
				break;
			case 2:
				contactoAModificar.setApellido(nuevoValorDeAtributo);
				retorno = true;
				break;
			case 3:
				contactoAModificar.setEmail(nuevoValorDeAtributo);
				retorno = true;
				break;
			case 4:
				contactoAModificar.setMovil(nuevoValorDeAtributo);
				retorno = true;
				break;
			}
		}else{
			retorno = false;
		}
		return retorno;
	}
	
	public String mostrarTodosLosContactos(){
		String retorno;
		String listaAMostrar = "";
		if(listaDeContactos.size() > 0){
			for(Contacto c : listaDeContactos){			
				listaAMostrar+="Nombre:" + c.getNombre() + "\t" + "Apellido:" + c.getApellido() + "\t" + "Email:" + c.getEmail() + "\t" + "Movil:" + c.getMovil() + "\n";	
			}
			retorno = listaAMostrar;
		}else{	
			retorno = null;
		}
		return retorno;
	}
	
	public boolean eliminarTodosLosContactos(){
		boolean retorno;
		if(listaDeContactos.size() > 0){
			listaDeContactos.removeAll(listaDeContactos);
			retorno = true;
		}else{
			retorno = false;
		}
		return retorno;
	}
	
}
