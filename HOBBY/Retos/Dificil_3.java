package Retos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dificil_3 {

	public static void main(String[] args) {
		
		producto p=new producto();
		System.out.println("Introduce numero de casos (vectores de las mismas dimensiones)");
		Scanner sc1=new Scanner(System.in);
		
		int casos=sc1.nextInt();
		
		ArrayList<Integer> resultados=new ArrayList();
		
		for (int i = 0; i < casos; i++) {
			
			ArrayList<ArrayList<Integer>> vector=new ArrayList();
			
			for (int j = 0; j < 2; j++) {
				System.out.println("Introduce vector "+(j+1));
				Scanner sc2=new Scanner(System.in);
				
				String v=sc2.nextLine();
				
				String[] s=v.split(" ");
				
				ArrayList<Integer> n=new ArrayList();
				
				for (int k = 0; k < s.length; k++) {
					
					if(!s[k].equals("")) {
						
						n.add(Integer.parseInt(s[k]));
						
					}
					
				}
				
				vector.add(n);
				
			}
			
			ArrayList<Integer> vec1=p.ordena_men_may(vector.get(0));
			ArrayList<Integer> vec2=p.ordena_may_menor(vector.get(1));
			
			resultados.add(p.dime_producto(vec1, vec2));
			
		}
		
		for (int i = 0; i < resultados.size(); i++) {
			
			System.out.println(resultados.get(i));
			
		}
		
	}

}
class producto{
	
	public int dime_producto(ArrayList<Integer> v1,ArrayList<Integer> v2) {
		
		
		int suma=0;
		
		for (int i = 0; i < v1.size(); i++) {
			
			suma+=v1.get(i)*v2.get(i);
			
		}
		
		return suma;
		
	}
	
	public ArrayList<Integer> ordena_may_menor(ArrayList<Integer> v){
		
		int[] a=new int[v.size()];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]=v.get(i);
			
		}
		
		Arrays.sort(a);
		
		ArrayList<Integer> s=new ArrayList();
		
		for (int i = 0; i < v.size(); i++) {
			
			s.add(a[i]);
			
		}
		
		return s;
		
	}
	public ArrayList<Integer> ordena_men_may(ArrayList<Integer> v){
		
		int[] a=new int[v.size()];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]=v.get(i);
			
		}
		
		Arrays.sort(a);
		
		ArrayList<Integer> s=new ArrayList();
		
		for (int i =  v.size()-1; i >=0; i--) {
			
			s.add(a[i]);
			
		}
		
		return s;
		
	}
}