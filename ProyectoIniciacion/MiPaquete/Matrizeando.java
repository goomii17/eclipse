package MiPaquete;
import java.util.*;
public class Matrizeando {

	public static void main(String[] args) {
		
		int [] mat_random=new int [15];
		
		for(int i=0;i<mat_random.length;i++) {
			
			double aleatorio=(Math.random()*100);
			
			int aleatorio2=(int)Math.round(aleatorio);
			
			mat_random[i]=aleatorio2;
			
		}

		for(int i=0;i<mat_random.length;i++) {
			
			System.out.println(mat_random[i]);
			
		}
		
	}


}
