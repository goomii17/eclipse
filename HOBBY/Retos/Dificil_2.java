package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Dificil_2 {

	public static void main(String[] args) {
		
		analizando a=new analizando();
		
		Scanner sc1=new Scanner(System.in);
		
		String secuencias=sc1.nextLine();
		
		String[] s=secuencias.split(" ");
			
		ArrayList<String> pos1=a.dime_combinaciones(s[0]);
		
		ArrayList<String> pos2=a.dime_combinaciones(s[1]);
		
		ArrayList<String> iguales=new ArrayList();
		
		for (int i = 0; i < pos1.size(); i++) {
			
			for (int j = 0; j < pos2.size(); j++) {
				
				if(pos1.get(i).equalsIgnoreCase(pos2.get(j))) {
					
					iguales.add(pos1.get(i));
					
				}
				
			}
			
		}
		
		String bases=iguales.get(0);
		
		for (int i = 0; i < iguales.size(); i++) {
			
			if(iguales.get(i).length()>bases.length()) {
				
				bases=iguales.get(i);
				
			}
			
		}
		
		System.out.println(bases);
		
	}

}
class analizando{
	
	public ArrayList<String> dime_combinaciones(String s){
		
		ArrayList<String> comb=new ArrayList();
		
		for (int i = 0; i < s.length(); i++) {
			String s1="";
			for (int j = 0; j < s.length()-i; j++) {
				
				 s1=s.substring(i, i+j+1);
				 comb.add(s1);
			}
			
		}
		
		return comb;
		
	}
	
}