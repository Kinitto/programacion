package es.studium.Cadenas3;

import java.util.Scanner;

public class Cadenas3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre1, nombre2;
		System.out.println("Dame una cadena");
		nombre1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		nombre2 = teclado.nextLine();
		teclado.close();
		if (nombre1.length() == nombre2.length()) {
			System.out.println("Las cadenas tienen la misma longitud");
		} else if (nombre1.length() > nombre2.length()) {
			System.out.println("Cadena1 es mayor que cadena 2");
		} else {
			System.out.println("Cadena 2 es mayor que cadena 1");
		}
	}

}
