package agenda;

import java.util.ArrayList;


//import java.util.Scanner;												
import javax.swing.JOptionPane;											
//import javax.swing.*;													

public class AppPrincipal {
	
	public static void main(String[] args) {
				
		JOptionPane.showMessageDialog(null, "Agenda Personal");
		//Scanner teclado=new Scanner(System.in);

		String textAux;
		int opcion=1;
		String nombreIngresado;
		String apellidoIngresado;
		String emailIngresado;
		String movilIngresado;
		
			while ((opcion<=6) || (opcion==0)){
			
			textAux=JOptionPane.showInputDialog("MENU DE OPCIONES:\nIngrese la opcion a realizar:\n1..Nuevo Contacto\n2..Buscar Contacto\n3..Modificar Contacto\n4..Eliminar Contacto\n5..Listado de Contactos\n6..Eliminar TODOS los contactos de la Agenda\n0..Salir de la Agenda");
			opcion=Integer.parseInt(textAux);							
		
			switch (opcion){
			case 1:
			
			do{
			nombreIngresado=JOptionPane.showInputDialog("Ingrese el nombre del nuevo contacto");
			}while(!validarNombre(nombreIngresado));
			
			do{
			apellidoIngresado=JOptionPane.showInputDialog("Ingrese el apellido del nuevo contacto");
			}while(!validarApellido(apellidoIngresado));
			
			do{
			emailIngresado=JOptionPane.showInputDialog("Ingrese el email del nuevo contacto");
			}while(!validarEmail(emailIngresado));
			
			do{
			movilIngresado=JOptionPane.showInputDialog("Ingrese el telefono movil del nuevo contacto en formato de diez numeros ej: 11XXXXXXXX");
			}while(!validarTelMovil(movilIngresado));
		
			Agenda contactoIngresado=new Agenda();
			contactoIngresado.agregarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado);
			System.out.println("Contacto Ingresado:\n"+nombreIngresado+"\t"+apellidoIngresado+"\t"+emailIngresado+"\t"+movilIngresado);
			
			break;
		
			}
		}	
	}
	

	public static boolean validarNombre(String nom1){
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

