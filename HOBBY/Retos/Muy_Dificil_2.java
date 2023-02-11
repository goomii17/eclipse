package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Muy_Dificil_2 {

	public static void main(String[] args) {
		
		//Introducir numero de vacas
		
		Scanner sc1=new Scanner(System.in);
		
		int num_vacas=sc1.nextInt();
		
		//Introducir el peso limite
		
		Scanner sc2=new Scanner(System.in);
		
		int peso_camion=sc2.nextInt();
		
		//Introducir pesos separados por comas
		
		int[] peso=new int[num_vacas];
		
		Scanner sc3=new Scanner(System.in);
		
		String[] p=sc3.nextLine().split(",");
		
		for (int i = 0; i < num_vacas; i++) {
			
			peso[i]=Integer.parseInt(p[i]);
			
		}
		
		//Introducir produccion de leche en litros separado por comas
		
		int[] leche=new int[num_vacas];
		
		Scanner sc4=new Scanner(System.in);
		
		String[] l=sc4.nextLine().split(",");
		
		for (int i = 0; i < num_vacas; i++) {
			
			leche[i]=Integer.parseInt(l[i]);
			
		}
		
		//Paso un array usado para sacar las combinaciones de vacas posibles
		ArrayList<Integer> nums=new ArrayList();
		
		busca_comb(nums, num_vacas,peso,peso_camion,leche);
		
		System.out.println(max_beneficio);
		
	}
	
	static int max_beneficio=Integer.MIN_VALUE;
	
	public static void busca_comb(ArrayList<Integer> nums,int n,int[] peso,int peso_camion,int[] leche) {
		
		if(nums.size()==n) {
			//En cada combinacion posible, si los pesos no superan
			//el peso limite, calculo el beneficio, y si es mayor que
			//el actual, lo guardo en max_beneficio
			int p=0;
			for (int i = 0; i < peso.length; i++) {
				
				if(nums.get(i)==1) {
					
					p+=peso[i];
					
				}
				
			}
			
			if(p<=peso_camion) {
				
				int b=0;
				for (int i = 0; i < leche.length; i++) {
					
					if(nums.get(i)==1) {
						
						b+=leche[i];
						
					}
					
				}
				
				if(b>=max_beneficio) {
					
					max_beneficio=b;
					
				}
				
			}
			
		}else {
			
			for (int i = 0; i < 2; i++) {
				
				nums.add(i);
				
				if(nums.size()<=n) {
					
					busca_comb(nums, n,peso,peso_camion,leche);
					nums.remove(nums.size()-1);
				}
				
			}
			
		}
		
	}
	
}
