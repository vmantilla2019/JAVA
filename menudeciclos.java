package pck;

import java.util.Scanner;

public class menudeciclos {

		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			int opcion;

			do {
				opcion = mostrarMenu();

				switch (opcion) {
				case 1:
					System.out.print("Ingrese un número: ");
					int numero = sc.nextInt();
					mostrarNumeros(numero);
					break;

				case 2:
					int suma = sumarNumeros();
					System.out.println("La suma total es: " + suma);
					break;

				case 3:
					validarContrasena();
					break;

				case 4:
					System.out.println("¡Hasta luego!");
					break;

				default:
					System.out.println("Opción inválida.");
				}

			} while (opcion != 4);
		}

		public static int mostrarMenu() {
			System.out.println("\nMenu");
			System.out.println("1. Mostrar números ");
			System.out.println("2. Sumar números");
			System.out.println("3. Validar contraseña ");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			return sc.nextInt();
		}

		public static void mostrarNumeros(int n) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}

		public static int sumarNumeros() {
			int suma = 0;
			int numero;

			System.out.println("Ingrese números (ingrese 0 para terminar):");

			while (true) {
				numero = sc.nextInt();
				if (numero == 0) {
					break;
				}
				suma += numero;
			}

			return suma;
		}

		public static void validarContrasena() {
			String contrasenaCorrecta = "contraseña";
			String entrada;

			do {
				System.out.print("Ingrese la contraseña: ");
				entrada = sc.next();
			} while (!entrada.equals(contrasenaCorrecta));

			System.out.println("La contraseña es correcta.");
		}
	}
