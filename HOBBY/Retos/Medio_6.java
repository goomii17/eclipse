package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Medio_6 {

	public static void main(String[] args) {
		
		Scanner sc1=new Scanner (System.in);
		
		int casos=sc1.nextInt();
		
		ArrayList<String> repe=new ArrayList();
		ArrayList<String> lineas;
		
		for (int i = 0; i < casos; i++) {
			
			Scanner sc2=new Scanner (System.in);
			
			String dimensions=sc2.nextLine();
			
			int ancho=dime_ancho(dimensions);
			int filas=dime_filas(dimensions);
			
			lineas=new ArrayList();
			
			for (int j = 0; j < filas; j++) {
				
				Scanner sc3=new Scanner (System.in);
				
				String line=sc3.nextLine();
				
				String l="";
				
				for (int k = 0; k < ancho; k++) {
					
					l=l+dime_elemento(line,k);
					
				}
				
				lineas.add(l);
				
			}
			
			boolean r=false;
			
			for (int j = 0; j < lineas.size(); j++) {
				
				for (int j2 = 0; j2 < lineas.size(); j2++) {
					
					if(j==j2) {
						
						
					}else {
						
						if(lineas.get(j).equalsIgnoreCase(lineas.get(j2))) {
							
							r=true;
							
							
						}
						
					}
					
				}
				
			}
			
			if(r) {
				
				repe.add("SI");
				
			}else {
				
				repe.add("NO");
				
			}
			
		}
		
		for (int i = 0; i < repe.size(); i++) {
			
			System.out.println(repe.get(i));
			
		}
		
	}
	
	public static int dime_ancho(String s) {
		
		String[] parts=s.split(" ");
		
		ArrayList<String> a=new ArrayList();
		
		for (int i = 0; i < parts.length; i++) {
			
			if(parts[i].equalsIgnoreCase("")) {
				
				
				
			}else {
				
				a.add(parts[i]);
				
			}
			
		}
		
		return Integer.parseInt(a.get(0));
		
	}
	public static int dime_filas(String s) {
		
		String[] parts=s.split(" ");
		
		ArrayList<String> a=new ArrayList();
		
		for (int i = 0; i < parts.length; i++) {
			
			if(parts[i].equalsIgnoreCase("")) {
				
				
				
			}else {
				
				a.add(parts[i]);
				
			}
			
		}
		
		return Integer.parseInt(a.get(1));
		
	}
	public static int dime_elemento(String s,int index) {
		
		String[] parts=s.split(" ");
		
		ArrayList<String> a=new ArrayList();
		
		for (int i = 0; i < parts.length; i++) {
			
			if(!parts[i].equalsIgnoreCase("")) {
				
				a.add(parts[i]);
				
			}
			
		}
		
		return Integer.parseInt(a.get(index));
		
	}
	
}
