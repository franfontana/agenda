package agenda;

import java.util.ArrayList;

public class Agenda {

//Constructor de Contactos.
	ArrayList<Contacto> listaDeContactos= new ArrayList<Contacto>();
	
	public Agenda() {

	}

	public Agenda(ArrayList<Contacto> lista) {
		this.listaDeContactos = lista;
	}

	public boolean agregarContacto(String nombre, String apellido, String email, String movil){
		Contacto unContacto = new Contacto(nombre, apellido, email, movil);
		this.listaDeContactos.add(unContacto);
		return true;
	}
	
	public boolean eliminarContacto(String nombre, String apellido, String email, String movil){
		Contacto unContacto = new Contacto(nombre, apellido, email, movil);
		this.listaDeContactos.remove(unContacto);
		return true;
	}
	
	public Contacto buscarContacto(String nombre, String apellido, String email, String movil){
		Contacto retorno;
		Contacto unContacto = new Contacto(nombre, apellido, email, movil);
		if(this.listaDeContactos.contains(unContacto)){
			retorno = unContacto;
		}else{
			retorno = null;
		}		
		return retorno;
	}

//	public boolean contactoEnAgenda(String email1){
//		boolean retval=this.listaDeContactos.contains(email1);
//		return retval;
//	}



//	public int consultarAgenda(String nom1, String ape1, String email1, String mov1){
//		int contadorDeContactos=0;
//		for(int i=0; i<=contadorDeContactos; i++){
//			if(email1.equals(listaDeContactos[i].getEmail())){
//				System.out.println("El contacto ya existe en la agenda");
//				return 1;
//			}else{
//				contadorDeContactos++;
//				return 0;
//			}
//		}		
//	}
}
