package Retos;

import java.util.Scanner;

public class Dificil_1 {

	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		
		int n=sc1.nextInt();
		String[] f=new String[n];
		for (int i = 0; i < f.length; i++) {
			
			f[i]="";
			
		}
		for (int i = 0; i < n; i++) {
			
			Scanner sc2=new Scanner(System.in);
			
			String s=sc2.nextLine();
			
			String[] l=s.split(" ");
			
			int c=l.length-1;
			
			for (int j = 0; j < l.length; j++) {
				
				f[i]=f[i]+l[c]+" ";
				c--;
				
			}
			
		}
		
		for (int i = 0; i < f.length; i++) {
			
			System.out.println("Case"+(i+1)+" : "+f[i]);
			
		}
		
	}

}
