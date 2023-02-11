package Retos;
import java.util.*;
public class Facil_1 {

	public static void main(String[] args) {

		System.out.println("Introduce dos numeros y te dire el mayor: ");
		
		Scanner sc1 =new Scanner(System.in);
		
		int num1=sc1.nextInt();
		
		int num2=sc1.nextInt();
				
		if(num1>=num2){
			
			System.out.println(num1);
			
		}else {
			
			System.out.println(num2);
			
		}
		
	}

}
