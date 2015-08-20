package agenda;

//import java.util.Scanner;												//Libreria para I/O
import javax.swing.JOptionPane;											//Libreria para Notificaciones
//import javax.swing.*;													//Libreria para Integer

public class AppPrincipal {

	public static void main(String[] args) {
				
		JOptionPane.showMessageDialog(null, "Agenda Personal");
		//Scanner teclado=new Scanner(System.in);
		
		String textAux;
		int opcion=1;												//Primer ingreso al bucle del menu.

		
		while ((opcion==1) || (opcion==2) || (opcion==3) || (opcion==4) || (opcion==5) || (opcion==6)){
			
			textAux=JOptionPane.showInputDialog("MENU DE OPCIONES:\nIngrese la opcion a realizar:\n1..Nuevo Contacto\n2..Buscar Contacto\n3..Modificar Contacto\n4..Eliminar Contacto\n5..Listado de Contactos\n6..Eliminar TODOS los contactos de la Agenda\n0..Salir de la Agenda");
			opcion=Integer.parseInt(textAux);							
			
		
		}
	}

}
