package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Dificil_6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums_maxs=new ArrayList();
		
		Scanner sc1=new Scanner(System.in);
		
		int casos=sc1.nextInt();
		
		for (int c = 0; c < casos; c++) {
			
			Scanner sc2=new Scanner(System.in);
			
			int n=sc2.nextInt();
			
			ArrayList<ArrayList<Integer>> a=dime_sumas(n);
			int num_max;
			String nums="";
			if(a.size()==0==false) {
				
				num_max=dime_unos(convierte_a_b(a.get(0).get(0)))+dime_unos(convierte_a_b(a.get(0).get(1)));
				nums=a.get(0).get(0)+" "+a.get(0).get(1);
				for (int i = 1; i < a.size(); i++) {
					
					int num_n=dime_unos(convierte_a_b(a.get(i).get(0)))+dime_unos(convierte_a_b(a.get(i).get(1)));
					if(num_n>num_max) {
						
						num_max=num_n;
						nums=a.get(i).get(0)+" "+a.get(i).get(1);
					}
					
				}
				
			}else {
				
				num_max=1;
				
			}
			
			nums_maxs.add(num_max);
			
		}
		for (int i = 0; i < casos; i++) {
			
			System.out.println("Case "+(i+1)+": "+nums_maxs.get(i));
			
		}
	}

	public static int dime_unos(String s) {
		int n=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='1') {
				
				n++;
				
			}
			
		}
		return n;
		
	}
	
	public static ArrayList<ArrayList<Integer>> dime_sumas(int n){
		
		ArrayList<ArrayList<Integer>> a=new ArrayList();
		
		for (int i = 0; i < Math.floor(n/2)+1; i++) {
			
			for (int j = 0; j < n+1; j++) {
				
				if(i+j==n) {
					
					ArrayList<Integer> b=new ArrayList();
					b.add(i);
					b.add(j);
					a.add(b);
				}
				
			}
			
		}
		
		return a;
		
	}
	
	public static String convierte_a_b(int n) {
		
		boolean convirtiendo=true;
		
		String num_bin="";
		
		ArrayList<Integer> digits=new ArrayList();
		
		while(convirtiendo) {
			
			if(n<4) {
				
				switch (n) {
				case 3:
					
					digits.add(1);
					digits.add(1);
					
					break;
				case 2:
					
					digits.add(0);
					digits.add(1);
					
					break;
				case 1:
					
					digits.add(1);
					
					break;
				case 0:
					
					digits.add(0);
					
					break;
					
				}
				
				break;
				
			}else {
				
				digits.add(n%2);
				
				n=(int) Math.floor(n/2);
				
			}
			
		}
		
		for (int i = digits.size()-1; i >=0; i--) {
			
			num_bin=num_bin+digits.get(i);
			
		}
		
		return num_bin;
		
	}
	
}
