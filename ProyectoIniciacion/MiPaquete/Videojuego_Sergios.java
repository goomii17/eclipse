package MiPaquete;
import java.util.*;
public class Videojuego_Sergios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean repetir=true;
		
		System.out.println("5 intentos, el que mas se acerque gana.");	
		System.out.println("MUCHA MIERDA");		
		
		while(repetir==true) {
			
			long numero_random=Math.round((Math.random()*1000));
			
			System.out.println("Jugador 1, adelante.");
			
			Scanner sc1=new Scanner(System.in);
			
			int numeroj1=sc1.nextInt();
			
            System.out.println("Jugador 2, adelante.");
			
			Scanner sc2=new Scanner(System.in);
			
			long numeroj2=sc2.nextInt();
			
			long resta1=numeroj1-numero_random;
			
			if(resta1<0) {
				
				resta1=resta1*-1;
				
			}
			
            long resta2=numeroj2-numero_random;
			
			if(resta2<0) {
				
				resta2=resta2*-1;
				
			}

			if(resta1<resta2) {
				
				System.out.println("El jugador 1 ha ganado, el numero era: " + numero_random);
				
			}else {
				
				System.out.println("El jugador 2 ha ganado, el numero era: " + numero_random);
				
			}
			
			System.out.println("Si quieres volver a jugar pulsa 1, sino pulsa 2");
			
			Scanner sc3=new Scanner(System.in);
			
			if(sc3.nextInt()==2) {
				
				repetir=false;
				
			}
		}			
			
	}

}
