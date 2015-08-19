package agenda;


public class Contacto {

//Declaro variables
	private String nombre;
	private String apellido;
	private String email;
	private String movil;

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
}
