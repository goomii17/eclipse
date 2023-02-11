package JuegoValencias;
import javax.swing.*;
import java.util.Scanner;
import java.util.prefs.Preferences;

public class pruebas123{

	public static void main(String[] args) {

		boolean siempre=true;

		Preferences preferences=Preferences.userNodeForPackage(pruebas123.class);	

		System.out.println(preferences);
		
		
			int aleatorio=(int)Math.round(Math.random()*23);	
			
		    System.out.println(aleatorio);
		    
		   System.out.println(preferences.get("hola", null));
		    
		
	}

}







	
	
	
	