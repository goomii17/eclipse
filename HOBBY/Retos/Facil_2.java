package Retos;

import java.util.Scanner;

public class Facil_2 {

	public static void main(String[] args) {

		boolean found=false;
		
		int mcm=0;
		double d1=0;
		double d2=0;
		double d3=0;
		int t1=0;
		int t2=0;
		int t3=0;
		double r1=0;
		double r2=0;
		double r3=0;
		
		
		System.out.println("Introduce tres numeros para hacer el mcm:");
		
		Scanner sc1 =new Scanner(System.in);
		
		int num1=sc1.nextInt();
		
		int num2=sc1.nextInt();
		
		int num3=sc1.nextInt();
		
		while(found==false) {
			
			mcm++;
			
			d1=(double)mcm/num1;
			d2=(double)mcm/num2;
			d3=(double)mcm/num3;
			t1=mcm/num1;
			t2=mcm/num2;
			t3=mcm/num3;
			
			r1=d1-t1;
			r2=d2-t2;
			r3=d3-t3;
			
			if(r1==0&&r2==0&&r3==0) {
				
				found=true;
				
			}
			
		}
		
		System.out.println(mcm);
		
	}

}
