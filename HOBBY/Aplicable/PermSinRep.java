package Aplicable;

import java.util.ArrayList;
import java.util.Scanner;

public class PermSinRep {

	public static void main(String[] args) {
		
		ArrayList<String> n_elementos=new ArrayList();
		
		n_elementos.add("1");
		n_elementos.add("7");
		n_elementos.add("4");
		n_elementos.add("2");
		
		//Maximo n
		int r_en_r=2;
		
		ArrayList<String> combs=new ArrayList();
		
		crea_permutaciones(combs, n_elementos, r_en_r);
		
	}
	ArrayList<ArrayList<String>> todas=new ArrayList();
	
	public static void crea_permutaciones(ArrayList<String> combs,ArrayList<String> e,int r) {
		
		if(combs.size()==r) {
			
			System.out.println(combs);
			
		}else {
			
			for (int i = 0; i < e.size(); i++) {
				
				if(!esta(combs, e.get(i))) {
					
					combs.add(e.get(i));
					
					crea_permutaciones(combs, e, r);
					
					combs.remove(combs.size()-1);
					
				}
				
			}
			
		}
			
		}
	
	public static boolean esta(ArrayList<String> combs,String n) {
		
		boolean t=false;
		
		for (int i = 0; i < combs.size(); i++) {
			
			if(combs.get(i)==n) {
				
				t=true;
				
			}
			
		}
		return t;
		
	}
	
}
