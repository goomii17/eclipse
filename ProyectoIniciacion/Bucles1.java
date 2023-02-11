package MiPaquete;

import java.util.*;

public class Bucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String contraseña="minecraft";

		Scanner sc=new Scanner(System.in);
		
		String pass="";
	
		while (contraseña.equals(pass)== false) {	
			
			System.out.println("Porfavor, introduzca la contraseña");
			
			pass=sc.nextLine();
			
			if (contraseña.equals(pass)== false) {
				
				System.out.println("Intentelo de nuevo");
				
			}
			
		}
		
		System.out.println("Correcto");

	}

}
