package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Dificil_7 {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList();
		
		String h="hola";
		
		Scanner sc1=new Scanner(System.in);
		
		int casos=sc1.nextInt();
		
		for (int e = 0; e < casos; e++) {
			
			Scanner sc2=new Scanner(System.in);
			
			String line=sc2.nextLine();
			
			line=line.toLowerCase();
			
			int c=0;
			
			for (int i = 0; i < line.length(); i++) {
				
				if(line.charAt(i)=='h') {
					
					for (int j = i+1; j < line.length(); j++) {
						
						if(line.charAt(j)=='o') {
							
							for (int j2 = j; j2 < line.length(); j2++) {
								
								if(line.charAt(j2)=='l') {
									
									for (int j21 = j2; j21 < line.length(); j21++) {
										
										if(line.charAt(j21)=='a') {
											
											c++;
											
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
			String num=Integer.toString(c);
			
			if(num.length()>=4) {
				
				num=num.substring(num.length()-4);
				
			}else {
				
				for (int i = 0; i < 4; i++) {
					
					num="0"+num;
					
					if(num.length()==4) {
						
						break;
						
					}
					
				}
				
			}
			a.add(num);
			
		}
		
		for (int i = 0; i < casos; i++) {
			
			System.out.println(a.get(i));
			
		}
		
	}
	
}
