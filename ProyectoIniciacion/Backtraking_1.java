package MiPaquete;

import java.util.ArrayList;

public class Backtraking_1 {

	public static void main(String[] args) {
		
		int n=4;
		
		ArrayList<Integer> nums=new ArrayList();
		
		crea_combs(nums, n);
		
	}
	
	public static void crea_combs(ArrayList<Integer> nums,int n) {
		
		if(nums.size()==n) {
			
			System.out.println(nums);
			
		}else {
			
			for (int i = 1; i < n+1; i++) {
				
				nums.add(i);
				
				if(nums.size()<=n) {
					
					crea_combs(nums, n);
					nums.remove(nums.size()-1);
				}
				
			}
			
		}
		
	}
	
}
