package Retos;

public class primos {

	int numerop=0;
	int h=0;
	double decimal=0;
	int truncado=0;
	boolean es_primo=false;
	boolean es_divisor=false;
	
	public boolean es_primo(int num) {
		
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
