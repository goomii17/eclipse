package Retos;

import java.util.Scanner;

public class Medio_1 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el numero de casos");
		
		Scanner sc1 =new Scanner(System.in);
		
		int casos=sc1.nextInt();
		
		for (int i = 0; i < casos; i++) {

		int suma=0;
		int digito;
		
		System.out.println("Introduce el numero que quieres sumar las cifras");
		
		Scanner sc2 =new Scanner(System.in);
		
		long num=sc2.nextLong();
		
		String num_txt=Long.toString(num);
		
		for (int j = 0; j < num_txt.length(); j++) {
			
			if((Character.toString(num_txt.charAt(j))).equals("-")==false) {
			
			digito=Integer.parseInt(Character.toString(num_txt.charAt(j)));
			
			System.out.print(digito+" + ");
			
			suma=suma+digito;
			
			}
			
		}
		
		System.out.print("= "+suma);
		
		System.out.println();
		
	}

	}
		
}
