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
		int opcionModificar = 1;
		String nombreIngresado = new String();
		String apellidoIngresado = new String();
		String emailIngresado = new String();
		String movilIngresado = new String();
		String atributoBuscado = new String();
		String nuevoNombreIngresado = new String();
		String nuevoApellidoIngresado = new String();
		String nuevoEmailIngresado = new String();
		String nuevoMovilIngresado = new String();
		ArrayList<Contacto> miListaPrincipal = new ArrayList<Contacto>();
		Agenda agendaPrincipal = new Agenda(miListaPrincipal);
		
			while ((opcion<=6) || (opcion==0)){
			
			System.out.println("MENU DE OPCIONES:\nIngrese la opcion a realizar:\n1..Nuevo Contacto\n2..Buscar Contacto\n3..Modificar Contacto\n4..Eliminar Contacto\n5..Listado de Contactos\n6..Eliminar TODOS los contactos de la Agenda\n0..Salir de la Agenda");
			opcion = teclado.nextInt();	
			opcionModificar = 1;
		
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
				
			case 3:
				
				
				
				do{
					System.out.print("Ingrese el nombre del contacto a modificar:");
					nombreIngresado = teclado.next();
				}while(!validarNombre(nombreIngresado));
				
				do{
					System.out.print("Ingrese el apellido del contacto a modificar:");
					apellidoIngresado = teclado.next();
				}while(!validarApellido(apellidoIngresado));
				
				do{
					System.out.print("Ingrese el email del contacto a modificar:");
					emailIngresado = teclado.next();
				}while(!validarEmail(emailIngresado));
				
				do{
					System.out.print("Ingrese el telefono movil del contacto a modificar en formato de diez numeros ej: 11XXXXXXXX:");
					movilIngresado = teclado.next();
				}while(!validarTelMovil(movilIngresado));
				
				
				while ((opcionModificar<=5) || (opcionModificar==0)){
				
					System.out.println("Indique que atributo desea modificar del contacto:");
					System.out.println("\n1..Nombre\n2..Apellido\n3..Email\n4..Movil\n0..Volver al Menu Principal");
					opcionModificar = teclado.nextInt();
								
					switch(opcionModificar){
					case 1:
						do{
							System.out.print("Ingrese el nuevo nombre del contacto:");
							nuevoNombreIngresado = teclado.next();
						}while(!validarNombre(nuevoNombreIngresado));
						agendaPrincipal.modificarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado, nuevoNombreIngresado, apellidoIngresado, emailIngresado, movilIngresado);
						break;
						
					case 2:
						do{
							System.out.print("Ingrese el nuevo apellido del contacto:");
							nuevoApellidoIngresado = teclado.next();
						}while(!validarApellido(nuevoApellidoIngresado));
						agendaPrincipal.modificarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado, nombreIngresado, nuevoApellidoIngresado, emailIngresado, movilIngresado);
						break;
						
					case 3:	
						do{
							System.out.print("Ingrese el nuevo email del contacto:");
							nuevoEmailIngresado = teclado.next();
						}while(!validarEmail(nuevoEmailIngresado));
						agendaPrincipal.modificarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado, nombreIngresado, apellidoIngresado, nuevoEmailIngresado, movilIngresado);
						break;
						
					case 4:
						do{
							System.out.print("Ingrese el nuevo telefono movil del contacto en formato de diez numeros ej: 11XXXXXXXX:");
							nuevoMovilIngresado = teclado.next();
						}while(!validarTelMovil(nuevoMovilIngresado));
						agendaPrincipal.modificarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado, nombreIngresado, apellidoIngresado, emailIngresado, nuevoMovilIngresado);
						break;
					
					case 0:
						opcionModificar = 6;
						break;
					}			
				}

				break;
				
			case 4:
				
				do{
					System.out.print("Ingrese el email del contacto a eliminar:");
					emailIngresado = teclado.next();
				}while(!validarEmail(emailIngresado));
				nombreIngresado = "";
				apellidoIngresado = "";
				movilIngresado = "";
				
				agendaPrincipal.eliminarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado);
				System.out.println("\nEl contacto se ha eliminado de la agenda.\n");
				
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

