package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Muy_Dificil_3 {

	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		
		int n=sc1.nextInt();
		
		ArrayList<Integer> combs= new ArrayList();
		ArrayList<Integer> inicial= new ArrayList();
		
		//creo un array inicial, da lo mismo cual sea 
		//mientras sea una permutacion sin repeticion
		for (int i = 1; i <= n; i++) {
			
			inicial.add(i);
			
		}
		
		crea_permutaciones(combs, n,0, inicial);
		
		System.out.println(perm_pos);
		
	}

	static long perm_pos=0;
	
	//creo las permutaciones sin repeticion de n elementos, y cuando las posiciones
	//de estas no coinciden con las iniciales, tenemos una solucion, y añadimos +1 a perm_pos
	public static void crea_permutaciones(ArrayList<Integer> combs,int n,int ultimo,ArrayList<Integer> inicial) {
		
		if(combs.size()==n) {
			
			if(totalmente_diferentes(inicial, combs)) {
				
				perm_pos++;
				
			}
			
		}else {
			
			for (int i = 1; i <= n; i++) {
				
				if(i!=ultimo&&!esta(combs, i)) {
					
					combs.add(i);
					ultimo=i;
					
					crea_permutaciones(combs, n, ultimo, inicial);
					
					combs.remove(combs.size()-1);
					
				}
				
			}
			
		}
		
	}
	
	//metodo que comprueba si un numero ya estaba metido en el array, para no meterlo de nuevo
	public static boolean esta(ArrayList<Integer> combs,int n) {
		
		boolean t=false;
		
		for (int i = 0; i < combs.size(); i++) {
			
			if(combs.get(i)==n) {
				
				t=true;
				
			}
			
		}
		return t;
		
	}
	
	//metodo que analiza si dos arrays tinen todas sus posiciones diferentes
	public static boolean totalmente_diferentes(ArrayList<Integer> inicial,ArrayList<Integer> combs){
		
		boolean t=true;
		
		for (int i = 0; i < inicial.size(); i++) {
			
			if(inicial.get(i)==combs.get(i)) {
				
				t=false;
				
			}
			
		}
		
		return t;
		
	}
	
}
