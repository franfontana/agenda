package agenda;

//import java.util.Scanner;												//Libreria para I/O
import javax.swing.JOptionPane;											//Libreria para Notificaciones
//import javax.swing.*;													

public class AppPrincipal {

	public static void main(String[] args) {
				
		JOptionPane.showMessageDialog(null, "Agenda Personal");
		//Scanner teclado=new Scanner(System.in);
		
		//Variables de Agenda
		//String nombre;
		//String apellido;
		
		
		//Variables del menu
		String textAux;
		int opcion=1;												//Primer ingreso al bucle del menu.
		
		while ((opcion==1) || (opcion==2) || (opcion==3) || (opcion==4) || (opcion==5) || (opcion==6)){
			
			textAux=JOptionPane.showInputDialog("MENU DE OPCIONES:\nIngrese la opcion a realizar:\n1..Nuevo Contacto\n2..Buscar Contacto\n3..Modificar Contacto\n4..Eliminar Contacto\n5..Listado de Contactos\n6..Eliminar TODOS los contactos de la Agenda\n0..Salir de la Agenda");
			opcion=Integer.parseInt(textAux);							
		
			switch (opcion){
			case 1:
			
			do{
			Contacto.nombre=JOptionPane.showInputDialog("Ingrese el nombre del nuevo contacto");
			System.out.println(Contacto.nombre);
			}while(!validarNombre(Contacto.nombre));
			
			do{
			Contacto.apellido=JOptionPane.showInputDialog("Ingrese el apellido del nuevo contacto");
			}while(!validarApellido(Contacto.apellido));
			
			do{
			Contacto.email=JOptionPane.showInputDialog("Ingrese el email del nuevo contacto");
			}while(!validarEmail(Contacto.email));
			
			do{
			Contacto.movil=JOptionPane.showInputDialog("Ingrese el telefono movil del nuevo contacto en formato de diez numeros ej: 11XXXXXXXX");
			}while(!validarTelMovil(Contacto.movil));
									
//			if (validarTelMovil(Contacto.movil)){
//				System.out.println("El Cel esta ingresado OK");
//				
//			}else{
//				break;
//			}
			
//			if(validarEnAgenda){
//				
//			}else{	
//				JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos o ya existen en la agenda");
//			}
		
			}
		}	
	}
	
//	public validarEmail(){
//		
//		
//		
//	}
	public static boolean validarNombre(String nom1){
		//boolean nom2=StringToBool(nom1);
		if(nom1.length()>0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean validarApellido(String ape1){
		if(ape1.length()>0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean validarEmail(String email1){
		int arroba=0;
		for (int posicionCaracter=0; posicionCaracter<email1.length(); posicionCaracter++){
			if((email1.charAt(posicionCaracter)=='@')){ 
				arroba=arroba+1;
				if((posicionCaracter==0) || (posicionCaracter==email1.length()-1)){
					arroba=arroba+1;
				}
			}
		}
		if(arroba==1){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean validarTelMovil(String mov1){
		if(mov1.length()==10){
			return true;
		}else{
			return false;
		}
	}

}
