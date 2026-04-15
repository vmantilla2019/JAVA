package pck;

import java.util.Scanner;

public class InformacionPersonal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("Valerie Mantilla"
				+ "\nEdad: 17"
				+ "\nIng de sistemas");
		//print("\nValerie Mantilla\nEdad: 17\nIng de sistemas")
		Scanner sc= new Scanner(System.in);
		String nombre="Valerie Mantilla";
		int edad=17;
		String programa="Ing de sistemas";
		System.out.println(nombre+'\n'+(edad)+'\n'+programa);
		        System.out.println("Cual es tu nombre?: ");
		        nombre=sc.nextLine();
		        System.out.println("Cual es tu edad?: ");
                edad=Integer.parseInt(sc.nextLine());
                System.out.println("Cual es tu programa?: ");
                programa=sc.nextLine();
                System.out.println(nombre+'\n'+(edad)+'\n'+programa);
                //-------------------------------------------------------------------------------------------------------
                int opcion = menu();
                System.out.println("Opcion seleccionada"+opcion); 
  }