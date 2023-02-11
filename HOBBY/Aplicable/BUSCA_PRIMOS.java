package Aplicable;

import java.util.Scanner;

public class BUSCA_PRIMOS extends Thread{

	public static void main(String[] args) {
		
		CRONO c=new CRONO();
		
		long h,numerop=0;
		
		int posicion=0,comienzo,variacion;
		
		System.out.println("\n Introduce cifras del numero primo que desea");
		
		Scanner sc1=new Scanner(System.in);
		
		int cifras=sc1.nextInt();
		
		System.out.println("\n Introduce numero de numeros primos que desea");
		
		Scanner sc2=new Scanner(System.in);
		
		int num=sc2.nextInt();
		
		System.out.println("\n Por arriba ('Si') o abajo ('Cualquier tecla')");
		
		Scanner sc3=new Scanner(System.in);
		
		if(sc3.nextLine().equalsIgnoreCase("si")) {

			comienzo=(int) (Math.pow(10, cifras)-1);
			
			variacion=-2;
			
		}else {
			
			comienzo=(int) (Math.pow(10, cifras-1)+1);
			
			variacion=2;
			
		}
		
		int[] numsp=new int[num];
		
		c.set_inicio();
		
		System.out.println("Empezamos!!");
		
		System.out.println(comienzo);
		
	for (int i = comienzo; i >-1; i+=variacion) {
		
		h=0;
		numerop=0;
		
		for (int j = 0; j < i; j++) {
			
			h++;
			
			
			if(i%h==0) {
				
				numerop++;
				
			}
			
		}
		
		if(numerop==2&&Long.toString(i).length()==cifras) {
			
			numsp[posicion]=i;
			
			posicion++;
			
		}
		
		if (posicion==num) {
			
			c.set_fin();
			
			break;
			
		}
		
		}
		
	
	for (int i = 0; i < numsp.length; i++) {
		
		System.out.println(i+1+"º: "+numsp[i]);
		
	}
	
	System.out.println("Tiempo -> "+ c.dime_tiempo());
	
	}

}

