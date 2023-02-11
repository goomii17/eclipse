package Retos;
import java.util.*;
public class Medio_5 {

	public static void main(String[] args) {
		
		leds l=new leds();
		
		int contador=-1;
		
		int segmentos=0;
		
		Scanner sc1=new Scanner (System.in);
		
		int segs=sc1.nextInt();
		
		for (int hora2 = 0; hora2 < 5; hora2++) {
			for (int hora1 = 0; hora1 < 9; hora1++) {
				for (int min2 = 0; min2 < 5; min2++) {
					for (int min1 = 0; min1 < 9; min1++) {
						for (int s2 = 0; s2 < 5; s2++) {
							for (int s1 = 0; s1 < 9; s1++) {
								
								segmentos=segmentos+l.dime_segmentos(s1)+l.dime_segmentos(s2)+l.dime_segmentos(min1)+l.dime_segmentos(min2)+l.dime_segmentos(hora1)+l.dime_segmentos(hora2);
								
								contador++;
								
								if(contador==segs) {
									System.out.println(segmentos);
									System.exit(0);
									
								}
								
							}
						}
					}
				}
			}
		}
		
		
		
	}

}

class leds{
	
	static int num;
	
	leds(){
		
		
		
	}
	
	public int dime_segmentos(int num) {
		
		if(num==0) {
			
			this.num=6;
			
		}
		if(num==1) {
			
			this.num=2;
			
		}
		if(num==2) {
			
			this.num=5;
			
		}
		if(num==3) {
			
			this.num=5;
			
		}
		if(num==4) {
			
			this.num=4;
			
		}
		if(num==5) {
			
			this.num=5;
			
		}
		if(num==6) {
			
			this.num=6;
			
		}
		if(num==7) {
			
			this.num=4;
			
		}
		if(num==8) {
			
			this.num=7;
			
		}
		if(num==9) {
			
			this.num=6;
			
		}
		
		return this.num;
		
	}
	
}