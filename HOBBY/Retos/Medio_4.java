package Retos;

import java.util.Scanner;

public class Medio_4 {

	public static void main(String[] args) {
		
		String caracter;
		
		int ult_letra=-1;
		int num_nom=0;
		int comp=0;

		Scanner sc1=new Scanner(System.in);
		
		num_nom=sc1.nextInt();
		
		Scanner sc2=new Scanner (System.in);
		
		String texto_reyes=sc2.nextLine()+" ";
		
		String[] nombres=new String[num_nom];
		
		int[] numero_rey=new int[num_nom];
		
		boolean[] repe=new boolean[num_nom];
		
		boolean[] usado=new boolean[num_nom];
		
		for (int i = 0; i < texto_reyes.length(); i++) {
			
			caracter=Character.toString(texto_reyes.charAt(i));

			if(caracter.equalsIgnoreCase(" ")) {

				for (int j = 0; j < i-ult_letra-1; j++) {
					
					nombres[comp]=nombres[comp]+Character.toString(texto_reyes.charAt(ult_letra+j+1));
					
				}
				
				nombres[comp]=nombres[comp].substring(4);
				
				comp++;
				
				ult_letra=i;
				
			}
			
		}

//		for (int i = 0; i < nombres.length; i++) {
//			
//			System.out.println(nombres[i]);
//			
//		}
		
		for (int i = 0; i < nombres.length; i++) {
			
			repe[i]=false;
			
		}
		
		for (int i = 0; i < numero_rey.length; i++) {
			
			numero_rey[i]=1;
			
		}
		
		for (int i = 0; i < nombres.length; i++) {
			
			for (int j = 0; j < nombres.length; j++) {
				
				if(nombres[i].equalsIgnoreCase(nombres[j])) {
					
					repe[i]=true;

			}
			
				
			}
			
		}

		for (int i = 0; i < numero_rey.length; i++) {
			
			if(repe[i]) {
				
				for (int j = 0; j < i; j++) {
					
					if(nombres[i].equalsIgnoreCase(nombres[j])) {
						
						numero_rey[i]=numero_rey[i]+1;
						
					}
					
				}
				
			}
			
		}
		
//		for (int i = 0; i < repe.length; i++) {
//			
//			System.out.println(nombres[i] + " " + numero_rey[i]);
//			
//		}
		
		
		ult_letra=-1;
	    num_nom=0;
		comp=0;

		Scanner sc3=new Scanner(System.in);
		
		num_nom=sc3.nextInt();
		
		Scanner sc4=new Scanner (System.in);
		
		String texto_herederos=sc4.nextLine()+" ";
		
		String[] nombres_h=new String[num_nom];
		
		int[] numero_herederos=new int[num_nom];
		
		boolean[] repe_h=new boolean[num_nom];
		
		for (int i = 0; i < texto_herederos.length(); i++) {
			
			caracter=Character.toString(texto_herederos.charAt(i));

			if(caracter.equalsIgnoreCase(" ")) {

				for (int j = 0; j < i-ult_letra-1; j++) {
					
					nombres_h[comp]=nombres_h[comp]+Character.toString(texto_herederos.charAt(ult_letra+j+1));
					
				}
				
				nombres_h[comp]=nombres_h[comp].substring(4);
				
				comp++;
				
				ult_letra=i;
				
			}
			
		}
		
		
		for (int i = 0; i < numero_herederos.length; i++) {
			
			numero_herederos[i]=1;
			
		}
		
		for (int i = 0; i < nombres_h.length; i++) {
			
			repe_h[i]=false;
			
		}
		
		for (int i = 0; i < nombres_h.length; i++) {
			
			for (int j = 0; j < nombres_h.length; j++) {
				
				if(nombres_h[i].equalsIgnoreCase(nombres_h[j])) {
					
					repe_h[i]=true;

			}
			
				
			}
			
		}

		for (int i = 0; i < numero_herederos.length; i++) {
			
			if(repe_h[i]) {
				
				for (int j = 0; j < i; j++) {
					
					if(nombres_h[i].equalsIgnoreCase(nombres_h[j])) {
						
						numero_herederos[i]=numero_herederos[i]+1;
						
					}
					
				}
				
			}
			
		}
		
		for (int i = 0; i < nombres_h.length; i++) {
			
			for (int j = nombres.length-1; j >=0; j--) {
				
				if(nombres_h[i].equalsIgnoreCase(nombres[j])) {
					
					numero_herederos[i]=numero_herederos[i]+numero_rey[j];
					
					break;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < nombres.length; i++) {
	
		System.out.println(nombres[i]+numero_rey[i]);
		
	}
		
		for (int i = 0; i < nombres_h.length; i++) {
			
		System.out.println(nombres_h[i]+numero_herederos[i]);
		
	}
		
		
	}

}
