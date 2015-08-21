package agenda;


public class Contacto {

//Declaro variables
	public static String nombre;
	public static String apellido;
	public static String email;
	public static String movil;

//Funcion para cuando no se ingresa contacto.
	public Contacto(){
		this.nombre=null;
		this.apellido=null;
		this.email=null;
		this.movil=null;
	}
	
//Funcion para ingreso de cualquier contacto.
	public Contacto(String nombre, String apellido, String email, String movil){
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.movil=movil;
	}

//Funcion para seteo de Nombre.
	public void setNombre(String nomb){
		this.nombre=nomb.toUpperCase();
	}
	
	
}
