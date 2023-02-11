package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Medio_8 {

	public static void main(String[] args) {
		
		boolean b=true;
		
		ArrayList<Long> l=new ArrayList();
		
		while(b) {
			
			Scanner sc1=new Scanner(System.in);
			
			String nums=sc1.nextLine();
			
			if(nums.equals("")) {
				
				break;
				
			}else {
				
				String[] s=nums.split(" ");
				
				ArrayList<Long> n=new ArrayList();
				
				for (int i = 0; i < s.length; i++) {
					
					if(!s[i].equals("")) {
						
						n.add(Long.parseLong(s[i]));
						
					}
					
				}
				
				long num=0;
				
				for (int i = 0; i < n.size(); i++) {
					
					num+=n.get(i);
					
				}
				
				l.add(num);
				
			}
			
		}
		
		for (int i = 0; i < l.size(); i++) {
			
			System.out.println(l.get(i));
			
		}
		
	}
	
}
