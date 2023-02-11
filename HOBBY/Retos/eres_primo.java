package Retos;
import java.util.Scanner;

public class eres_primo {
	
	public static void main(String[] args) {

		primos p=new primos();
		
		Scanner sc1=new Scanner(System.in);
		
		if(p.es_primo(sc1.nextInt())==true) {
			
			System.out.println("Es primo");
			
			
		}else {
			
			System.out.println("No es primo");
			
		}
		
	}
}
