package MiPaquete;
import java.util.*;
public class CondicionalesSwitch1 {
	
	public static void main(String Args []) {
		
		Scanner sc1=new Scanner(System.in);
		
		int figura=sc1.nextInt();
		
		System.out.println("Porfavor, si desea saber el area de un circulo pulse 1.\n "
				+ "Si desea saber el area de un cuadrado, pulse 2\n"
				+ "Si desea saber el area de un trangulo, pulse 3\n"
				+ "Si desea conocer el area de otra figura, busquela en google que no doy pa tanto");
		
		switch (figura) {
		
		case 1:
			Scanner sc2=new Scanner(System.in);
			
			double ladocd=sc2.nextDouble();
			
			System.out.println("Ha escogido CUADRADO, porfavor, indique el valor de su LADO.");
			
			
		
		}
		
	}

}
