package MiPaquete;

import java.util.*;

public class Comprueba_Emails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean arroba = false;
		boolean punto = false;

		System.out.println("Introduzca la direccion de correo que desee");

		while ((arroba == false) && (punto == false)) {

			Scanner sc1 = new Scanner(System.in);
			String mail = sc1.nextLine();

			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '@') {
					arroba = true;
				}
				if (mail.charAt(i) == '.') {
					punto = true;
				}

			}

			if ((arroba == true) && (punto == true)) {
				System.out.println("La direccion es valida");
			} else {
				System.out.println(
						"La direccion no es valida.\nPruebe otra vez asegurandose de que la direccion incluya un '@' y un '.'");
			}

		}

	}

}
