package MiPaquete;

import java.util.*;

public class PRIMERMINIJUEGO {

	public static void main(String Args[]) {
		System.out.println("BIENVENIDO A MI PRIMER MINIJUEGO");
		System.out.println("Adivina un numero del 1 al 100");

		double num1 = (Math.random() * 100);
		num1 = (Math.round(num1));
		double num2 = 1;

		while (!(num1 == num2)) {
			Scanner sc1 = new Scanner(System.in);
			num2 = sc1.nextDouble();
			if (num1 == num2) {
			} else {
				if (num2 < num1) {
					System.out.println("Creo que te has quedado corto...");
				} else {
					System.out.println("Te has pasado");
				}
			}
		}
		System.out.println("Has acertado!! Enhorabuena");
	}
}
