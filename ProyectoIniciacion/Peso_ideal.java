package MiPaquete;
import java.util.*;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do {
			
			System.out.println("Introduzca su genero(H/M)");
			
			Scanner sc1=new Scanner(System.in);
			
			genero=sc1.nextLine();
			
		}while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
	    double altura=0;
					
		System.out.println("Introduzca su altura en metros(x,xx)");
		
		Scanner sc2=new Scanner(System.in);
		
		altura=sc2.nextDouble();
		
		double peso=0;
		
		System.out.println("Introduzca su peso en kg");
		
		Scanner sc3=new Scanner(System.in);
		
		peso=sc3.nextDouble();
		
		double resultado=peso/Math.pow(altura, 2);
		
		if(genero.equalsIgnoreCase("H")) {
			
            if(resultado<20) {
				
				System.out.println("Esta usted en los huesos, como algo mas anda.");
				
			}else if(resultado<25) {
				
				System.out.println("Peso idel, enhorabuena, sigue asi!");
				
			}else if(resultado<30) {
				
				System.out.println("Hay que cuidar esa barriga y hacer mas ejercicio\nporque sino podrias tener otros problemas graves.");
				
			}else if(resultado<40) {
				
				System.out.println("Tienes ovesidad severa, acuda a un nutricionista y siga sus indicaciones,\n aunque le recomiendo que deje la creveza y los bollos por una temporada y salga a la calle a hacer ejercicio");
					
			}else if(resultado>40) {
				
				System.out.println("Acuda urgentemente a un gimnasio o morira ahogado por su propia grasa compañer@");
					
			}
			
		}else if(genero.equalsIgnoreCase("M")) {
			
            if(resultado<20) {
				
				System.out.println("Esta usted en los huesos, como algo mas anda.");
				
			}else if(resultado<24) {
				
				System.out.println("Peso idel, enhorabuena, sigue asi!");
				
			}else if(resultado<29) {
				
				System.out.println("Hay que cuidar esa barriga y hacer mas ejercicio\nporque sino podrias tener otros problemas graves.");
				
			}else if(resultado<37) {
				
				System.out.println("Tienes ovesidad severa, acuda a un nutricionista y siga sus indicaciones,\n aunque le recomiendo que deje la creveza y los bollos por una temporada y salga a la calle a hacer ejercicio");
					
			}else if(resultado>37) {
				
				System.out.println("Acuda urgentemente a un gimnasio o morira ahogado por su propia grasa compañer@");
					
			}
			
		}
		
		
		
		
	}
}
