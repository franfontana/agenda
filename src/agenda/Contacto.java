package agenda;


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

	public void setNombre(String nomb){
		this.nombre=nomb.toUpperCase();
	}
	
	public String getEmail(){
		return this.email;
	}

		public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
@Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Contacto other = (Contacto) obj;
        boolean sameA = (this.email == other.email) || (this.email != null && this.email.equalsIgnoreCase(other.email));
        if (!sameA) return false;
        return true;
    }

}
