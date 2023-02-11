package MiPaquete;

import java.util.*;

public class Condicionales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		
		String Si=("Si");
		
		String No=("No");
		
		System.out.println("Porfavor, si es usted idiota, introduzca Si ");
		
		System.out.println("Sino , introduzca No");
		
		String respuesta1=sc1.nextLine();
		
		if(respuesta1.equalsIgnoreCase(Si)){
			System.out.println("Es usted una persona sincera almenos , y eso se valora");
		}else {
			
			System.out.println("Es usted un mentiroso puerco malpario");
			
		}

	}

}