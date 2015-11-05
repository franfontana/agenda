package miagendaweb;

public class Contacto {

	private String nombre, apellido, email, movil;

	public Contacto(){
		nombre="";
		apellido="";
		email="";
		movil="";
	}
	
	public Contacto(String nombre, String apellido, String email, String movil){
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.movil=movil;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getMovil() {
		return movil;
	}
	
@Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Contacto other = (Contacto) obj;
        return (this.email == other.email) || (this.email != null && this.email.equalsIgnoreCase(other.email));
    }

}
