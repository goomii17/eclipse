package Aplicable;
import java.util.Scanner;

public class Dime_si_primo {
	
	public static void main(String[] args) {

		primos p=new primos();
		
		Scanner sc1=new Scanner(System.in);
		
		if(p.es_primo(sc1.nextInt())==true) {
			
			System.out.println("Es primo");
			
			
		}else {
			
			System.out.println("No es primo");
			
		}
		
	}
}



class primos {

	int numerop=0;
	int h=0;
	double decimal=0;
	int truncado=0;
	boolean es_primo=false;
	boolean es_divisor=false;
	
	public boolean es_primo(int num) {
		h=0;
		for (int i = 0; i < num; i++) {
			
			h++;
			
			decimal=(double)num/h;
			
			truncado=num/h;
			
			if(decimal-truncado==0) {
				
				numerop++;
				
			}
			
		}
		
		if(numerop==2) {
			
			es_primo=true;
			
		}
		
		return es_primo;
		
	}
	
	public boolean es_divisor(int num,int divisor) {
			
			decimal=(double)num/divisor;
			
			truncado=num/divisor;
			
			if(decimal-truncado==0) {
				
				es_divisor=true;		
			
		}
		
		return es_divisor;
		
	}
	
	public void resetear() {
		
		numerop=0;
		h=0;
	    decimal=0;
		truncado=0;
		es_primo=false;
		es_divisor=false;
		
	}
	
}
