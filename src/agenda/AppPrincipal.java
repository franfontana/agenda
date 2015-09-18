package agenda;

import java.util.ArrayList;
import java.util.Scanner;																						
//import javax.swing.*;													

public class AppPrincipal {
	
	public static void main(String[] args) {
				
		System.out.println("AGENDA PERSONAL\n");
		Scanner teclado=new Scanner(System.in);
		Scanner waitForKeypress = new Scanner(System.in);

		int opcion=1;
		String nombreIngresado = new String();
		String apellidoIngresado = new String();
		String emailIngresado = new String();
		String movilIngresado = new String();
		String atributoBuscado = new String();
		ArrayList<Contacto> miListaPrincipal = new ArrayList<Contacto>();
		Agenda agendaPrincipal = new Agenda(miListaPrincipal);
		
			while (opcion<=6){
			
			System.out.println("MENU DE OPCIONES:\nIngrese la opcion a realizar:\n1..Nuevo Contacto\n2..Buscar Contacto\n3..Modificar Contacto\n4..Eliminar Contacto\n5..Listado de Contactos\n6..Eliminar TODOS los contactos de la Agenda\n0..Salir de la Agenda");
			opcion = teclado.nextInt();							
		
			switch (opcion){
			case 1:
			
				do{
					System.out.print("Ingrese el nombre del nuevo contacto:");
					nombreIngresado = teclado.next();
				}while(!validarNombre(nombreIngresado));
				
				do{
					System.out.print("Ingrese el apellido del nuevo contacto:");
					apellidoIngresado = teclado.next();
				}while(!validarApellido(apellidoIngresado));
				
				do{
					System.out.print("Ingrese el email del nuevo contacto:");
					emailIngresado = teclado.next();
				}while(!validarEmail(emailIngresado));
				
				do{
					System.out.print("Ingrese el telefono movil del nuevo contacto en formato de diez numeros ej: 11XXXXXXXX:");
					movilIngresado = teclado.next();
				}while(!validarTelMovil(movilIngresado));
			
				agendaPrincipal.agregarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado);
				System.out.println("\nPresione una tecla para continuar.");
				waitForKeypress.nextLine();
				break;
			
			case 2:
				
				System.out.print("\nIngrese cualquier atributo del contacto a buscar:");
				atributoBuscado = teclado.next();
				agendaPrincipal.buscarContacto(atributoBuscado);
				System.out.println("\nPresione una tecla para continuar.");
				waitForKeypress.nextLine();
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

