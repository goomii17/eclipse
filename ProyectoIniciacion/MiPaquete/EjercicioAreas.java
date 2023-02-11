package MiPaquete;

import java.util.*;

public class EjercicioAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.print("Porfavor, diga de que figura");
		
		System.out.println(" desea conocer el area");
		
		String figura=sc1.nextLine();
		
		if(figura.equalsIgnoreCase("cuadrado")){
			
			Scanner sc2=new Scanner(System.in);
			
			System.out.print("Porfavor, diga la longitud ");
			
			System.out.println("en metros del LADO");
			
			double lado=sc2.nextDouble();
			
			System.out.println("El area del cuadrado es:");
			
			System.out.printf("%.2f", Math.pow(lado, 2));
			
			System.out.print(" metros cuadrados");
		
		}else {
			
			if(figura.equalsIgnoreCase("triangulo")) {
				
				Scanner sc3=new Scanner(System.in);
				
				System.out.println("Porfavor, diga la longitud en metros de la BASE");
				
				double baset=sc3.nextDouble();
				
				Scanner sc4=new Scanner(System.in);
				
				System.out.println("Porfavor, diga la longitud en metros de la ALTURA");
				
				double alturat=sc4.nextDouble();

				System.out.println("El area del triangulo es:");
				
				System.out.printf("%.2f", (baset*alturat)/2);
				
				System.out.print(" metros cuadrados");
				
			}else {
				
				if(figura.equalsIgnoreCase("circulo")) {
					
					Scanner sc5=new Scanner(System.in);
					
					System.out.println("Porfavor, diga la longitud en metros del radio");
					
					double radioc=sc5.nextDouble();
					
					double pi=Math.PI;
					
					System.out.println("El area del circulo es:");
					
					System.out.printf("%.2f", (pi*(Math.pow(radioc, 2))));
					
					System.out.print(" metros cuadrados");
					
				}else {

					System.out.println("Ese no es un nombre valido, porfavor , eliga entre:\nCuadrado Rectangulo o Circulo");
					
				}
			}
		}
	}

}
