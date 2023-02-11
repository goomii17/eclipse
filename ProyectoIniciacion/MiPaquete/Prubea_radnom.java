package MiPaquete;
import java.util.*;
public class Prubea_radnom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean hola=true;

		while (hola==true) {
			
			long numr=Math.round(Math.random()*100);
			
			System.out.println(numr);
			
			Scanner sc1=new Scanner(System.in);
			
			int resp=sc1.nextInt();
			
			if (resp==1) {
				
				hola=false;
				
			}
			
		}
		
		
		
	}

}
