package MiPaquete;

import java.util.*;

public class Bucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String contraseņa="minecraft";

		Scanner sc=new Scanner(System.in);
		
		String pass="";
	
		while (contraseņa.equals(pass)== false) {	
			
			System.out.println("Porfavor, introduzca la contraseņa");
			
			pass=sc.nextLine();
			
			if (contraseņa.equals(pass)== false) {
				
				System.out.println("Intentelo de nuevo");
				
			}
			
		}
		
		System.out.println("Correcto");

	}

}
