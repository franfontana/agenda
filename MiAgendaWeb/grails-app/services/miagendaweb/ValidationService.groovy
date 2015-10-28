package miagendaweb
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidationService {

    static transactional = true;

    def boolean validarNombre(String nom1){
		if(nom1.length()>0) return true;
		else return false;
	}
	
	def boolean validarApellido(String ape1){
		if(ape1.length()>0) return true;
		else return false;
	}
	
	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
	
	def boolean validarEmail(String email) {
		
			   // Compiles the given regular expression into a pattern.
			   Pattern pattern = Pattern.compile(PATTERN_EMAIL);
		
			   // Match the given input against this pattern
			   Matcher matcher = pattern.matcher(email);
			   return matcher.matches();
		   }
	
//	def boolean validarEmail(String email1){
//		int arroba=0;
//		for (int posicionCaracter=0; posicionCaracter<email1.length(); posicionCaracter++){
//			if((email1.charAt(posicionCaracter)=='@')){ 
//				arroba=arroba+1;
//				if((posicionCaracter==0) || (posicionCaracter==email1.length()-1)) arroba=arroba+1;
//			}
//		}
//		if(arroba==1) return true;
//		else return false;
//	}
	
	def boolean validarTelMovil(String mov1){
		if(mov1.length()==10 && mov1.matches("[0-9]*")) return true;
//		if(mov1.length()==10 && esNumerico(mov1)) return true;		
		else return false;
	}
	
//	ESTE METODO PARA VALIDAR SI EL DATO (STRING) ES NUMERICO NO FUNCIONA PARA EL CASO EN QUE EL NUMERO SEA DEMASIADO GRANDE POR EL MAXIMO VALOR QUE EL INTEGER PUEDE PROCESAR
//	def boolean esNumerico(String cadena){
//		try {
//			Integer.parseInt(cadena);
//			return true;
//		} catch (NumberFormatException nfe){
//			return false;
//		}
//	}
}
