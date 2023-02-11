package Retos;
import java.util.ArrayList;
import java.util.Scanner;
public class Medio_3 {

	public static void main(String[] args) {
		
		ArrayList<String> rico=new ArrayList<String>();
		ArrayList<String> malo=new ArrayList<String>();
		ArrayList<String> nose=new ArrayList<String>();
		ArrayList<String[]> maloss=new ArrayList<String[]>();
		
		String[] potito;
		
		int numpot;
		
		boolean esta,siempre=true;
		
		while(siempre) {
		
		rico=new ArrayList<String>();
		malo=new ArrayList<String>();
		nose=new ArrayList<String>();
		
		Scanner sc1=new Scanner (System.in);
		
		numpot=sc1.nextInt();
		
		if(numpot==0) {break;}
		
		for (int i = 0; i < numpot; i++) {
			
			Scanner sc2=new Scanner(System.in);
			
			potito=sc2.nextLine().split(" ");
			
			if (potito[0].equalsIgnoreCase("SI:")) {
				
				for (int j = 1; j < potito.length-1; j++) {
					
					rico.add(potito[j]);
					
				}
				
			}else {
				
				for (int j = 1; j < potito.length-1; j++) {
					
					nose.add(potito[j]);
					
				}
				
			}
			
		}
		
		for (int i = 0; i < nose.size(); i++) {
			
			esta=false;
			
			for (int j = 0; j < rico.size(); j++) {
				
				if(nose.get(i).equalsIgnoreCase(rico.get(j))) {
					
					esta=true;
					
				}
				
			}
			
			if(!esta) {
				
				malo.add(nose.get(i));
				
			}
			
		}
		
		String[] mls=new String[malo.size()];
		
		for (int i = 0; i < malo.size(); i++) {
			
			mls[i]=malo.get(i);
			
		}
		
		maloss.add(mls);
		
		}
		
		for (int i = 0; i < maloss.size(); i++) {
			
			for (int j = 0; j < maloss.get(i).length; j++) {
				
				System.out.print(maloss.get(i)[j]+" ");
				
			}
			
			System.out.println();
		}
		
	}

}
