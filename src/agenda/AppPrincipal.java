package agenda;

import java.util.ArrayList;
import java.util.Scanner;																																			

public class AppPrincipal {
	
	public static void main(String[] args) {
				
		System.out.println("AGENDA PERSONAL\n");
		Scanner teclado = new Scanner(System.in);
		Scanner waitForKeypress = new Scanner(System.in);

		int opcion=1;
		int opcionBuscar = 1;
		int opcionModificar = 1;	
		String opcionEliminarTodo = "N";
		String nombreIngresado = new String();
		String apellidoIngresado = new String();
		String emailIngresado = new String();
		String movilIngresado = new String();
		String emailDeContactoABuscar = new String();
		String nuevoNombreIngresado = new String();
		String nuevoApellidoIngresado = new String();
		String nuevoEmailIngresado = new String();
		String nuevoMovilIngresado = new String();
		String todosLosContactos = new String();
		String expresionABuscar = new String();
		String todosLosContactosMedianteExpresion = new String();
		ArrayList<Contacto> miListaPrincipal = new ArrayList<Contacto>();
		Agenda agendaPrincipal = new Agenda(miListaPrincipal);
		Contacto contacto = new Contacto();
		
			while (opcion<=6){
			
			System.out.println("MENU DE OPCIONES:\nIngrese la opcion a realizar:\n1..Nuevo Contacto\n2..Buscar Contacto\n3..Modificar Contacto\n4..Eliminar Contacto\n5..Listado de Contactos\n6..Eliminar TODOS los contactos de la Agenda\n0..Salir de la Agenda");
			System.out.print("Opcion Elegida:");
			opcion = teclado.nextInt();	
			opcionModificar = 1;
			opcionBuscar = 1;
		
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
			
				if(agendaPrincipal.agregarContacto(nombreIngresado, apellidoIngresado, emailIngresado, movilIngresado)){
					System.out.println("\nContacto ingresado correctamente:\n" + "Nombre:" + nombreIngresado + "\t" + "Apellido:" + apellidoIngresado + "\t" + "Email:" + emailIngresado + "\t" + "Movil:" + movilIngresado);
				}else System.out.println("NO se ha insertado el contacto en la agenda.\nEl contacto existe en la agenda y no es posible duplicarlo.");
				
				System.out.println("\nPresione enter para continuar.");
				waitForKeypress.nextLine();
				break;
			
			case 2:
				
				while (opcionBuscar<=2){
					
					System.out.println("\nIndique como desea buscar el contacto:");
					System.out.println("1..Mediante Email\n2..Mediante cualquier expresion textual\n0..Volver al Menu Principal");
					System.out.print("Opcion Elegida:");
					opcionBuscar = teclado.nextInt();
								
					switch(opcionBuscar){
					case 1:
						
						System.out.print("\nIngrese el email del contacto a buscar:");
						emailDeContactoABuscar = teclado.next();
						contacto = agendaPrincipal.buscarUnContacto(emailDeContactoABuscar);
						if(contacto != null) System.out.println("\nContacto encontrado:\n" + "Nombre:" + contacto.getNombre() + "\t" + "Apellido:" + contacto.getApellido() + "\t" + "Email:" + contacto.getEmail() + "\t" + "Movil:" + contacto.getMovil());
						else System.out.println("No existe el contacto.");
						
						System.out.println("\nPresione enter para continuar.");
						waitForKeypress.nextLine();
						break;
					
					case 2:
						
						System.out.print("\nIngrese la expresion a buscar:");
						expresionABuscar = teclado.next();
						todosLosContactosMedianteExpresion = agendaPrincipal.buscarContactosMedianteAlgunAtributo(expresionABuscar);
						if(todosLosContactosMedianteExpresion.length()>0) System.out.println("Contactos encontrados:\n" + todosLosContactosMedianteExpresion);
						else System.out.println("No existen contactos que contengan dicha expresion");
						
						System.out.println("\nPresione enter para continuar.");
						waitForKeypress.nextLine();
						break;
						
					case 0:
						opcionModificar = 3;
						break;
					}	
				}
							
			case 3:
				
				do{
					System.out.print("Ingrese el email del contacto a modificar:");
					emailIngresado = teclado.next();
				}while(!validarEmail(emailIngresado));				
				contacto = agendaPrincipal.buscarUnContacto(emailIngresado);
				if(contacto == null){
					System.out.println("No existe contacto con dicho atributo.");
					System.out.println("\nPresione enter para continuar.");
					waitForKeypress.nextLine();
					break;
				}
				
				while (opcionModificar<=5){
				
					System.out.println("\nIndique que atributo desea modificar del contacto:");
					System.out.println("1..Nombre\n2..Apellido\n3..Email\n4..Movil\n0..Volver al Menu Principal");
					System.out.print("Opcion Elegida:");
					opcionModificar = teclado.nextInt();
								
					switch(opcionModificar){
					case 1:
						do{
							System.out.print("Ingrese el nuevo nombre del contacto:");
							nuevoNombreIngresado = teclado.next();
						}while(!validarNombre(nuevoNombreIngresado));
						if(agendaPrincipal.modificarContacto(contacto.getEmail(), "Nombre", nuevoNombreIngresado)) System.out.println("Se ha modificado el contacto.");
						else System.out.println("No se ha modificado el contacto.");
						
						System.out.println("\nPresione enter para continuar.");
						waitForKeypress.nextLine();
						break;
						
					case 2:
						do{
							System.out.print("Ingrese el nuevo apellido del contacto:");
							nuevoApellidoIngresado = teclado.next();
						}while(!validarApellido(nuevoApellidoIngresado));
						if(agendaPrincipal.modificarContacto(contacto.getEmail(), "Apellido", nuevoApellidoIngresado)) System.out.println("Se ha modificado el contacto.");
						else System.out.println("No se ha modificado el contacto.");
						
						System.out.println("\nPresione enter para continuar.");
						waitForKeypress.nextLine();
						break;
						
					case 3:	
						do{
							System.out.print("Ingrese el nuevo email del contacto:");
							nuevoEmailIngresado = teclado.next();
						}while(!validarEmail(nuevoEmailIngresado));
						if(agendaPrincipal.modificarContacto(contacto.getEmail(), "Email", nuevoEmailIngresado)) System.out.println("Se ha modificado el contacto.");
						else System.out.println("No se ha modificado el contacto.");
						
						System.out.println("\nPresione enter para continuar.");
						waitForKeypress.nextLine();
						break;
						
					case 4:
						do{
							System.out.print("Ingrese el nuevo telefono movil del contacto en formato de diez numeros ej: 11XXXXXXXX:");
							nuevoMovilIngresado = teclado.next();
						}while(!validarTelMovil(nuevoMovilIngresado));
						if(agendaPrincipal.modificarContacto(contacto.getEmail(), "Movil", nuevoMovilIngresado)) System.out.println("Se ha modificado el contacto.");
						else System.out.println("No se ha modificado el contacto.");
						
						System.out.println("\nPresione enter para continuar.");
						waitForKeypress.nextLine();
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
				if(agendaPrincipal.eliminarContacto(emailIngresado)) System.out.println("\nEl contacto se ha eliminado de la agenda.");
				else System.out.println("No se encuentra el contacto a eliminar.");
				
				System.out.println("\nPresione enter para continuar.");
				waitForKeypress.nextLine();
				break;
				
			case 5:
				
				todosLosContactos = agendaPrincipal.mostrarTodosLosContactos();
				if(todosLosContactos.equals(null)) System.out.println("No existen contactos en la agenda.");
				else System.out.println("Lista de todos los contactos:\n" + todosLosContactos);
				
				System.out.println("\nPresione enter para continuar.");
				waitForKeypress.nextLine();
				break;
				
			case 6:
								
				System.out.print("Esta seguro de que desea eliminar TODOS los contactos de la agenda (S/N):");
				opcionEliminarTodo = teclado.next();
				System.out.print("\n");
				if(opcionEliminarTodo.equals("S")){
					if(!agendaPrincipal.eliminarTodosLosContactos()) System.out.println("No existen contactos en la agenda a eliminar.");
					System.out.println("Todos los contactos han sido eliminados.");
					opcionEliminarTodo = "N";
					
					System.out.println("\nPresione enter para continuar.");
					waitForKeypress.nextLine();
				}				
				break;
				
			case 0:
				
				System.out.println("Ha salido de la Agenda.");
				opcion = 100;
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

