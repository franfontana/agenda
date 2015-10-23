package miagendaweb

class ValidationService {

    static transactional = true

    def boolean validarNombre(String nom1){
		if(nom1.length()>0) return true;
		else return false;
	}
	
	def boolean validarApellido(String ape1){
		if(ape1.length()>0) return true;
		else return false;
	}
	
	def boolean validarEmail(String email1){
		int arroba=0;
		for (int posicionCaracter=0; posicionCaracter<email1.length(); posicionCaracter++){
			if((email1.charAt(posicionCaracter)=='@')){ 
				arroba=arroba+1;
				if((posicionCaracter==0) || (posicionCaracter==email1.length()-1)) arroba=arroba+1;
			}
		}
		if(arroba==1) return true;
		else return false;
	}
	
	def boolean validarTelMovil(String mov1){
		if(mov1.length()==10 && esNumerico(mov1)) return true;
		else return false;
	}
	
	def boolean esNumerico(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
