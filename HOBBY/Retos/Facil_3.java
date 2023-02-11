package Retos;

import java.util.Scanner;

public class Facil_3 {

	public static void main(String[] args) {
		
		primos p=new primos();

		int num;
		
		Scanner sc1=new Scanner(System.in);
		
		int casos=sc1.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			Scanner sc2=new Scanner(System.in);
			
			num=sc2.nextInt();

			System.out.print(num + " = ");
			
			for (int j = 0; j < num+1; j++) {
				
			if ((j==0)==false&&(j==1)==false) {
				
				if(p.es_divisor(num, j)&&p.es_primo(j)) {
					
					num=num/j;
					
					System.out.print(j+" ");
					
					if(num==1) {
						
						break;
						
					}
							
						j=0;

				}
				
				p.resetear();
				
			}
			
			}
				
		}
		
	}

}
