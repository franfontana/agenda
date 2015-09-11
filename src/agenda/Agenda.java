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
		ArrayList<Contacto> contactosEncontrados = buscarContacto(email);
		if(contactosEncontrados.size() == 0){
			Contacto unContacto1 = new Contacto(nombre, apellido, email, movil);
			this.listaDeContactos.add(unContacto1);
			System.out.println("\nContacto ingresado correctamente:\n" + "Nombre:" + unContacto1.getNombre() + "\t" + "Apellido:" + unContacto1.getApellido() + "\t" + "Email:" + unContacto1.getEmail() + "\t" + "Movil:" + unContacto1.getMovil() + "\n");
			retorno = true;
		}else{
			retorno = false;
		}
		return retorno;
	}
	
	public boolean eliminarContacto(String nombre, String apellido, String email, String movil){
		Contacto unContacto2 = new Contacto(nombre, apellido, email, movil);
		this.listaDeContactos.remove(unContacto2);
		return true;
	}
	
	public ArrayList<Contacto> buscarContacto(String busqueda){
		ArrayList<Contacto> auxList = new ArrayList<Contacto>();
		String mostrarBusqueda = "";
		for(Contacto c : listaDeContactos) {
			if(c.getNombre().equals(busqueda)) {
				mostrarBusqueda += "Nombre:" + c.getNombre();
				mostrarBusqueda += "\tApellido:" + c.getApellido();
				mostrarBusqueda += "\tEmail:" + c.getEmail();
				mostrarBusqueda += "\tMovil:" + c.getMovil()  + "\n";
				Contacto unContacto3 =  new Contacto(c.getNombre(), c.getApellido(), c.getEmail(), c.getMovil());
				auxList.add(unContacto3);
			}
			if(c.getApellido().equals(busqueda)) {
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
		if(auxList.size() == 0){
			System.out.println("No existe contacto con dicho atributo.");
		}
		return auxList;
	}
	
}
