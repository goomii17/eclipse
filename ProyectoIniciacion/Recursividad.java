package MiPaquete;

import java.util.ArrayList;

public class Recursividad {

	public static void main(String[] args) {
		
		int n=9;
        
		System.out.println(suma_hasta(n));
		
	}
	static int factorial=1;
	
    public static int suma_hasta(int n) {
    	
    	if(n>0) {
    		
    		factorial=factorial*n;
    		suma_hasta(n-1);
    		
    	}
    	
    	return factorial;
    }
    
}
