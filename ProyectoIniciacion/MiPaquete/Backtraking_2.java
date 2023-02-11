package MiPaquete;

import java.util.ArrayList;

public class Backtraking_2 {

	public static void main(String[] args) {
		
		int n=5;
		
		ArrayList<Integer> nums=new ArrayList();
		
		imprime_sumas(nums, n, 0);

	}

	public static void imprime_sumas(ArrayList<Integer> nums,int n,int suma) {
		
		if(suma==n) {
			
			System.out.println(nums);
			
		}else {
			
			for (int i = 1; i < n; i++) {
				
				suma+=i;
				
				if(suma<=n) {
					
					nums.add(i);
					
					imprime_sumas(nums,n,suma);
					
					nums.remove(nums.size()-1);
					
				}
				
				suma-=i;
				
			}
			
		}
		
	}
	
}
