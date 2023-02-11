package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Dificil_5 {

	public static void main(String[] args) {
		
		ArrayList<String> frases=new ArrayList();
		
		System.out.println("Introduce numero de casos");
		
		Scanner sc1=new Scanner(System.in);
		
		int casos =sc1.nextInt();
		
		for (int a = 0; a < casos; a++) {
			
			System.out.println("Introduce frase a traducir a telefoniano");
			
			Scanner sc2=new Scanner(System.in);
			String s=sc2.nextLine();
			s=s.toLowerCase();
			String[] sep=s.split("");
			ArrayList<Integer> nums=new ArrayList();
			
			for (int i = 0; i < sep.length; i++) {
				
				if(i<sep.length-1) {
					
					if(dime_grupo(sep[i])==dime_grupo(sep[i+1])) {
						
						nums.add(i+1);
						
					}
					
				}
				
			}
			
			String line="";
			for (int i = 0; i < sep.length; i++) {
				
				for (int j = 0; j < nums.size(); j++) {
					
					if(i==nums.get(j)) {
						
						line=line+"-";
						
					}
					
				}
				
				line=line+sep[i];
				
			}
			
			String[] s2=line.split("");
			String fin="";
			
			for (int i = 0; i < s2.length; i++) {
				
				if(s2[i].equals("-")) {
					
					fin=fin+" ";
					
				}else {
					
					for (int j = 0; j < dime_pos(s2[i]); j++) {
						
						fin=fin+Integer.toString(dime_grupo(s2[i]));
						
					}
					
				}
				
			}
			
			frases.add(fin);
			
		}
		
		for (int i = 0; i < casos; i++) {
			
			System.out.println("Case"+(1+i)+": "+frases.get(i));
			
		}
		
	}

	public static int dime_grupo(String s) {
		int n=-1;
		switch (s) {
		case "a":
			n=2;
			break;
		case "b":
			n=2;
			break;
		case "c":
			n=2;
			break;
		case "d":
			n=3;
			break;
		case "e":
			n=3;
			break;
		case "f":
			n=3;
			break;
		case "g":
			n=4;
			break;
		case "h":
			n=4;
			break;
		case "i":
			n=4;
			break;
		case "j":
			n=5;
			break;
		case "k":
			n=5;
			break;
		case "l":
			n=5;
			break;
		case "m":
			n=6;
			break;
		case "n":
			n=6;
			break;
		case "o":
			n=6;
			break;
		case "p":
			n=7;
			break;
		case "q":
			n=7;
			break;
		case "r":
			n=7;
			break;
		case "s":
			n=7;
			break;
		case "t":
			n=8;
			break;
		case "u":
			n=8;
			break;
		case "v":
			n=8;
			break;
		case "w":
			n=9;
			break;
		case "x":
			n=9;
			break;
		case "y":
			n=9;
			break;
		case "z":
			n=9;
			break;
		case " ":
			n=0;
			break;
		}
		
		return n;
		
	}
	public static int dime_pos(String s) {
		int n=-1;
		switch (s) {
		case "a":
			n=1;
			break;
		case "b":
			n=2;
			break;
		case "c":
			n=3;
			break;
		case "d":
			n=1;
			break;
		case "e":
			n=2;
			break;
		case "f":
			n=3;
			break;
		case "g":
			n=1;
			break;
		case "h":
			n=2;
			break;
		case "i":
			n=3;
			break;
		case "j":
			n=1;
			break;
		case "k":
			n=2;
			break;
		case "l":
			n=3;
			break;
		case "m":
			n=1;
			break;
		case "n":
			n=2;
			break;
		case "o":
			n=3;
			break;
		case "p":
			n=1;
			break;
		case "q":
			n=2;
			break;
		case "r":
			n=3;
			break;
		case "s":
			n=4;
			break;
		case "t":
			n=1;
			break;
		case "u":
			n=2;
			break;
		case "v":
			n=3;
			break;
		case "w":
			n=1;
			break;
		case "x":
			n=2;
			break;
		case "y":
			n=3;
			break;
		case "z":
			n=4;
			break;
		case " ":
			n=1;
			break;
		}
		
		return n;
		
	}
}
