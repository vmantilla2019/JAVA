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
        int opcion = mostrarmenu();
        System.out.println("Escogio: " + opcion);
    }
}
