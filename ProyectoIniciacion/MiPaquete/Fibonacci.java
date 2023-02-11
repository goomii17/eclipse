package MiPaquete;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=10;
		
		imprimeFibonacci(1, 9, 1, 1);
		
	}
	
	public static void imprimeFibonacci(int c,int n,long p,long s) {
		System.out.println(c);
		
		if(c<=n&&c>2) {
			
			long siguiente=p+s;
			
			p=s;
			
			s=siguiente;
			
			imprimeFibonacci(c+1, n, p, s);
			
		}else {
			
			System.out.println(s);
			
		}
		
		
		
	}
	
}
