package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Dificil_8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		
		for (int a = 0; a < casos; a++) {
			
			Scanner sc1=new Scanner(System.in);
			
			int n=sc1.nextInt();
			
			if(n%2==0) {
				
				n+=1;
				
			}
			
			for (int i = n; i > -1; i+=2) {
				
				if(es_palindromo(i)) {
					
					if(es_primo(i)) {
						
						nums.add(i);
						break;
						
					}
					
				}
				
			}
			
		}
		
		for (int i = 0; i < casos; i++) {
			
			System.out.println(nums.get(i));
			
		}
		
	}
	
	public static boolean es_primo(int n){
		
		int c=0;
		
		boolean t_f=false;
		
		for (int i = 1; i < n+1; i++) {
			
			if(n%i==0) {
				
				c++;
				
			}
			
			if(c>2) {
				
				break;
				
			}
			
		}
		if(c==2) {
			
			t_f=true;
			
		}
		
		return t_f;
		
	}
	
	public static boolean es_palindromo(int n) {
		
		boolean t_f;
		
		String num=Integer.toString(n);
		
		ArrayList<Character> c=new ArrayList();
		
		for (int i = num.length()-1 ; i >= 0; i--) {
			
			c.add(num.charAt(i));
			
		}
		
		String num2="";
		
		for (int i = 0; i < c.size(); i++) {
			
			num2=num2+c.get(i);
			
		}
		
		if(num.equals(num2)) {
			
			t_f=true;
			
		}else {
			
			t_f=false;
			
		}
		
		return t_f;
		
	}
	
}
