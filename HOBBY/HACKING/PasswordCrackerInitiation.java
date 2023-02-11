package HACKING;
import java.util.*;
import JuegoValencias.Elements_;

public class PasswordCrackerInitiation {

	public static void main(String[] args) {
		
        caracteres[] digito=new caracteres[10];
        
        digito[0]=new caracteres('0');
        digito[1]=new caracteres('1');
        digito[2]=new caracteres('2');
        digito[3]=new caracteres('3');
        digito[4]=new caracteres('4');
        digito[5]=new caracteres('5');
        digito[6]=new caracteres('6');
        digito[7]=new caracteres('7');
        digito[8]=new caracteres('8');
        digito[9]=new caracteres('9');
		
		boolean cracking=true;
		int empezando=0;
		boolean todo=true;
		boolean adivinada=false;
		String intento1 = null;
		
		while(todo) {
			
			try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
			
			System.out.println("Introduce contraseña:");
			
			Scanner sc1=new Scanner(System.in);
			String contraseñareal=sc1.nextLine();
			
			int trolleo=(int) Math.round(Math.random()*10);
		
			for(int i=0;i<trolleo;i++) {
				
				System.out.println("Hackeando contraseña.......");
				
				try {
					Thread.sleep(trolleo*20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		for(int i=0;i<digito.length;i++) {
			
			intento1=Character.toString(digito[i].dime_caracter());
			
			if(intento1.equals(contraseñareal)) {
				
				adivinada=true;
				break;
				
			}
			
		}

		if(adivinada) {
			
			System.out.println("La contraseña es: " + intento1);
			
		}else {
			
			System.out.println("Fallo al adivinar");
			
		}
		
		}
		
	}

}
