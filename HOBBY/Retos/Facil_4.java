package Retos;

import java.util.Scanner;

public class Facil_4 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el decimal que quieres pasar a fraccion");
		
		Scanner sc1=new Scanner(System.in);
		
		float num=sc1.nextFloat();
		
		int decimales=(Float.toString(num).length()-2);
		
		int denominador=(int) Math.pow(10, decimales);

		int numerador=(int) Math.ceil((num*denominador));

		for (int i = 2; i < denominador+2; i++) {
			
			if((denominador%i==0)&&(numerador%i)==0) {
				
				denominador=denominador/i;
				
				numerador=numerador/i;
				
				i=2;
				
			}
				
		}
		
		System.out.println(numerador+"/"+denominador);
		
	}

}
