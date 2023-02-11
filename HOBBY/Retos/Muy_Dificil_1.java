package Retos;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Scanner;

public class Muy_Dificil_1 {

	public static void main(String[] args) {
		
		ArrayList<String> nums=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		
		for (int a = 0; a < casos; a++) {
			
			Scanner sc1=new Scanner(System.in);
			
			int n=sc1.nextInt();
			
			nums.add(dime_digitos(n));
			
		}
		
		for (int i = 0; i < casos; i++) {
			
			System.out.println(nums.get(i));
			
		}
		
	}

	public static String dime_digitos(int n) {
		
		MathContext mc=new MathContext(100);
		
		BigDecimal tres=new BigDecimal("3");
		
		BigDecimal cinco=new BigDecimal("5");
		
		BigDecimal bd=(tres.add(cinco.sqrt(mc))).pow(n);	
		
		String s=bd.toString();
		
		String num="";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='.') {break;}
			
			num=num+s.charAt(i);
			
		}
		
		if(num.length()>=3) {
			
			num=num.substring(num.length()-3);
			
		}else {
			
			for (int i = 0; i < 3; i++) {
				
				num="0"+num;
				
				if(num.length()==3) {break;}
				
			}
			
		}
		
		return num;
		
	}
	
}
