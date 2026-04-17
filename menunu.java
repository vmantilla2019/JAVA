package menu;
import java.util.Scanner;

public class menuu {
	public static int mostrarmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1) Ingresar datos: ");
		System.out.println("2) Mostrar datos: ");
		System.out.println("3) Salir: ");
		System.out.print("Por favor seleccione una opción: ");
		int opcion = sc.nextInt();
		return opcion;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String nombre="";
		int edad=0;
		boolean control= true;
		while (control) {
			opcion = mostrarmenu();

			if (opcion== 1) {
				for(int k=0;k<5;k++)
					System.out.print("Ingresa tu nombre: "+(k+1));
				nombre=sc.nextLine();
				System.out.println("Ingresa tu edad: ");
				edad=Integer.parseInt(sc.nextLine());;

			}
			else {
				if (opcion==2);
				System.out.println("nombre: " + nombre);

				System.out.println("Edad: " + edad);

			}

			else {

				if(opcion ==3){

					System.out.println("Termina");

					control= false;

				}

			}

		}

	}

	System.out.println("Opcion seleccionada " +opcion);

}

}

