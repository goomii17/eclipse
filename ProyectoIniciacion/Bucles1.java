package MiPaquete;

import java.util.*;

public class Bucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String contrase�a="minecraft";

		Scanner sc=new Scanner(System.in);
		
		String pass="";
	
		while (contrase�a.equals(pass)== false) {	
			
			System.out.println("Porfavor, introduzca la contrase�a");
			
			pass=sc.nextLine();
			
			if (contrase�a.equals(pass)== false) {
				
				System.out.println("Intentelo de nuevo");
				
			}
			
		}
		
		System.out.println("Correcto");

	}

}
